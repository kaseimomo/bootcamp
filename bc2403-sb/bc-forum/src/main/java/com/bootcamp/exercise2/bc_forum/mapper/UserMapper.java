package com.bootcamp.exercise2.bc_forum.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.bootcamp.exercise2.bc_forum.dto.UserDTO;
import com.bootcamp.exercise2.bc_forum.model.Comment;
import com.bootcamp.exercise2.bc_forum.model.Post;
import com.bootcamp.exercise2.bc_forum.model.User;

@Component
public class UserMapper {

  // CommentDTO
  public UserDTO.PostDTO.CommentDTO commentMap(Comment comments) {
    return UserDTO.PostDTO.CommentDTO.builder()//
        .id(comments.getId())//
        .name(comments.getName())//
        .email(comments.getEmail())//
        .body(comments.getBody())//
        .build();
  }

  // PostDTO
  public UserDTO.PostDTO postMap(Post posts, List<Comment> comments) {
    List<UserDTO.PostDTO.CommentDTO> commentList = comments.stream() //
        .map(c -> commentMap(c))// this::commentMap
        .collect(Collectors.toList());

    return UserDTO.PostDTO.builder()//
        .id(posts.getId())//
        .title(posts.getTitle())//
        .body(posts.getBody())//
        .comments(commentList)//
        .build();
  }

  // UserDTO
  public UserDTO userMap(User users, List<Post> posts, List<Comment> comments) {
    List<UserDTO.PostDTO> postList = posts.stream()//
        .map(p -> postMap(p, comments))//
        .collect(Collectors.toList());

    UserDTO.AddressDTO.GeoDTO geoDTO = UserDTO.AddressDTO.GeoDTO.builder()//
        .latitude(users.getAddress().getGeo().getLatitude())//
        .longitude(users.getAddress().getGeo().getLongitude())//
        .build();

    UserDTO.AddressDTO addressDTO = UserDTO.AddressDTO.builder()//
        .street(users.getAddress().getStreet())//
        .suite(users.getAddress().getSuite())//
        .city(users.getAddress().getCity())//
        .zipcode(users.getAddress().getZipcode())//
        .geo(geoDTO)//
        .build();

    UserDTO.CompanyDTO companyDTO = UserDTO.CompanyDTO.builder()//
        .name(users.getCompany().getName())//
        .catchPhrase(users.getCompany().getCatchPhrase())//
        .business(users.getCompany().getBusiness())//
        .build();//

    return UserDTO.builder()//
        .id(users.getId())//
        .name(users.getName())//
        .username(users.getUsername())//
        .email(users.getEmail())//
        .address(addressDTO)//
        .phone(users.getPhone())//
        .website(users.getWebsite())//
        .company(companyDTO)//
        .posts(postList)//
        .build();
  }

//   public List<UserDTO> allUserData(List<User> users, List<Post> posts,
//       List<Comment> comments) {
//     return users.stream()//
//         .map(u -> userMap(u, posts, comments))//
//         .collect(Collectors.toList());
//   }
}
