package com.bootcamp.demo.demo_bookproject.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_bookproject.config.AppConfig;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.model.BorrowBook;
import com.bootcamp.demo.demo_bookproject.model.User;
import com.bootcamp.demo.demo_bookproject.service.BookSerivce;
import com.bootcamp.demo.demo_bookproject.service.BorrowBookService;
import com.bootcamp.demo.demo_bookproject.service.UserService;

@Service
public class BorrowBookServiceImpl implements BorrowBookService {
 private static Map<User, List<Book>> booksRecords = new ConcurrentHashMap<>();
 // ConcurrentHashMap to ensure thread safety when accessing or modifying booksRecords

 @Autowired
 private AppConfig appConfig;

 @Autowired
 private BookSerivce bookSerivce;

 @Autowired
 private UserService userService;

 // see if username isNull
 public User checkUser(String userName) {
  return appConfig.getUsers().stream().filter(e -> e.getName().equals(userName))
    .findFirst().orElse(null);
 }

 // see if bookname isNull
 public Book checkBook(String bookName) {
  return appConfig.getBooks().stream()
    .filter(e -> e.getBookName().equals(bookName)).findFirst().orElse(null);
 }

 @Override
 public List<Book> borrowBooks(String userName, String bookName) {
  User user = checkUser(userName);
  Book book = checkBook(bookName);

  if (user != null && book != null) {
   List<Book> userRecords = booksRecords.get(user);
   if (userRecords == null) {
    userRecords = new ArrayList<>(List.of());
    // userRecords.add(book);
    booksRecords.put(user, userRecords);
   }
   userRecords.add(book);
   return userRecords;

   // booksRecords.compute(checkUser(userName), (k, v) -> {
   // if (v == null) {
   // v = new ArrayList<>();
   // }
   // v.add(checkBook(bookName));
   // return v;
   // });
   // return booksRecords.get(checkUser(userName));
  }
  return null;
 }

 // public List<Book> borrowBooks(String userName, String bookName) {
 // if (userService.getUser(userName).isPresent()
 // && bookSerivce.getBook(bookName).isPresent()) {
 // return booksRecords.put(userService.getUser(userName).get(),
 // new ArrayList<>(List.of(bookSerivce.getBook(bookName).get())));
 // }
 // return null;

 @Override
 public User getRecord(String userName) {
  User user = checkUser(userName);
  if (user != null) {
   List<Book> userRocords = booksRecords.getOrDefault(user, new ArrayList<>());
   return new User(user.getId(), user.getName(), userRocords);
  } else {
   return null;
  }
 }

 @Override
 public List<BorrowBook> allRecord() {
  return booksRecords.entrySet().stream()//
    .map(entry -> new BorrowBook(entry.getKey(), entry.getValue())) //
    .collect(Collectors.toList());
 }

}
