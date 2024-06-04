package com.bootcamp.demo.demo_sb_restful.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo.demo_sb_restful.entity.UserEntity;

@Repository // bean
// Spring Framwork : Hibernate 意思係一個好宏大的interface (JobDB)
// Generate the class implementing this JPA interface
public interface UserRepository extends JpaRepository<UserEntity, Long> {

 // JPA + Hibernate, generate corrsponding SQL syntax by method name convention rule

 // select * from users where phone = ?
 // UserEntity findByPhone(String phone);
 List<UserEntity> findByPhoneLike(String phone);

 // select * from user where addLat = ? and addLong = ?
 List<UserEntity> findByAddLatAndAddLong(String addLat, String addLong);

 // Challenge:
 // Can JPA Method Naming Convention support the following SQL syntax?
 // 1. order by
 // 2. like '%email%'
 // 3. select specific fields?
 // 4. group by? having?
 // 5. max, min, sum, avg ?

 List<UserEntity> findAllByOrderByName();

 List<UserEntity> findByEmailLike(String email);

 



}
