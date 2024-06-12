package com.bootcamp.exercise2.bc_forum.exceptioin;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.exercise2.bc_forum.infra.ApiResp;
import com.bootcamp.exercise2.bc_forum.infra.ErrorCode;
import com.bootcamp.exercise2.bc_forum.infra.GlobalExceptionHandler;

@RestControllerAdvice
public class LocalExceptionHandler extends GlobalExceptionHandler{
 
 // User ApiResp.class directly, instead of ErrorResponse.class
 // @ExceptionHandler(NumberFormatException.class)
 //  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
 //  public ApiResp<Void> numberNotFoundExceptionHandler(NumberFormatException e) {
 //  return ApiResp.<Void>builder() //
 //  .error(ErrorCode.NFE) //
 //  .build();
 //  }
  
}
