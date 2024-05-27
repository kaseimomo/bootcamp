package com.bootcamp.demo.democalculator.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.democalculator.controller.BookOperation;
import com.bootcamp.demo.democalculator.model.Book;
import com.bootcamp.demo.democalculator.service.BookService;
import jakarta.annotation.PostConstruct;

@Service // bean
public class BookServiceFromMemoryImpl implements BookService {

 private static final Map<Long, Book> bookMap = new HashMap<>();

 @Override
 public Map<Long, Book> getBookMap() {
  return BookServiceFromMemoryImpl.bookMap;
 }

 @PostConstruct // Right after creating bookController bean and before server start completed
 public void init() {
  Book book1 = new Book("Jenny", LocalDate.of(2000, 10, 1));
  Book book2 = new Book("Charles", LocalDate.of(2010, 10, 1));
  Book book3 = new Book("Karson", LocalDate.of(2000, 10, 1));
  bookMap.put(book1.getId(), book1);
  bookMap.put(book2.getId(), book2);
  bookMap.put(book3.getId(), book3);
 }

 // @Autowired
 // private BookOperation bookOperation;


 @Override
 public Book getBook(String author) {
  if (author == null)
   return null;
  // stream ->
  return BookServiceFromMemoryImpl.bookMap.values().stream() //
    .filter(e -> author != null && e.getAuthor().equals(author)) //
    .findFirst() // return book obj
    .orElse(null);
 }
}
