package com.bootcamp.demo.demo_sb_restful.infra;

import java.time.Duration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedisHelper {
  // Encapsulate RestTemplate.class
  // 1. Remove Generics <String, String>
  // 2. remove OpsForValue()
  // 3. remove Initialize the object states (serializer)
  private RedisTemplate<String, String> redisTemplate;
  private ObjectMapper objectMapper;

  public RedisHelper(RedisConnectionFactory factory, ObjectMapper objectMapper) {
    RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(factory);
    redisTemplate.setKeySerializer(RedisSerializer.string());
    redisTemplate.setValueSerializer(RedisSerializer.json());
    redisTemplate.afterPropertiesSet();
    this.redisTemplate = redisTemplate;
    this.objectMapper = objectMapper;
  }

  // Serialization
  public <T> void set(String key, T obj) throws JsonProcessingException {
    // Object -> String
    String json = this.objectMapper.writeValueAsString(obj);
    // put string into the redis
    this.redisTemplate.opsForValue().set(key, json);
  }

  public <T> void set(String key, T obj, Duration duration)
      throws JsonProcessingException {
    String json = this.objectMapper.writeValueAsString(obj);
    this.redisTemplate.opsForValue().set(key, json, duration);
  }

  // restTemplate.getForObject(url, User[].class)
  // redisTemplate.opsForValue().get("jph-users")
  // Deserialization
  public <T> T get(String key, Class<T> clazz) throws JsonProcessingException {
    // get the string form redis
    String json = this.redisTemplate.opsForValue().get(key);
    // log.info("json : " + json.length());
    // convert the string to object, and return
    return json == null ? null : this.objectMapper.readValue(json, clazz);
  }

}
