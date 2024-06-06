package com.bootcamp.exercise2.bc_forum.mapper;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO.CommentDTO;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.User;

@Component
public class UserCommentMapper {
  public CommentDTO commentMap(Comment comment) {
    return CommentDTO.builder()//
        .name(comment.getName())//
        .body(comment.getBody())//
        .email(comment.getEmail())//
        .build();
  }

  public UserCommentDTO userCommetsMap(User user, List<CommentDTO> comments) {
    return UserCommentDTO.builder()//
        .id(user.getId())//
        .username(user.getUsername())//
        .comments(comments)//
        .build();
  }
}
