package com.bootcamp.exercise2.bc_forum.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;
import com.bootcamp.exercise2.bc_forum.repository.CommentRepository;
import com.bootcamp.exercise2.bc_forum.repository.PostRepository;
import com.bootcamp.exercise2.bc_forum.repository.UserRepository;

@Component
public class AppRunner implements CommandLineRunner {

 @Autowired
 private RestTemplate restTemplate;

 @Value(value = "${api.json-place-holder.domain}")
 private String domain;

 @Value(value = "${api.json-place-holder.endpoints.users}")
 private String userEndpoints;

 @Value(value = "${api.json-place-holder.endpoints.posts}")
 private String postEndpoints;

 @Value(value = "${api.json-place-holder.endpoints.comments}")
 private String commentEndpoints;

 @Autowired
 private UserRepository userRepository;
 @Autowired
 private PostRepository postRepository;
 @Autowired
 private CommentRepository commentRepository;

 @Autowired
 private EntityMapper entityMapper;

 @Override
 public void run(String... args) {
  fetchAndSaveUsers();
  fetchAndSavePosts();
  fetchAndSaveComments();
 }

 private void fetchAndSaveUsers() {
  String url = UrlBuilder.get(Scheme.HTTPS, domain, userEndpoints);
  User[] users = restTemplate.getForObject(url, User[].class);
  if (users != null) {
   Arrays.stream(users)//
     .map(u -> entityMapper.userMapEntity(u))//
     .forEach(u -> userRepository.save(u));
  }
 }

 private void fetchAndSavePosts() {
  String url = UrlBuilder.get(Scheme.HTTPS, domain, postEndpoints);
  Post[] posts = restTemplate.getForObject(url, Post[].class);
  if (posts != null) {
   Arrays.stream(posts)//
     .map(p -> entityMapper.postMapEntity(p))//
     .forEach(p -> postRepository.save(p));
  }
 }

 private void fetchAndSaveComments() {
  String url = UrlBuilder.get(Scheme.HTTPS, domain, commentEndpoints);
  Comment[] comments = restTemplate.getForObject(url, Comment[].class);
  if (comments != null) {
   Arrays.stream(comments)//
     .map(c -> entityMapper.commentMapEntity(c))//
     .forEach(c -> commentRepository.save(c));
  }
 }

}
