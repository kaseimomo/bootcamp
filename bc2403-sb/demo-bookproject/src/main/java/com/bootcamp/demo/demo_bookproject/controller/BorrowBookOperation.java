package com.bootcamp.demo.demo_bookproject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.model.BorrowBook;
import com.bootcamp.demo.demo_bookproject.model.User;

public interface BorrowBookOperation {
 
 @GetMapping(value = "/borrowbooks/user/{userName}")
 boolean borrowBooks(String userName, String bookName);

 @GetMapping(value = "/borrowbooks/record")
 User userRecord(String name);

 @GetMapping(value = "/borrowbooks/allrecord")
 List<BorrowBook> allRecord();
}
