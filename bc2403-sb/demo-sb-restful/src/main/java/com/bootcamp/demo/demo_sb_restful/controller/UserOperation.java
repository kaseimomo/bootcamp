package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.bootcamp.demo.demo_sb_restful.model.dto.Album;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;


public interface UserOperation {

 @GetMapping(value = "/jsonplaceholder/api/users")
 List<UserDTO> getUsersApi();

 @GetMapping(value = "/jsonplaceholder/users")
 List<UserDTO> getAllUser();

 @PostMapping(value = "/jsonplaceholder/adduser")
 UserDTO addUser(@RequestBody User user);

 @GetMapping(value = "/jsonplaceholder/api/posts")
 List<Post> getPostsApi();

 @GetMapping(value = "/jsonplaceholder/api/albums")
 List<Album> getAlbumsApi();

 @PostMapping(value = "/user")
 UserEntity saveUser(UserEntity user);

 @PostMapping(value = "/post")
 PostEntity savePost(PostEntity post);

 @PostMapping(value = "/album")
 AlbumEntity saveAlbum(AlbumEntity album);

 @DeleteMapping(value = "/user")
 UserEntity deleteUser(@RequestParam Long id);

 // Similar to SQL "update user where id = ?"
 // if id exists, update the user, return the udpated user object
 // if id not exists, update nothing, return NotFoundException
 @PutMapping(value = "/user")
 ApiResp<UserEntity> updateUser(@RequestParam Long id, @RequestBody UserEntity user);

@GetMapping(value = "/user/phone")
ApiResp<UserEntity> findByPhone(@RequestParam String phone);

@PutMapping(value = "/user/email")
UserEntity updateInfoByUser(@RequestParam Long id, @RequestBody UserEntity user);

@PatchMapping(value = "/user/email")
UserEntity updateUserEmailById(@RequestParam Long id, @RequestBody UserReqDTO userReqDTO);

@GetMapping(value = "/user/email")
ApiResp<UserEntity> findByEmail(@RequestParam String email);

@GetMapping(value = "/user/orderbyname")
ApiResp<UserEntity> orderByName();

}
