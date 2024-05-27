package com.bootcamp.demo.demo_bookproject.service;

import java.util.List;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.model.BorrowBook;
import com.bootcamp.demo.demo_bookproject.model.User;


public interface BorrowBookService {
 
 List<Book> borrowBooks(String userName, String bookName);

 User getRecord(String userName);

 List<BorrowBook> allRecord();
 
}
