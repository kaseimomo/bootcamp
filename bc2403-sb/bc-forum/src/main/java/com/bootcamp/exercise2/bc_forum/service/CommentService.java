package com.bootcamp.exercise2.bc_forum.service;

import java.util.List;
import com.bootcamp.exercise2.bc_forum.entity.CommentEntity;
import com.bootcamp.exercise2.bc_forum.model.Comment;

public interface CommentService {
 List<Comment> getComments();

 void fetchAndSaveComments();

 List<CommentEntity> getAllComment();

 List<CommentEntity> getCommentbyPostId(Long postId);

 CommentEntity addNewCommentByPostId(long postId, CommentEntity commentEntity);

 CommentEntity delCommentByCommentId(long commentId);

 CommentEntity editCommentBody(Long id, CommentEntity comment);
}
