package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
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



}
