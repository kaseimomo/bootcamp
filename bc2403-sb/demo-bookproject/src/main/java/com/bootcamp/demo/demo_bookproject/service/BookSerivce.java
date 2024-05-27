package com.bootcamp.demo.demo_bookproject.service;

import java.util.List;
import java.util.Optional;
import com.bootcamp.demo.demo_bookproject.model.Book;

public interface BookSerivce {
 
 // temp area
 // Optional<Book> findTempBook(String name);
 
 // 
 Optional<Book> getBook(String name);
 List<Book> getBookList();
 public Book addBook(String bookName);

}
