package com.bootcamp.demo.demo_sb_restful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.UserOperation;
import com.bootcamp.demo.demo_sb_restful.dto.UserDTO;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.ApiResp;
import com.bootcamp.demo.demo_sb_restful.infra.SysCode;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.Album;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/v1")
public class UserContollerImpl implements UserOperation {

  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper mapper;


  @Override
  public List<UserDTO> getUsersApi() throws JsonProcessingException {
    return userService.getUsersApi().stream().map(mapper::apiMap)
        .collect(Collectors.toList());
  }

  @Override
  public List<UserDTO> getAllUser() throws JsonProcessingException {
    return userService.getAllUser().stream().map(mapper::map)
        .collect(Collectors.toList());
  }

  @Override
  public UserDTO addUser(@RequestBody User user) {
    return mapper.map(userService.addUser(user));
  }


  @Override
  public List<Album> getAlbumsApi() {
    return userService.getAlbumApi();
  }

  @Override
  public UserEntity saveUser(@RequestBody UserEntity user) {
    if (user.getPhone() == null) // example
      throw new RuntimeException();
    return userService.save(user);
  }


  @Override
  public AlbumEntity saveAlbum(@RequestBody AlbumEntity album) {
    return userService.save(album);
  }

  @Override
  public UserEntity deleteUser(Long id) {
    return userService.deleteById(id);
  }

  @Override
  public ApiResp<UserEntity> updateUser(Long id, UserEntity user) {
    UserEntity userEntity = userService.updateUser(id, user);
    return ApiResp.<UserEntity>builder()//
        .ok()//
        .code(SysCode.OK.getCode())//
        .data(List.of(userEntity))//
        .build();
  }

  @Override
  public ApiResp<UserEntity> findByPhone(String phone) {
    List<UserEntity> userPhone = userService.findByPhone(phone);
    return ApiResp.<UserEntity>builder()//
        .ok()//
        .code(SysCode.OK.getCode())//
        .data(userPhone)//
        .build();
  }

  @Override
  public UserEntity updateInfoByUser(Long id, UserEntity user) {
    return userService.updateInfoByUser(id, user);
  }

  @Override
  public UserEntity updateUserEmailById(Long id, UserReqDTO userReqDTO) {
    return userService.updateEmailById(id, userReqDTO);
  }

  @Override
  public ApiResp<UserEntity> findByEmail(String email) {
    List<UserEntity> userEmail = userService.findByEmail(email);
    return ApiResp.<UserEntity>builder()//
        .ok()//
        .code(SysCode.OK.getCode())//
        .data(userEmail)//
        .build();
  }

  @Override
  public ApiResp<UserEntity> orderByName() {
    List<UserEntity> orderByName = userService.findAllByOrderByName();
    return ApiResp.<UserEntity>builder() //
        .ok() //
        .code(SysCode.OK.getCode()) //
        .data(orderByName) //
        .build();
  }

}
