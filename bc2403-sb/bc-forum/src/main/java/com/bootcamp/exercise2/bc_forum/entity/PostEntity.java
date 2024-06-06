package com.bootcamp.exercise2.bc_forum.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Posts")
public class PostEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String title;
 private String body;

 @ManyToOne
 @JoinColumn(name = "user_id") // DB table column name (Foreign Key)
 // @JsonBackReference
 private UserEntity user; // object

 @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
 @JoinColumn(name = "post_id")
 private List<CommentEntity> comments = new ArrayList<>();
}
