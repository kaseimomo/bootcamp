package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.Album;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;

public interface UserService {
 List<User> getUsersApi();

 List<User> getAllUser();

 User addUser(User user);

 List<Post> getPostApi();

 List<Album> getAlbumApi();

 UserEntity save(UserEntity user);

 PostEntity save(PostEntity post);

 AlbumEntity save(AlbumEntity album);
}
