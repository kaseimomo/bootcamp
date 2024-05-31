package com.bootcamp.demo.demo_sb_restful.dto;

import com.bootcamp.demo.demo_sb_restful.dto.UserDTO.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserPost {
 private int id;
 private String name;
 private AddressDTO address;
}
