package com.bootcamp.exercise2.bc_forum.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.exercise2.bc_forum.controller.UserOperator;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.dto.UserDTO;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.infra.NotFoundException;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO.CommentDTO;
import com.bootcamp.exercise2.bc_forum.mapper.UserCommentMapper;
import com.bootcamp.exercise2.bc_forum.mapper.UserMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;
import com.bootcamp.exercise2.bc_forum.service.UserService;

@RestController
public class UserControllerImpl implements UserOperator {
  @Autowired
  UserService userService;

  @Autowired
  UserMapper userMapper;

  @Autowired
  UserCommentMapper userCommentMapper;

  @Autowired

  @Override
  public List<UserDTO> getAllData() {
    List<User> users = userService.getUsers();
    List<Post> posts = userService.getPosts();
    List<Comment> comments = userService.getComments();

    // filter posts and comments
    List<UserDTO> userDTO = users.stream()//
        .map(u -> {
          List<Post> userPosts = posts.stream()//
              .filter(p -> p.getUserId() == u.getId())//
              .collect(Collectors.toList());
          List<Comment> userComments = comments.stream()//
              .filter(c -> userPosts.stream()//
                  .anyMatch(p -> p.getId() == c.getPostId()))//
              .collect(Collectors.toList());
          return userMapper.userMap(u, userPosts, userComments);
        })//
        .collect(Collectors.toList());

    return userDTO;
  }

  @Override
  public UserCommentDTO getCommentsById(int userId) {
    // Fetch data using the service
    User user = userService.getUsers().stream()//
        .filter(u -> u.getId() == userId)//
        .findFirst()//
        .get();//

    List<Post> userPosts = userService.getPosts().stream()//
        .filter(p -> p.getUserId() == userId)//
        .collect(Collectors.toList());

    List<Comment> userComments = userService.getComments().stream()//
        .filter(c -> userPosts.stream()//
            .anyMatch(p -> p.getId() == c.getPostId()))//
        .collect(Collectors.toList());

    // User mapper to convert List<CommentDTO> to List<UserCommentDTO>
    List<CommentDTO> commentDTOs = userComments.stream()//
        .map(c -> userCommentMapper.commentMap(c))//
        .collect(Collectors.toList());

    return userCommentMapper.userCommetsMap(user, commentDTOs);
  }

  @Override
  public ApiResp<List<UserEntity>> userEntity() {
    List<UserEntity> userEntities = userService.allUser();
    return ApiResp.<List<UserEntity>>builder()//
        .ok()//
        .data(userEntities)//
        .build();
  }

  @Override
  public ApiResp<UserEntity> getUserById(@RequestParam Long id) {
    UserEntity userEntity = userService.getUserEntityById(id);
    return ApiResp.<UserEntity>builder()//
        .ok()//
        .data(userEntity)//
        .build();
  }

  @Override
  public ApiResp<UserEntity> updateUserInfo(Long id, UserEntity user) {
    if (id != user.getId()) {
      throw new NotFoundException();
    }
    UserEntity userEntity = userService.updateUserInfo(id, user);
    return ApiResp.<UserEntity>builder()//
        .ok()//
        .data(userEntity)//
        .build();
  }

}

