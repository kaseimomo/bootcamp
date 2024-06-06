package com.bootcamp.exercise2.bc_forum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class User {
 private Long id;
 private String name;
 private String username;
 private String email;
 private Address address;
 private String phone;
 private String website;
 private Company company;

 @Getter
 public static class Address {
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private Geo geo;

  @Getter
  public static class Geo {
   @JsonProperty(value = "lat")
   private String latitude;
   @JsonProperty(value = "lng")
   private String longitude;
  }
 }

 @Getter
 public static class Company {
  private String name;
  private String catchPhrase;
  @JsonProperty(value = "bs")
  private String business;
 }
}
