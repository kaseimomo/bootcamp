package com.bootcamp.exercise2.bc_forum.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommentRequestDTO {
 private String name;
 private String email;
 private String body;
}
