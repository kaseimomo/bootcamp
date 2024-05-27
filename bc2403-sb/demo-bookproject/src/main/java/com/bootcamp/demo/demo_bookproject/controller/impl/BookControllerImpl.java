package com.bootcamp.demo.demo_bookproject.controller.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demo_bookproject.config.AppConfig;
import com.bootcamp.demo.demo_bookproject.controller.BookOperation;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.service.BookSerivce;

@Controller
@ResponseBody
public class BookControllerImpl implements BookOperation {

 @Autowired
 public BookSerivce bookSerivce;

 @Autowired
 public AppConfig appConfig;

 @Override
 public Book findTempBooks(@PathVariable String bookName) {
  return appConfig.getBooks().stream()
    .filter(e -> e.getBookName().equals(bookName)).findFirst()
    .orElseThrow(() -> new RuntimeException("Book is not exist"));
 }

 @Override
 public List<Book> tempBookList() {
  return this.appConfig.getBooks();
 }


 @Override
 public Book findBook(@PathVariable String bookName) {
  return bookSerivce.getBook(bookName)
    .orElseThrow(() -> new RuntimeException("Book is not exist"));
 }

 @Override
 public List<Book> bookList() {
  return bookSerivce.getBookList();
 }

 @Override
 public Book addBook(@RequestParam String bookName) {
  return bookSerivce.addBook(bookName);
 }


}
