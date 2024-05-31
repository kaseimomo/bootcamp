package com.bootcamp.demo.demo_sb_restful.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;

@Configuration
public class AppConfig {

 @Bean
 RestTemplate restTemplate() {
  return new RestTemplate();
 }

 @Bean
 List<User> users() {
  return new ArrayList<>();
 }

 
}
