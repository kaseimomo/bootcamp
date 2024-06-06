package com.bootcamp.demo.demo_sb_restful.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.controller.PostOperation;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.service.PostService;

@RestController
public class PostControllerImpl implements PostOperation{
 
 @Autowired
 private PostService postService;

   @Override
  public PostEntity savePost(@RequestBody PostEntity post) {
    return postService.save(post);

  }
}
