package com.bootcamp.exercise2.bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.dto.UserDTO;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;

public interface UserOperator {
 @GetMapping(value = "/jsonplaceholder/users")
 List<UserDTO> getAllData();

 @GetMapping(value ="/jsonplaceholder/userId/comments")
 UserCommentDTO getCommentsById(@RequestParam int userId);

 @PostMapping(value = "/user")
  UserEntity saveUser(@RequestBody UserEntity user);
}
