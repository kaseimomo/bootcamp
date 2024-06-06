package com.bootcamp.demo.demo_sb_restful.entity;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Posts")
public class PostEntity {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Long id;
 private String title;
 private String body;

 // Directional Relationship
 @ManyToOne
 @JoinColumn(name = "user_id")// DB table colomn name (Foreign Key)
 @JsonBackReference // This is to make sure no loop
 private UserEntity user; // object


 // @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
 // @JsonManagedReference
 // private List<AlbumEntity> albums = new ArrayList<>();

}
