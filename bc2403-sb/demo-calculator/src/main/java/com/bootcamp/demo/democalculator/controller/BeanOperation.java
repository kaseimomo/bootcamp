package com.bootcamp.demo.democalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface BeanOperation {
 @GetMapping(value = "/beans")
 String[] getBeans();
 
}
