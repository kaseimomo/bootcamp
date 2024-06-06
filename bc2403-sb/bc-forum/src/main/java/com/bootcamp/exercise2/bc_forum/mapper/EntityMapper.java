package com.bootcamp.exercise2.bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;

@Component
public class EntityMapper {

 public UserEntity userMapEntity(User user) {
  UserEntity userEntity = new UserEntity();
  userEntity.setId(user.getId());
  userEntity.setName(user.getName());
  userEntity.setUsername(user.getUsername());
  userEntity.setEmail(user.getEmail());
  userEntity.setPhone(user.getPhone());
  userEntity.setWebsite(user.getWebsite());
  userEntity.setAddrStreet(user.getAddress().getStreet());
  userEntity.setAddrSuite(user.getAddress().getSuite());
  userEntity.setAddrCity(user.getAddress().getCity());
  userEntity.setAddrZipcode(user.getAddress().getZipcode());
  userEntity.setAddrLat(user.getAddress().getGeo().getLatitude());
  userEntity.setAddrLong(user.getAddress().getGeo().getLongitude());
  userEntity.setCompanyName(user.getCompany().getName());
  userEntity.setCompanyCatchPhrase(user.getCompany().getCatchPhrase());
  userEntity.setCompanyBS(user.getCompany().getBusiness());
  return userEntity;
 }

 public PostEntity postMapEntity(Post post) {
  UserEntity userEntity = new UserEntity();
  PostEntity postEntity = new PostEntity();
  postEntity.setId(post.getId());
  postEntity.setTitle(post.getTitle());
  postEntity.setBody(post.getBody());
  userEntity.setId(post.getUserId());
  postEntity.setUser(userEntity);
  return postEntity;
 }

 public CommentEntity commentMapEntity(Comment comment) {
  PostEntity postEntity = new PostEntity();
  CommentEntity commentEntity = new CommentEntity();
  commentEntity.setId(comment.getId());
  commentEntity.setName(comment.getName());
  commentEntity.setEmail(comment.getEmail());
  commentEntity.setBody(comment.getBody());
  postEntity.setId(comment.getPostId());
  commentEntity.setPost(postEntity);
  return commentEntity; 
 }
}
