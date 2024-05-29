package com.bootcamp.demo.demo_sb_dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Stock {
 private int id;
 private String description;
 private int quantity;
}
