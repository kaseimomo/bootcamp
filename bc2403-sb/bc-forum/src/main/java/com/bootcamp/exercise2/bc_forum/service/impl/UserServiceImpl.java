package com.bootcamp.exercise2.bc_forum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.NotFoundException;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
// import com.bootcamp.exercise2.bc_forum.model.Comment;
// import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;
import com.bootcamp.exercise2.bc_forum.repository.CommentRepository;
import com.bootcamp.exercise2.bc_forum.repository.PostRepository;
import com.bootcamp.exercise2.bc_forum.repository.UserRepository;
import com.bootcamp.exercise2.bc_forum.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String userEndpoints;

  // @Value(value = "${api.json-place-holder.endpoints.posts}")
  // private String postEndpoints;

  // @Value(value = "${api.json-place-holder.endpoints.comments}")
  // private String commentEndpoints;

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  UserRepository userRepository;

  @Autowired
  PostRepository postRepository;

  @Autowired
  CommentRepository commentRepository;

  @Autowired
  EntityMapper entityMapper;



  @Override
  public List<User> getUsers() {
    String url = UrlBuilder.get(Scheme.HTTPS, domain, userEndpoints);
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

  // @Override
  // public List<Post> getPosts() {
  //   String url = UrlBuilder.get(Scheme.HTTPS, domain, postEndpoints);
  //   Post[] posts = restTemplate.getForObject(url, Post[].class);
  //   return Arrays.asList(posts);
  // }

  // @Override
  // public List<Comment> getComments() {
  //   String url = UrlBuilder.get(Scheme.HTTPS, domain, commentEndpoints);
  //   Comment[] comments = restTemplate.getForObject(url, Comment[].class);
  //   return Arrays.asList(comments);
  // }

  @Override
  public void fetchAndSaveUsers() {
    if (userRepository == null) {
      getUsers().stream()//
          .map(u -> entityMapper.userMapEntity(u))//
          .forEach(u -> userRepository.save(u));
    }
  }

  // @Override
  // public void fetchAndSavePosts() {
  //   if (getPosts() != null) {
  //     getPosts().stream()//
  //         .map(p -> entityMapper.postMapEntity(p))//
  //         .forEach(p -> postRepository.save(p));
  //   }
  // }

  // @Override
  // public void fetchAndSaveComments() {
  //   if (getComments() != null) {
  //     getComments().stream()//
  //         .map(c -> entityMapper.commentMapEntity(c))//
  //         .forEach(c -> commentRepository.save(c));
  //   }
  // }

  @Override
  public List<UserEntity> allUser() {
    return userRepository.findAll();
  }

  @Override
  public UserEntity getUserEntityById(Long userId) {
    Optional<UserEntity> userEntityId = userRepository.findById(userId);
    if (userEntityId.isPresent())
      return userEntityId.get();
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateUserInfo(Long id, UserEntity user) {
    Optional<UserEntity> userId = userRepository.findById(id);
    if (userId.isPresent()) {
      userRepository.save(user);
      return user;
    }
    throw new NotFoundException();
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
