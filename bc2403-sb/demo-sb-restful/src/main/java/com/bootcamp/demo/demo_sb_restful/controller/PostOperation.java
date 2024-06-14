package com.bootcamp.demo.demo_sb_restful.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;

public interface PostOperation {
 @PostMapping(value = "/post")
 PostEntity savePost(PostEntity post);

 @GetMapping(value = "/jsonplaceholder/api/posts")
 List<Post> getPostsApi();
}
