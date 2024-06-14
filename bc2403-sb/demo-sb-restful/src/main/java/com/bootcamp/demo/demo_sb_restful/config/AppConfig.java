package com.bootcamp.demo.demo_sb_restful.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_restful.infra.RedisHelper;
import com.bootcamp.demo.demo_sb_restful.model.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;

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

 // Difference between using RedisTemplate and REstTemplate
 // 1. You need to define te key, value types for RedisTemplate.class
 // 2. There are set() and get() method redisTemplate object. You have to do serialization and deserialization yourself.

 @Bean
 ObjectMapper objectMapper() {
  return new ObjectMapper();
 }

 @Bean
 // RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory,
 // ObjectMapper objectMapper) {
 // RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
 // redisTemplate.setConnectionFactory(factory);
 // redisTemplate.setKeySerializer(RedisSerializer.string());
 // redisTemplate.setValueSerializer(RedisSerializer.json());
 // redisTemplate.afterPropertiesSet();
 // return redisTemplate;

 RedisHelper redisHelper(RedisConnectionFactory factory,
   ObjectMapper objectMapper) {
  return new RedisHelper(factory, objectMapper);
 }

}


