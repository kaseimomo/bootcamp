package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_restful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.NotFoundException;
import com.bootcamp.demo.demo_sb_restful.infra.RedisHelper;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.model.dto.Album;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.repository.AlbumRepository;
import com.bootcamp.demo.demo_sb_restful.repository.PostRepository;
import com.bootcamp.demo.demo_sb_restful.repository.UserRepository;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

  // During the server start, bean createon process will consider @Value
  // Read the
  @Value(value = "${api.json-place-holder.domain}") // required = true
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String userEndpoints;

  // @Value(value = "${api.json-place-holder.endpoints.posts}")
  // private String postEndpoints;

  @Value(value = "${api.json-place-holder.endpoints.albums}")
  private String albumEndpoints;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private List<User> users;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AlbumRepository albumRepository;

  // @Autowired
  // private RedisTemplate<String, String> redisTemplate;

  @Autowired
  private RedisHelper redisHelper;

  @Override
  public List<User> getUsersApi() throws JsonProcessingException {
    // get from redis
    // String redisValue = redisTemplate.opsForValue().get("jph-users");
    // ObjectMapper objectMapper = new ObjectMapper();
    // if (redisValue != null) {
    // return List.of(objectMapper.readValue(redisValue, User[].class));

    // new RestTemplate().getForObject
    // 1. call API, and get json result
    // 2. Convert json result to java object (User[].class)
    // RestTemplate
    // String url = UriComponentsBuilder.newInstance() //
    // .scheme(Scheme.HTTPS.lowerCase()) // https or http
    // .host(this.domain)//
    // .path(this.userEndpoints)//
    // .toUriString(); // handle "://"

    // System.out.println("url=" + url); or log.info("Test1 check");

    // array -> JSON String
    // String json = objectMapper.writeValueAsString(apiUsers);
    // this.redisTemplate.opsForValue().set("jph-users", json, Duration.ofMinutes(1L));
    // return Arrays.asList(users);

    /*** After encapsulate 封裝RedisTemplate ***/
    User[] users = redisHelper.get("jph-users", User[].class);
    // log.info("users.length : " + users.length);
    if (users != null) {
      return List.of(users);
    }
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowerCase()) // https or http
        .host(this.domain)//
        .path(this.userEndpoints)//
        .toUriString();
    users = restTemplate.getForObject(url, User[].class);

    log.info("url=" + url);

    this.redisHelper.set("jph-users", users, Duration.ofMinutes(10L));
    log.info("finish set in redis");
    return Arrays.asList(users);
  }

  @Override
  public List<User> getAllUser() throws JsonProcessingException {
    if (users.size() == 0) {
      users.addAll(getUsersApi());
      log.info("after addAll");
    }
    return users;
  }

  @Override
  public User addUser(User user) {
    users.add(user);
    return user;
  }


  @Override
  public List<Album> getAlbumApi() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme(Scheme.HTTPS.lowerCase())//
        .host(this.domain)//
        .path(this.albumEndpoints)//
        .toUriString();
    Album[] apiAlbums = restTemplate.getForObject(url, Album[].class);
    return Arrays.asList(apiAlbums);
  }

  @Override
  public UserEntity save(UserEntity user) {
    return userRepository.save(user);
  }


  @Override
  public AlbumEntity save(AlbumEntity album) {
    return albumRepository.save(album);
  }

  @Override
  public UserEntity deleteById(Long id) { // id not exists?
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.deleteById(id);
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateUser(Long id, UserEntity user) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      user.setId(id);
      return userRepository.saveAndFlush(user);
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity findById(Long id) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent())
      return userEntity.get();
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> findByPhone(String phone) {
    List<UserEntity> userPhone =
        userRepository.findByPhoneLike("%" + phone + "%");
    if (!userPhone.isEmpty())
      return userPhone;
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateInfoByUser(Long id, UserEntity entity) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.save(entity); // similiar map put()
      return entity;
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateEmailById(Long id, UserReqDTO dto) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      UserEntity entity = userEntity.get();
      entity.setEmail(dto.getEmail());
      userRepository.save(entity); // similiar map put()
      return entity;
    }
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> findByEmail(String email) {
    List<UserEntity> userEmail =
        userRepository.findByEmailLike("%" + email + "%");;
    if (!userEmail.isEmpty())
      return userEmail;
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> findAllByOrderByName() {
    return userRepository.findAllByOrderByName();
  }


}
