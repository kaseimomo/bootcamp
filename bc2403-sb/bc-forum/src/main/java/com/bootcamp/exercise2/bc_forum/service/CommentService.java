package com.bootcamp.exercise2.bc_forum.service;

import java.util.List;
import com.bootcamp.exercise2.bc_forum.model.Comment;

public interface CommentService {
 List<Comment> getComments();

 void fetchAndSaveComments();
}
