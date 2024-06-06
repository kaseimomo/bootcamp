package com.bootcamp.demo.demo_sb_restful.service;

import java.util.List;
import com.bootcamp.demo.demo_sb_restful.entity.PostEntity;
import com.bootcamp.demo.demo_sb_restful.model.dto.Post;

public interface PostService {
 List<Post> getPostApi();

 PostEntity save(PostEntity post);
}
