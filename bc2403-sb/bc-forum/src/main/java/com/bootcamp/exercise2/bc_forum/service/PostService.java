package com.bootcamp.exercise2.bc_forum.service;

import java.util.List;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.model.Post;

public interface PostService {
 List<Post> getPosts();

 void fetchAndSavePosts();

 List<PostEntity> getAllPost();

 List<PostEntity> getPostbyUserId(Long UserId);

 PostEntity addNewPostByUserId(long userId, PostEntity postEntity);

 PostEntity delPostByPostId(long postId);
}
