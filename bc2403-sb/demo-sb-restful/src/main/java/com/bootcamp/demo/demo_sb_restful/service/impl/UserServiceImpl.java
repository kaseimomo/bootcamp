package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;



@Service
public class UserServiceImpl implements UserService {

 // During the server start, bean createon process will consider @Value
 // Read the
 @Value(value = "${api.json-place-holder.domain}") // required = true
 private String domain;

 @Value(value = "${api.json-place-holder.endpoints.users}")
 private String userEndpoints;

 @Value(value = "${api.json-place-holder.endpoints.posts}")
 private String postEndpoints;

 @Autowired
 private RestTemplate restTemplate;

 @Autowired
 private List<User> users;

 @Override
 public List<User> getUsersApi() {
  // RestTemplate
  String url = UriComponentsBuilder.newInstance() //
    .scheme(Scheme.HTTPS.lowerCase()) // https or http
    .host(this.domain)//
    .path(this.userEndpoints)//
    .toUriString(); // handle "://"

  // System.out.println("url=" + url);

  User[] apiUsers = restTemplate.getForObject(url, User[].class);
  // new RestTemplate().getForObject()
  // 1 . call API, and get json result
  // 2 . Covert json result to java object (User[].class)
  return Arrays.asList(apiUsers);
 }

 @Override
 public List<User> getAllUser() {
  // Get users from API
  List<User> apiUsers = getUsersApi();
  // Create a new list to hold all users
  List<User> allUsers = new ArrayList<>(apiUsers);
  // Add users from the local list
  allUsers.addAll(users);
  return allUsers;
  // return users;
 }

 // public List<User> copyApiToUsers() {
 //  List<User> apiUsers = new ArrayList<>(getUsersApi());
 //  users = apiUsers;
 //  return users;
 // }

 @Override
 public User addUser(User user) {
  users.add(user);
  return user;
 }



}
