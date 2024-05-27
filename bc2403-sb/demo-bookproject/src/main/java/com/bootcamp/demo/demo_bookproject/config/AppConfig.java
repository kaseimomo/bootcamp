package com.bootcamp.demo.demo_bookproject.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.model.User;
import jakarta.annotation.PostConstruct;

@Configuration
public class AppConfig {
 private final List<User> users = new ArrayList<>();
 private final List<Book> books = new ArrayList<>();

 public List<User> getUsers() {
  return this.users;
 }

 public List<Book> getBooks() {
  return this.books;
 }

 @PostConstruct
 public void dummyUsers() {
  User user1 = new User(2, "John");
  User user2 = new User(1, "Moon");
  User user3 = new User(3, "Charles");
  users.add(user1);
  users.add(user2);
  users.add(user3);
 }

 @PostConstruct
 public void dummyBooks() {
  Book book1 = new Book(1, "HarryPorter");
  Book book2 = new Book(2, "RichDaddyPoorDaddy");
  Book book3 = new Book(3, "The Wolf of WallStreet");
  books.add(book1);
  books.add(book2);
  books.add(book3);
  
  }
}
