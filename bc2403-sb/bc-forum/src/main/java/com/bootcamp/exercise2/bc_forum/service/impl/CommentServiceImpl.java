package com.bootcamp.exercise2.bc_forum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.infra.NotFoundException;
import com.bootcamp.exercise2.bc_forum.infra.Scheme;
import com.bootcamp.exercise2.bc_forum.infra.UrlBuilder;
import com.bootcamp.exercise2.bc_forum.mapper.EntityMapper;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.repository.CommentRepository;
import com.bootcamp.exercise2.bc_forum.repository.PostRepository;
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
  PostRepository postRepository;

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

  @Override
  public List<CommentEntity> getAllComment() {
    return commentRepository.findAll();
  }

  @Override
  public List<CommentEntity> getCommentbyPostId(Long postId) {
    Optional<PostEntity> postEntityId = postRepository.findById(postId);
    if (postEntityId.isPresent())
      return commentRepository.findByPostId(postId);
    throw new NotFoundException();
  }

  @Override
  public CommentEntity addNewCommentByPostId(long postId,
      CommentEntity commentEntity) {
    Optional<PostEntity> postEntityId = postRepository.findById(postId);
    if (postEntityId.isPresent()) {
      commentEntity.setPost(postEntityId.get());
      return commentRepository.save(commentEntity);
    }
    throw new NotFoundException();
  }

  @Override
  public CommentEntity delCommentByCommentId(long commentId) {
    Optional<CommentEntity> commentEntityId =
        commentRepository.findById(commentId);
    if (commentEntityId.isPresent()) {
      commentRepository.deleteById(commentId);;
      return commentEntityId.get();
    }
    throw new NotFoundException();
  }

  @Override
  public CommentEntity editCommentBody(Long id, CommentEntity comment) {
    Optional<CommentEntity> commentId = commentRepository.findById(id);
    if (commentId.isPresent()) {
      CommentEntity commentEntity = commentId.get();
      commentEntity.setBody(comment.getBody());
      commentRepository.save(commentEntity);
      return commentEntity;
    }
    throw new NotFoundException();
  }


}
