package com.bootcamp.demo.democalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.democalculator.model.Cat;

public interface TestOperation {
 
 @GetMapping(value = "/hello")
 String testSayHello();

 @GetMapping(value = "/hello2")
 String testSayHello2();

 @GetMapping(value = "/hello3")
 String testSayHello3();

 @GetMapping(value = "/WhiteCat")
 Cat getWhiteCat();

 @GetMapping(value = "/WhiteCat2")
 String getWhiteCat2();


}
