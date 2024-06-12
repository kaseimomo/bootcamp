package com.bootcamp.exercise2.bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.exercise2.bc_forum.dto.PostRequestDTO;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.model.Post;

public interface PostOperator {
 @GetMapping(value = "/allPost")
 ApiResp<List<PostEntity>> postEntity();

 @GetMapping(value = "/postsByUserId/{userId}")
 ApiResp<List<Post>> getPostsByUserId(@PathVariable Long userId);

 @PostMapping(value = "/AddPost/User/{userId}")
 ApiResp<Post> addPostByUserId(@PathVariable Long userId,
   @RequestBody PostRequestDTO postRequestDTO);

@DeleteMapping(value = "/DeletePost/Post/{postId}")
 ApiResp<Post> delPostByPostId(@PathVariable Long postId);
}
