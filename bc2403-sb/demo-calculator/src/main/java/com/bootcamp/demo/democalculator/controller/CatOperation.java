package com.bootcamp.demo.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.democalculator.model.Cat;

public interface CatOperation {

 @GetMapping(value = "/cat/test")
 Cat test();

 @GetMapping(value = "/cats")
 List<Cat> getAllCat();

 @GetMapping(value = "/catsArr")
 Cat[] getArrCat();

}
