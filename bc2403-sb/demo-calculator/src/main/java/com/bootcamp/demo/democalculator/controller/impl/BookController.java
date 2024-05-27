package com.bootcamp.demo.democalculator.controller.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.democalculator.controller.BookOperation;
import com.bootcamp.demo.democalculator.model.Book;
import com.bootcamp.demo.democalculator.service.BookService;
import com.bootcamp.demo.democalculator.service.impl.BookServiceFromDBImpl;
import jakarta.annotation.PostConstruct;

@RestController // @Controller + @ResponseBody
public class BookController implements BookOperation{
 
// Controller layer should not contain business logic
// For example: the way to "find a book by author" is a business logic

// Controller -> call service layer

@Autowired
@Qualifier (value = "bookServiceFromDBImpl")
private BookService bookServiceFromDB;

@Autowired
@Qualifier (value = "bookServiceFromMemoryImpl")
private BookService bookServiceFromMemory;

 @Override
 public Book getBook(String author) {
  // return new BookServiceImpl().getBook("Sally Chan");
  int x = 7;
  if (x > 5) {
   return bookServiceFromDB.getBook(author);
  }
  return bookServiceFromMemory.getBook(author);
 }

 @Override
 public LocalDate getBookPublishDate(String author) {
  Book book = bookServiceFromDB.getBook(author);
  // return book.getAuthor().concat("-").concat(book.getPublishDate().toString());
  return book.getPublishDate();
 }



}
