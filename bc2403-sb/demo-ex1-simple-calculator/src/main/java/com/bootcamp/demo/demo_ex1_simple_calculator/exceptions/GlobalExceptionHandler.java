package com.bootcamp.demo.demo_ex1_simple_calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.ErrorException;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.CalculateException;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.SysCode;

@RestControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(NumberFormatException.class) // catch
 @ResponseStatus(HttpStatus.BAD_REQUEST)
 public ErrorException numberFormatExceptionHandler(NumberFormatException e) {
  return new ErrorException(SysCode.WRONG_INPUT.getCode(), SysCode.WRONG_INPUT.getDesc());
 }

 @ExceptionHandler(IllegalArgumentException.class) // catch
 @ResponseStatus(HttpStatus.BAD_REQUEST)
 public ErrorException illegalArgumentExceptionHandler(IllegalArgumentException e) {
  return new ErrorException(SysCode.NOT_FOUND.getCode(), SysCode.NOT_FOUND.getDesc());
 }

 // @ExceptionHandler(CalculateException.class)
 // public ErrorException calculateExceptionHandler(CalculateException e ) {
 //  return new ErrorException(e.getCode(), e.getMessage());
 // }
}
