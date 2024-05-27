package com.bootcamp.demo.demo_bookproject.service;

import java.util.List;
import java.util.Optional;
import com.bootcamp.demo.demo_bookproject.model.User;

public interface UserService {
 // Temp area
 // Optional<User> getJohn(String name);
 
 // 
 Optional<User> getUser(String name);
 List<User> allUser();
 User addUser(String name);

}
