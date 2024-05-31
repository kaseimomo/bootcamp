package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;

public interface UserService {
 List<User> getUsersApi();

 List<User> getAllUser();

 User addUser(User user);

}
