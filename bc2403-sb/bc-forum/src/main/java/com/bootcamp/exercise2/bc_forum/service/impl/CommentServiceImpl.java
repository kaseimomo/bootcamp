package com.bootcamp.exercise2.bc_forum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.repository.CommentRepository;
import com.bootcamp.exercise2.bc_forum.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
 @Autowired
 CommentRepository commentRepository;

 @Override
 public CommentEntity save(CommentEntity comment) {
  return commentRepository.save(comment);
 }

}
