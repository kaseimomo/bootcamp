package com.bootcamp.exercise2.bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.exercise2.bc_forum.dto.CommentRequestDTO;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.model.Comment;

public interface CommentOperator {

  @GetMapping(value = "/allComment")
  ApiResp<List<CommentEntity>> commentEntity();

  @GetMapping(value = "/GetComment")
  ApiResp<List<Comment>> getCommentsByPostId(@RequestParam Long postId);

  @PostMapping(value = "/AddComment")
  ApiResp<Comment> addCommentByPostId(@RequestParam Long postId,
      @RequestBody CommentRequestDTO commentRequestDTO);

  @PatchMapping(value = "/UpdateComment")
  ApiResp<Comment> updateCommentBody(@RequestParam Long id,
      @RequestBody CommentRequestDTO body);
}
