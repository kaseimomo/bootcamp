package com.bootcamp.demo.demo_sb_dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_sb_dto.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_dto.infra.ErrorResponse;
import com.bootcamp.demo.demo_sb_dto.infra.GlobalExceptionHandler;
import com.bootcamp.demo.demo_sb_dto.infra.NotFoundException;

@RestControllerAdvice // Bean
public class SelfGlobleExceptionHandler extends GlobalExceptionHandler {

 // try to catch NotFoundException
 // if it is caught, call this java method, it passes the input parameter as well.

 // @ExceptionHandler(NotFoundException.class) // catch
 // public ErrorResponse notFoundExceptionHandler(NotFoundException e) {
 //  return new ErrorResponse(e.getCode(), e.getMessage());
 // }

 // @ExceptionHandler(UserNotFoundException.class) // catch
 // public ErrorResponse userNotFoundExceptionHandler(NotFoundException e) {
 //  return new ErrorResponse(e.getCode(), e.getMessage());
 // }

  @ExceptionHandler(BusinessRuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
 public ErrorResponse busninessRuntimeExceptionHandler(BusinessRuntimeException e) {
  return new ErrorResponse(e.getCode(), e.getMessage());
 }

}
