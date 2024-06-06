package com.bootcamp.demo.demo_sb_restful.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.repository.UserRepository;

@Component
public class AppRunner implements CommandLineRunner{
 
// AppRunner bean already exists in Context after server start
@Autowired
private UserRepository userRepository;

// run() will be executed by Spring before completed server start process
 @Override
 public void run(String... args) {
  // System.out.println("hello");
  userRepository.save(new UserEntity());
  // throw new RuntimeException();
 }
}
