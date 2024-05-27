package com.bootcamp.demo.demo_ex1_simple_calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorException{
private int code;
private String message;

}
