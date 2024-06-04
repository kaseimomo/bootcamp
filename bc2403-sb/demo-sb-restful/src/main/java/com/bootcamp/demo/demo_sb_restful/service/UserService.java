package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
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

 UserEntity deleteById(Long id);

 // put
 UserEntity updateUser(Long id, UserEntity user);

 UserEntity findById(Long id);

 List<UserEntity> findByPhone(String phone);

 // put
 UserEntity updateInfoByUser(Long id, UserEntity entity);

 // patch
 UserEntity updateEmailById(Long id, UserReqDTO dto);

 List<UserEntity> findByEmail(String email);

 List<UserEntity> findAllByOrderByName();

}
