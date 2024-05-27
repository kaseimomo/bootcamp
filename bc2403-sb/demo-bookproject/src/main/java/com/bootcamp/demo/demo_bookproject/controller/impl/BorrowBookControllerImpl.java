package com.bootcamp.demo.demo_bookproject.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.demo_bookproject.controller.BorrowBookOperation;
import com.bootcamp.demo.demo_bookproject.model.Book;
import com.bootcamp.demo.demo_bookproject.model.BorrowBook;
import com.bootcamp.demo.demo_bookproject.model.User;
import com.bootcamp.demo.demo_bookproject.service.BorrowBookService;

@Controller
@ResponseBody
public class BorrowBookControllerImpl implements BorrowBookOperation {

 @Autowired
 public BorrowBookService borrowBookService;

 @Override
 public boolean borrowBooks(@PathVariable String userName,
   @RequestParam String bookName) {
  return borrowBookService.borrowBooks(userName, bookName) != null;
 }

 @Override
 public User userRecord(@RequestParam String userName) {
  return borrowBookService.getRecord(userName);
 }

 @Override
 public List<BorrowBook> allRecord() {
  return borrowBookService.allRecord();
 }

}
