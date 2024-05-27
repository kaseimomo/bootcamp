package com.bootcamp.demo.democalculator.controller;

import java.time.LocalDate;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.democalculator.model.Book;

public interface BookOperation {

 @GetMapping(value = "/books")
 Book getBook(@RequestParam String author);

 @GetMapping(value = "/books/publishDate")
LocalDate getBookPublishDate(@RequestParam String author);


}
