package com.bootcamp.demo.democalculator.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface DatabaseOperation {
 @GetMapping(value = "/database/getValue/{index}")
 String get(String index);

 @GetMapping(value = "/database/sorting")
 void sort();

 @GetMapping(value = "/database/arr")
 String arr();

 @GetMapping(value = "/database/Family")
 Map<String, Integer> getFamilyInfo(String name, int age);
}
