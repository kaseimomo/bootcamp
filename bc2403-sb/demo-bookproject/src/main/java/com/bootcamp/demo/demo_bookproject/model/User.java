package com.bootcamp.demo.demo_bookproject.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
// @AllArgsConstructor
@ToString
// @RequiredArgsConstructor
public class User {
 private int id;
 private String name;
 private List<Book> borrowBooks;

public User(int id, String name) {
 this.id = id;
 this.name = name;
}

public User(int id, String name, List<Book> borrowBooks) {
 this.id = id;
 this.name = name;
 this.borrowBooks = borrowBooks;
}


}
