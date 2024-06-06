package com.bootcamp.exercise2.bc_forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.repository.PostRepository;
import com.bootcamp.exercise2.bc_forum.service.PostService;

@Service
public class PostServiceImpl implements PostService {

 @Autowired
 PostRepository postRepository;

 @Override
 public PostEntity save(PostEntity post) {
  return postRepository.save(post);
 }
}
