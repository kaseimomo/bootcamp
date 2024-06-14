package com.bootcamp.demo.demo_sb_restful.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
 private int id;
 private String name;
 private String username;
 private String email;
 private Address address;
 private String phone;
 private String website;
 private Company company;

 @Getter
 @Setter
 public static class Address {
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private Geo geo;
 }

 @Getter
 @Setter
 public static class Company {
  private String name;
  private String catchPhrase;
  @JsonProperty(value = "bs")
  private String business;
 }

 @Getter
 @Setter
 public static class Geo {
  @JsonProperty(value = "lat")
  private String latitude;
  @JsonProperty(value = "lng")
  private String longitude;
 }

}
