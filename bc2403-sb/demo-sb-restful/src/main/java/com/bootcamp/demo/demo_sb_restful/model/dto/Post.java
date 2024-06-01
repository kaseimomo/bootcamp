package com.bootcamp.demo.demo_sb_restful.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
 private int userId;
 private int id;
 private String title;
 private String body;
}
