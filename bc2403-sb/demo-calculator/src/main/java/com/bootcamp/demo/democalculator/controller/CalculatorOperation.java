package com.bootcamp.demo.democalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {
 @GetMapping(value = "/sum/{a}/{b}")
 int sum(@PathVariable(value = "a") int salary,
   @PathVariable(value = "b") int bonus);

 @GetMapping(value = "/sub/{salary}/{bonus}")
 int subt(@PathVariable int salary, @PathVariable int bonus);

 @GetMapping(value = "/multiply")
 int multiply(@RequestParam(value = "a") int quantity,
   @RequestParam(value = "b") int price);

 @GetMapping(value = "/divide")
 int divide(@RequestParam int quantity, @RequestParam int price);

 @GetMapping(value = "/sum/double")
 double sum2(@RequestParam double q, @RequestParam double p);

 @GetMapping(value = "/sum/double2")
 String sum3(@RequestParam String q, @RequestParam String p);

 @PostMapping(value = "/subtract/{a}/{b}")
  int subtract(@PathVariable(value = "a") int large,
   @PathVariable(value = "b") int samll);
}
