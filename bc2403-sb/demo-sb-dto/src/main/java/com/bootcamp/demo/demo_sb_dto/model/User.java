package com.bootcamp.demo.demo_sb_dto.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class User {
 private int id;
 private List<Stock> stocks;

 public static int count;

 public User() {
  this.id = count++;
  stocks = new ArrayList<>();
 }

 public boolean add(Stock stock) {
  return this.stocks.add(stock);
 }
}
