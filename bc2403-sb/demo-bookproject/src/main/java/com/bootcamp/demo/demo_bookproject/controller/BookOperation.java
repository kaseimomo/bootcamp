package com.bootcamp.demo.demo_bookproject.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_bookproject.model.Book;

public interface BookOperation {
 
 // Temp
 @GetMapping(value = "/get/bookname-temp/{bookName}")
 Book findTempBooks(String bookName); 
 
 @GetMapping(value = "/get/booklist-temp")
 List<Book> tempBookList();
 

 
 // 
 @GetMapping(value = "/get/bookname/{bookName}")
 Book findBook(String bookName);
 
 @GetMapping(value = "/get/booklist")
 List<Book> bookList();
 
 @GetMapping(value = "/add/book")
 Book addBook(String bookName);
}




