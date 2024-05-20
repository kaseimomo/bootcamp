package com.bootcamp.demo.UserService;

public class UserService {
 private UserRepository userRepository;

 UserService (UserRepository userRepository) {
  this.userRepository = userRepository;
 }

 public String getUserName(int userId) {
  return userRepository.findUserById(userId);
 }
}
