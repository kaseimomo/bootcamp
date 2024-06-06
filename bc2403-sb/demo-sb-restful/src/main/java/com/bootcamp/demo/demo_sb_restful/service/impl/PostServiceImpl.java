package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;
import com.bootcamp.demo.demo_sb_restful.repository.PostRepository;
import com.bootcamp.demo.demo_sb_restful.service.PostService;

@Service
public class PostServiceImpl implements PostService{

 @Autowired
  private RestTemplate restTemplate;

 @Value(value = "${api.json-place-holder.domain}") // required = true
  private String domain;

 @Value(value = "${api.json-place-holder.endpoints.posts}")
  private String postEndpoints;

 @Autowired
  private PostRepository postRepository;
 
 @Override
  public PostEntity save(PostEntity post) {
    return postRepository.save(post);
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
}
