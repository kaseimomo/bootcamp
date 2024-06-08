package com.bootcamp.exercise2.bc_forum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.exercise2.bc_forum.service.UserService;

@Component
public class AppRunner implements CommandLineRunner {

  @Autowired
  private UserService userService;

 @Override
 public void run(String... args) {
  userService.fetchAndSaveUsers();
  userService.fetchAndSavePosts();
  userService.fetchAndSaveComments();
 }
}
