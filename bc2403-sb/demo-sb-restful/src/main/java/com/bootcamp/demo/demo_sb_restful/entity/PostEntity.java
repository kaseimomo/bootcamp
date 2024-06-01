package com.bootcamp.demo.demo_sb_restful.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "Posts")
public class PostEntity {
 
 @Column(name = "user_Id")
 private Long userId;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String title;
 private String body;

}
