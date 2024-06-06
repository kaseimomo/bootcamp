package com.bootcamp.exercise2.bc_forum.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCommentDTO {
 private Long id;
 private String username;
 private List<CommentDTO> comments;

 @Getter
 @Builder
 public static class CommentDTO {
  private String name;
  private String email;
  private String body;
 }
}


