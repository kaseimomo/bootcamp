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
import com.bootcamp.demo.demo_sb_restful.entity.AlbumEntity;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.mapper.UserMapper;
import com.bootcamp.demo.demo_sb_restful.model.dto.Album;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.bootcamp.demo.demo_sb_restful.repository.AlbumRepository;
import com.bootcamp.demo.demo_sb_restful.repository.PostRepository;
import com.bootcamp.demo.demo_sb_restful.repository.UserRepository;
import com.bootcamp.demo.demo_sb_restful.service.UserService;
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

  @Value(value = "${api.json-place-holder.endpoints.posts}")
  private String postEndpoints;

  @Value(value = "${api.json-place-holder.endpoints.albums}")
  private String albumEndpoints;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private List<User> users;

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private PostRepository postRepository;
  @Autowired
  private AlbumRepository albumRepository;

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

    return Arrays.asList(apiUsers);
  }

  @Override
  public List<User> getAllUser() {
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
  public List<Post> getPostApi() {
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowerCase()) // https or http
        .host(this.domain)//
        .path(this.postEndpoints)//
        .toUriString(); // handle "://"
    Post[] apiPosts = restTemplate.getForObject(url, Post[].class);
    return Arrays.asList(apiPosts);
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
  public PostEntity save(PostEntity post) {
    return postRepository.save(post);
  }

  @Override
  public AlbumEntity save(AlbumEntity album) {
    return albumRepository.save(album);
  }

}
