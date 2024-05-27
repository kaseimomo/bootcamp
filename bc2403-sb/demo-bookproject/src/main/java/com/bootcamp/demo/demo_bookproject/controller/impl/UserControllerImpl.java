package com.bootcamp.demo.demo_bookproject.controller.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demo_bookproject.config.AppConfig;
import com.bootcamp.demo.demo_bookproject.controller.UserOperation;
import com.bootcamp.demo.demo_bookproject.model.User;
import com.bootcamp.demo.demo_bookproject.service.UserService;

@Controller
@ResponseBody
public class UserControllerImpl implements UserOperation {

  @Autowired
  private UserService userService;

  @Autowired
  private AppConfig appConfig;

  @Override
  public User findJohn(@PathVariable String name) {
    return appConfig.getUsers().stream()
        .filter(user -> user.getName().equals(name)).findFirst()
        .orElseThrow(() -> new RuntimeException("test-user is not exist"));
  }

@Override
public List<User> tempAllUser() {
  return this.appConfig.getUsers();
}

  @Override
  public User getUser(@PathVariable String name) {
    return userService.getUser(name)
        .orElseThrow(() -> new RuntimeException("user is not exist"));
  }

  @Override
  public User addUser(@RequestParam String name) {
    return userService.addUser(name);
  }

  @Override
  public List<User> allUser() {
    return userService.allUser();
  }



  // @GetMapping(value = "/user")
  // public User getJohn() {
  // return new User(2, "John");
  // }
  // public static void main(String[] args) {
  // UserControllerImpl test = new UserControllerImpl();
  // System.out.println(test.getUser("John"));

  // }
}
