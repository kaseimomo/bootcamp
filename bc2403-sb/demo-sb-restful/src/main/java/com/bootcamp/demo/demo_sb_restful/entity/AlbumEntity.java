package com.bootcamp.demo.demo_sb_restful.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Albums")
@Getter
@Setter
public class AlbumEntity {
 
 @Column(name = "user_Id")
 private Long userId;

 // @ManyToOne
 // @JoinColumn(name = "post_id")// DB table colomn name
 // @JsonBackReference
 // private UserEntity post; // object


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String title;

}
