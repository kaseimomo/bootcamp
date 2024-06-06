package com.bootcamp.demo.demo_sb_restful.controller;

import org.springframework.web.bind.annotation.PostMapping;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;

public interface PostOperation {
 @PostMapping(value = "/post")
 PostEntity savePost(PostEntity post);
}
