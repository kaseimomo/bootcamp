package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.UserOperation;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;

@RestController
@RequestMapping(value = "/v1")
public class UserContollerImpl implements UserOperation {

 @Autowired
 private UserService userService;

 @Autowired
 private UserMapper mapper;


 @Override
 public List<UserDTO> getUsersApi() {
  return userService.getUsersApi().stream().map(mapper::apiMap)
    .collect(Collectors.toList());
 }

 @Override
 public List<UserDTO> getAllUser() {
  return userService.getAllUser().stream().map(mapper::map)
  .collect(Collectors.toList());
 }
 
 @Override
 public UserDTO addUser(@RequestBody User user) {
  return mapper.map(userService.addUser(user));
 }


}
