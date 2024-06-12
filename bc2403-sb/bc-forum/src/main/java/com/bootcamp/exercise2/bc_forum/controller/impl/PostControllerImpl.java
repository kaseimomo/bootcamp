package com.bootcamp.exercise2.bc_forum.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.exercise2.bc_forum.controller.PostOperator;
import com.bootcamp.exercise2.bc_forum.dto.PostRequestDTO;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.infra.NotFoundException;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.service.PostService;

@RestController
public class PostControllerImpl implements PostOperator {

 @Autowired
 PostService postService;

 @Autowired
 EntityMapper entityMapper;

 @Override
 public ApiResp<List<PostEntity>> postEntity() {
  List<PostEntity> posts = postService.getAllPost();
  return ApiResp.<List<PostEntity>>builder()//
    .ok()//
    .data(posts)//
    .build();
 }

 @Override
 public ApiResp<List<Post>> getPostsByUserId(Long userId) {
  List<Post> posts = postService.getPostbyUserId(userId).stream()//
    .map(entityMapper::mapPost)//
    .collect(Collectors.toList());
  // List<PostEntity> posts = postService.getPostbyUserId(userId);
  return ApiResp.<List<Post>>builder()//
    .ok()//
    .data(posts)//
    .build();
 }

 @Override
 public ApiResp<Post> addPostByUserId(Long userId,
   PostRequestDTO postRequestDTO) {

  PostEntity newPost = entityMapper.mapToNewPostDTO(postRequestDTO);
  // Create a new DTO(for requestbody). Not able to use PostEntity as requestbody because error will occure from de- / serialization

  PostEntity postEntity = postService.addNewPostByUserId(userId, newPost);
  Post post = entityMapper.mapPost(postEntity);
  return ApiResp.<Post>builder()//
    .ok()//
    .data(post)//
    .build();
 }

 @Override
 public ApiResp<Post> delPostByPostId(Long postId) {
  PostEntity postEntity = postService.delPostByPostId(postId);
  Post post = entityMapper.mapPost(postEntity);
  return ApiResp.<Post>builder()//
    .delPass()//
    .data(post)//
    .build();
 }

}
