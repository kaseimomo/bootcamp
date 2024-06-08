package com.bootcamp.exercise2.bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.dto.UserDTO;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;

public interface UserOperator {
  @GetMapping(value = "/jsonplaceholder/users")
  List<UserDTO> getAllData();

  @GetMapping(value = "/jsonplaceholder/userId/comments")
  UserCommentDTO getCommentsById(@RequestParam int userId);

  @GetMapping(value = "/allUser")
  ApiResp<List<UserEntity>> userEntity();

  @GetMapping(value = "/userId")
  ApiResp<UserEntity> getUserById(@RequestParam Long id);

  @PutMapping(value = "/userId")
  ApiResp<UserEntity> updateUserInfo(@RequestParam Long id, @RequestBody UserEntity user);
}
