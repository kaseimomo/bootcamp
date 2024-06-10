package com.bootcamp.exercise2.bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.model.Post;

public interface PostOperator {
 @GetMapping(value = "/allPost")
 ApiResp<List<PostEntity>> postEntity();

 @GetMapping(value = "/postsByUserId/{userId}")
 ApiResp<List<Post>> getPostsByUserId(@PathVariable Long userId);
}
