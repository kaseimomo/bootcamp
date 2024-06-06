package com.bootcamp.exercise2.bc_forum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO.CommentDTO;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.UserCommentMapper;
import com.bootcamp.exercise2.bc_forum.mapper.UserMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;
import com.bootcamp.exercise2.bc_forum.repository.UserRepository;
import com.bootcamp.exercise2.bc_forum.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String userEndpoints;

  @Value(value = "${api.json-place-holder.endpoints.posts}")
  private String postEndpoints;

  @Value(value = "${api.json-place-holder.endpoints.comments}")
  private String commentEndpoints;

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  UserRepository userRepository;



  @Override
  public List<User> getUsers() {
    String url = UrlBuilder.get(Scheme.HTTPS, domain, userEndpoints);
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

  @Override
  public List<Post> getPosts() {
    String url = UrlBuilder.get(Scheme.HTTPS, domain, postEndpoints);
    Post[] posts = restTemplate.getForObject(url, Post[].class);
    return Arrays.asList(posts);
  }

  @Override
  public List<Comment> getComments() {
    String url = UrlBuilder.get(Scheme.HTTPS, domain, commentEndpoints);
    Comment[] comments = restTemplate.getForObject(url, Comment[].class);
    return Arrays.asList(comments);
  }

  @Override
  public UserEntity save(UserEntity user) {
    return userRepository.save(user);
  }



  // @Override
  // public UserCommentDTO getCommentById2(int userId) {
  // User user = this.getUsers().stream()//
  // .filter(e -> e.getId() == userId)//
  // .findFirst().get();

  // List<CommentDTO> targetPost = this.getPosts().stream()
  // .filter(p -> p.getUserId() == userId).collect(Collectors.toList())// List<Post> by userID
  // .stream()//
  // .flatMap(post -> this.getComments().stream() // List<Post> of List<Comment>
  // .filter(c -> c.getPostId() == post.getId())// List<Comment> by postID
  // .collect(Collectors.toList())//
  // .stream())//
  // .map(comment -> CommentDTO.builder()// List<Comment> convert to List<CommentDTO>
  // .name(comment.getName())//
  // .body(comment.getBody())//
  // .email(comment.getEmail())//
  // .build())//
  // .collect(Collectors.toList());

  // return UserCommentDTO.builder()//
  // .id(userId)//
  // .username(user.getUsername())//
  // .comments(targetPost)//
  // .build();
  // }
}
