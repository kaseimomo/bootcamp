package com.bootcamp.exercise2.bc_forum.service;

import java.util.List;
import com.bootcamp.exercise2.bc_forum.dto.UserCommentDTO;
import com.bootcamp.exercise2.bc_forum.entity.UserEntity;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;

public interface UserService {
 List<User> getUsers();

 List<Post> getPosts();

 List<Comment> getComments();

 UserEntity save(UserEntity userEntity);
 
 // UserCommentDTO getCommentById2(int id);
}
