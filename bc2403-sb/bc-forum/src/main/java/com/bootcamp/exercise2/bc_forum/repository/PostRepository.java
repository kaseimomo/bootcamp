package com.bootcamp.exercise2.bc_forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.exercise2.bc_forum.entity.PostEntity;
import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{
 List<PostEntity> findByUserId(Long id);
}
