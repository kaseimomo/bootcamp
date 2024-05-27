package com.bootcamp.demo.demo_bookproject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demo_bookproject.model.User;

public interface UserOperation {

 // temp
 @GetMapping(value = "/user/username-temp/{name}")
 User findJohn(@PathVariable String name);
 
 @GetMapping(value = "/user/allUser-temp")
 List<User> tempAllUser();
 
 // 
 @GetMapping(value = "/user/username/{name}")
 User getUser(@PathVariable String name);

 @GetMapping(value = "/user/allUser")
 List<User> allUser();
 
 @GetMapping(value = "/user/add")
 User addUser(@PathVariable String name);
}
