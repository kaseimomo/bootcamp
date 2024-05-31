package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;


public interface UserOperation {
 
 @GetMapping(value = "/jsonplaceholder/api/users")
 List<UserDTO> getUsersApi();

 @GetMapping(value = "/jsonplaceholder/users")
 List<UserDTO> getAllUser();

 @PostMapping(value = "/jsonplaceholder/adduser")
 UserDTO addUser(@RequestBody User user);

}
