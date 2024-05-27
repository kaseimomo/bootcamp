package com.bootcamp.demo.demo_sb_dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Stock {
 private int id;
 private String description;
 private int quantity;
}
