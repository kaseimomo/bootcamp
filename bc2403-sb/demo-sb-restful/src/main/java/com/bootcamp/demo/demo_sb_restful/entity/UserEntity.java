package com.bootcamp.demo.demo_sb_restful.entity;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JPA will generate the DDL (Create Table) by the definition in Entity class

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Users")
public class UserEntity {

 @Id // Table Primary Key
 @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
 @Setter
 private Long id;
 private String name;
 @Column(name = "user_name")
 private String username;
 @Setter
 private String email;
 private String phone;
 private String website;
 @Column(name = "add_Street")
 private String addStreet;
 @Column(name = "add_Suite")
 private String addSuite;
 @Column(name = "add_City")
 private String addCity;
 @Column(name = "add_Zipcode")
 private String addZipcode;
 @Column(name = "catch_Phrase")
 private String catchPhrase;
 @Column(name = "business")
 private String business;
 @Column(name = "add_Lat")
 private String addLat;
 @Column(name = "add_Long")
 private String addLong;
 @Column(name = "company_name")
 private String companyName;
 @Column(name = "company_Catch_Phrase")
 private String companyCatchPhrase;
 @Column(name = "company_BS")
 private String companyBS;

 // /* Version */
 // // "user" is PostEntity.class sttribue
 // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
 // @JsonManagedReference
 // private List<PostEntity> posts = new ArrayList<>();

 // /* Version: Version: With reference column user_id, but without Foreign Key */
 // /* Unidirectional Relationship */
 // @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
 // @JoinColumn(name = "user_id")
 // private List<PostEntity> posts = new ArrayList<>();

}
