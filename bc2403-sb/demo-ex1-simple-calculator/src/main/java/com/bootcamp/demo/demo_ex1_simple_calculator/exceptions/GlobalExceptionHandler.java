package com.bootcamp.demo.demo_ex1_simple_calculator.exceptions;

import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.ErrorException;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.CalculateException;

@RestControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(NumberFormatException.class) // catch
 public ErrorException numberFormatExceptionHandler(NumberFormatException e) {
  return new ErrorException(9, "Invalid Input");
 }

 @ExceptionHandler(IllegalArgumentException.class) // catch
 public ErrorException illegalArgumentExceptionHandler(IllegalArgumentException e) {
  return new ErrorException(10, "Invalid Input");
 }

 // @ExceptionHandler(CalculateException.class)
 // public ErrorException calculateExceptionHandler(CalculateException e ) {
 //  return new ErrorException(e.getCode(), e.getMessage());
 // }
}
