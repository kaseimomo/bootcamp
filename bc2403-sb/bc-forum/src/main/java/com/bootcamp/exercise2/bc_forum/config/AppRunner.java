package com.bootcamp.exercise2.bc_forum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.exercise2.bc_forum.service.CommentService;
import com.bootcamp.exercise2.bc_forum.service.PostService;
import com.bootcamp.exercise2.bc_forum.service.UserService;

@Component
public class AppRunner implements CommandLineRunner {

  @Autowired
  private UserService userService;
  @Autowired
  private PostService postService;
  @Autowired
  private CommentService commentService;

 @Override
 public void run(String... args) {
  userService.fetchAndSaveUsers();
  postService.fetchAndSavePosts();
  commentService.fetchAndSaveComments();
 }
}
