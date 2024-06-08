package com.bootcamp.exercise2.bc_forum.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Users")
public class UserEntity {
 @Id // Table Primary Key
 @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
 private Long id;
 private String name;
 @Column(name = "user_name")
 private String username;
 private String email;

 @Column(name = "addr_street")
 private String addrStreet;
 @Column(name = "addr_suite")
 private String addrSuite;
 @Column(name = "addr_city")
 private String addrCity;
 @Column(name = "addr_zipcode")
 private String addrZipcode;
 @Column(name = "addr_lat")
 private String addrLat;
 @Column(name = "addr_long")
 private String addrLong;

 private String phone;
 private String website;

 @Column(name = "company_name")
 private String companyName;
 @Column(name = "company_catch_phrase")
 private String companyCatchPhrase;
 @Column(name = "company_bs")
 private String companyBS;


  // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  // @JsonManagedReference
  // private List<PostEntity> posts = new ArrayList<>();
}


