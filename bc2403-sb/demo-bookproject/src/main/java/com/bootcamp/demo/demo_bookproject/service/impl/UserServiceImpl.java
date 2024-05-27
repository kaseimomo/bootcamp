package com.bootcamp.demo.demo_bookproject.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_bookproject.model.User;
import com.bootcamp.demo.demo_bookproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

 private final AtomicInteger idCounter = new AtomicInteger();

 private final List<User> users = new ArrayList<>();
 
//  public List<User> getAllUsers() {
//   return this.users;
//  }

//  @Autowired
//  private AppConfig appConfig;

//  @Override
//  public Optional<User> getJohn(String name) {
//   /* use for each loop */
//   // List<User> users = appConfig.getUsers();
//   // for (User user : users) {
//   // if (user.getName().equals(name))
//   // return Optional.of(user);
//   // }
//   // return Optional.empty();

//   /* use stream */ return appConfig.getUsers().stream()
//     .filter(user -> user.getName().equals(name)).findFirst();
//  }

 @Override
 public Optional<User> getUser(String name) {
  return users.stream().filter(e -> e.getName().equals(name)).findFirst();
 }

 @Override
 public User addUser(String name) {
  int id = idCounter.incrementAndGet();
  User user = new User(id, name);
  users.add(user);
  return user;
 }

 @Override
 public List<User> allUser() {
  return this.users;
 }


}
