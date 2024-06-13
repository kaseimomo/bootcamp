package com.bootcamp.demo.demo_sb_weather.infra;

public enum Scheme {
 HTTPS("https"),
 HTTP("http"),
 ;

 public String value;

 private Scheme(String value) {
  this.value = value;
 }

 public String lowerCase() {
  return this.value.toLowerCase();
 }
}
