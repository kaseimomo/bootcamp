package com.bootcamp.exercise2.bc_forum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.NotFoundException;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.repository.PostRepository;
import com.bootcamp.exercise2.bc_forum.repository.UserRepository;
import com.bootcamp.exercise2.bc_forum.service.PostService;

@Service
public class PostServiceImpl implements PostService {

 @Value(value = "${api.json-place-holder.domain}")
 private String domain;

 @Value(value = "${api.json-place-holder.endpoints.posts}")
 private String postEndpoints;

 @Autowired
 RestTemplate restTemplate;

 @Autowired
 UserRepository userRepository;

 @Autowired
 PostRepository postRepository;

 @Autowired
 EntityMapper entityMapper;

 @Override
 public List<Post> getPosts() {
  String url = UrlBuilder.get(Scheme.HTTPS, domain, postEndpoints);
  Post[] posts = restTemplate.getForObject(url, Post[].class);
  return Arrays.asList(posts);
 }

 @Override
 public void fetchAndSavePosts() {
  if (postRepository == null) {
   getPosts().stream()//
     .map(p -> entityMapper.postMapEntity(p))//
     .forEach(p -> postRepository.save(p));
  }
 }

 @Override
 public List<PostEntity> getAllPost() {
  return postRepository.findAll();
 }

 @Override
 public List<PostEntity> getPostbyUserId(Long userId) {
  Optional<UserEntity> userEntityId = userRepository.findById(userId);
  if (userEntityId.isPresent())
   return postRepository.findByUserId(userId);
  throw new NotFoundException();
 }

 public PostEntity addNewPostByUserId(long userId, PostEntity postEntity) {
  Optional<UserEntity> userEntityId = userRepository.findById(userId);
  if (userEntityId.isPresent()) {
   postRepository.findByUserId(userId);
   return postRepository.save(postEntity);
  }
  throw new NotFoundException();
 }

}
