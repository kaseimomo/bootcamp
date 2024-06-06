package com.bootcamp.exercise2.bc_forum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Comment {
 private Long postId;
 private Long id;
 private String name;
 private String email;
 private String body;

}
