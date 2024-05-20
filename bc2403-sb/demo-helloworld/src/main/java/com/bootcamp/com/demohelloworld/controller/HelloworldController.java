package com.bootcamp.com.demohelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloworldController {
 
 // API 接口 (Application Programming Interface)
 @GetMapping(value = "/api/c1/Charles") // URI -> resource identifier
 public String hello() {
  return "Hello World!";
 }

 @GetMapping(value = "/api/c2/Charles") // URI -> resource identifier
 public String hello2() {
  return "goodbye";
 }

 public static void main(String[] args) {
  HelloworldController hc = new HelloworldController();
  System.out.println(hc.hello());
 }

}
