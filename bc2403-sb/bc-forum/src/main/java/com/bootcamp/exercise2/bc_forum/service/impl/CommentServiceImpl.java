package com.bootcamp.exercise2.bc_forum.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.repository.CommentRepository;
import com.bootcamp.exercise2.bc_forum.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

 @Value(value = "${api.json-place-holder.domain}")
 private String domain;

 @Value(value = "${api.json-place-holder.endpoints.comments}")
 private String commentEndpoints;

 @Autowired
 RestTemplate restTemplate;

 @Autowired
 CommentRepository commentRepository;

 @Autowired
 EntityMapper entityMapper;

@Override
  public List<Comment> getComments() {
    String url = UrlBuilder.get(Scheme.HTTPS, domain, commentEndpoints);
    Comment[] comments = restTemplate.getForObject(url, Comment[].class);
    return Arrays.asList(comments);
  }

  @Override
  public void fetchAndSaveComments() {
    if (commentRepository == null) {
      getComments().stream()//
          .map(c -> entityMapper.commentMapEntity(c))//
          .forEach(c -> commentRepository.save(c));
    }
  }

}
