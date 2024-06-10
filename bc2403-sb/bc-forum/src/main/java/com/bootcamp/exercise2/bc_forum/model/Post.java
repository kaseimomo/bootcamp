package com.bootcamp.exercise2.bc_forum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Post {
 private Long userId;
 private Long id;
 private String title;
 private String body;
}
