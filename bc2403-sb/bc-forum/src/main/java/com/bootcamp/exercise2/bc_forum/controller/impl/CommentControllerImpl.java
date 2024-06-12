package com.bootcamp.exercise2.bc_forum.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.exercise2.bc_forum.controller.CommentOperator;
import com.bootcamp.exercise2.bc_forum.dto.CommentRequestDTO;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.service.CommentService;

@RestController
public class CommentControllerImpl implements CommentOperator {

  @Autowired
  CommentService commentService;

  @Autowired
  EntityMapper entityMapper;

  @Override
  public ApiResp<List<CommentEntity>> commentEntity() {
    List<CommentEntity> comments = commentService.getAllComment();
    return ApiResp.<List<CommentEntity>>builder()//
        .ok()//
        .data(comments)//
        .build();
  }

  @Override
  public ApiResp<List<Comment>> getCommentsByPostId(Long postId) {
    List<Comment> comments = commentService.getCommentbyPostId(postId).stream()//
        .map(entityMapper::mapToComment)//
        .collect(Collectors.toList());
    return ApiResp.<List<Comment>>builder()//
        .ok()//
        .data(comments)//
        .build();
  }

  @Override
  public ApiResp<Comment> addCommentByPostId(Long postId,
      CommentRequestDTO commentRequestDTO) {
    CommentEntity newComment =
        entityMapper.mapToNewCommentDTO(commentRequestDTO);
    CommentEntity commentEntity =
        commentService.addNewCommentByPostId(postId, newComment);
    Comment comment = entityMapper.mapToComment(commentEntity);
    return ApiResp.<Comment>builder()//
        .ok()//
        .data(comment)//
        .build();
  }

  @Override
  public ApiResp<Comment> updateCommentBody(Long id, CommentRequestDTO body) {
    CommentEntity commentBody = entityMapper.updateBodyMap(body);
    CommentEntity updateBody = commentService.editCommentBody(id, commentBody);
    Comment comment = entityMapper.mapToComment(updateBody);
    return ApiResp.<Comment>builder()//
        .ok()//
        .data(comment)//
        .build();
  }

}
