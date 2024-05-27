package com.bootcamp.demo.democalculator.service;

import java.util.HashMap;
import java.util.Map;
import com.bootcamp.demo.democalculator.model.Book;

public interface BookService {
 Book getBook(String author);
 Map<Long, Book> getBookMap();
}
