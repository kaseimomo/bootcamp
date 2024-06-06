package com.bootcamp.exercise2.bc_forum.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.infra.RestTemplateRuntimeException;
import com.bootcamp.exercise2.bc_forum.infra.SysCode;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;
import org.springframework.http.client.ClientHttpResponse;

@Configuration
public class AppConfig {
 @Bean
 RestTemplate restTemplate(){
  return new RestTemplate();
 }

}
