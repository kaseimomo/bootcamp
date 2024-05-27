package com.bootcamp.demo.democalculator.config;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.bootcamp.demo.democalculator.model.Cat;
import com.bootcamp.demo.democalculator.model.Color;

@Configuration // new AppConfig() obj to -> Spring Context
public class AppConfig {
 
 // private String name;

 public String sayHello() {
  return "hello";
 }

 // Create an obj(bean),
 @Bean
 (name = "white")
 // @Primary
 Cat createWhiteCat() {
  return new Cat("abc", 3, new Color[]{Color.WHITE} );
 }

 @Bean 
 (name = "orange")
 // @Primary
 Cat createRedCat() {
  return new Cat("def", 4, new Color[]{Color.BROWN} );
}
}
