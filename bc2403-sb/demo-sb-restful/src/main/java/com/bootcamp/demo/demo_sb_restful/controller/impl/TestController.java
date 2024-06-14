package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;

public class TestController {
 
 private UserService userService;

 public TestController(UserService userService) throws Exception {
  if (userService == null) {
   throw new Exception();
  }
  this.userService = userService;
 }

 // public List<User> test() {
 //  return this.userService.getUsersApi();
 // }

 public static void main(String[] args) {
  
  
 }
}
