package com.bootcamp.demo.demo_bookproject.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_bookproject.config.AppConfig;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.service.BookSerivce;

@Service
public class BookServiceImpl implements BookSerivce {

 public final AtomicInteger bookIdIncrement = new AtomicInteger();

 public final List<Book> books = new ArrayList<>();

 // @Autowired
 // public AppConfig appConfig;

 @Override
 public Optional<Book> getBook(String bookName) {
  return books.stream().filter(e -> e.getBookName().equals(bookName))
    .findFirst();
 }

 // @Override
 // public Optional<Book> findTempBook(String bookName) {
 // return appConfig.getBooks().stream()
 // .filter(e -> e.getBookName().equals(bookName)).findFirst();
 // }

 @Override
 public List<Book> getBookList() {
  return this.books;
 }

 @Override
 public Book addBook(String bookName) {
  int bookId = bookIdIncrement.incrementAndGet();
  Book addedBook = new Book(bookId, bookName);
  books.add(addedBook);
  return addedBook;
 }
}
