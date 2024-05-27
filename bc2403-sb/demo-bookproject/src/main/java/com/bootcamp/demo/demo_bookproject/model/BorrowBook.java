package com.bootcamp.demo.demo_bookproject.model;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class BorrowBook {
 private User user;
 private List<Book> records;
}
