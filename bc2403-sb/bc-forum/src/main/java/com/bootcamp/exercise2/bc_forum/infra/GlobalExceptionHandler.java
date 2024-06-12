package com.bootcamp.exercise2.bc_forum.infra;

import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice // @ContollerAdvice + @ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(NumberFormatException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse numberNotFoundExceptionHandler(NumberFormatException e) {
  // return new ErrorResponse(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  // }
  public ApiResp<Void> numberNotFoundExceptionHandler(NumberFormatException e) {
    return ApiResp.<Void>builder() //
        .error(ErrorCode.NFE) //
        .build();
  }


  @ExceptionHandler(NullPointerException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse nullPointerExceptionHandler(NullPointerException e) {
  // return new ErrorResponse(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  // }
  public ApiResp<Void> nullPointerExceptionHandler(NullPointerException e) {
    return ApiResp.<Void>builder() //
        .error(ErrorCode.NPE) //
        .build();
  }

  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  // public ErrorResponse noSuchElementExceptionHandler(NoSuchElementException e) {
  // return new ErrorResponse(ErrorCode.NSH.getCode(), ErrorCode.NSH.getDesc());
  // }
  public ApiResp<Void> noSuchElementExceptionHandler(NoSuchElementException e) {
    return ApiResp.<Void>builder() //
        .error(ErrorCode.NSH) //
        .build();
  }


  @ExceptionHandler(ArithmeticException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse arithmeticExceptionHandler(ArithmeticException e) {
  // return new ErrorResponse(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  // }
  public ApiResp<Void> arithmeticExceptionHandler(ArithmeticException e) {
    return ApiResp.<Void>builder() //
        .error(ErrorCode.AE) //
        .build();
  }

  @ExceptionHandler(NoResourceFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public ApiResp<Void> noResourceFoundExceptionHandler(
      NoResourceFoundException e) {
    return ApiResp.<Void>builder()//
        .error(ErrorCode.NRF)//
        .build();
  }

  @ExceptionHandler(RestTemplateException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public ErrorResponse restTemplateExceptionHandle(RestTemplateException e) {
    // return ErrorResponse.of(3, "RestTemplate Error - JsonPlaceHolder");
    return new ErrorResponse(ErrorCode.NSH.getCode(), ErrorCode.NSH.getDesc());
  }

  @ExceptionHandler(RestTemplateRuntimeException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public ErrorResponse restTemplateRuntimeExceptionHandle(
      RestTemplateRuntimeException e) {
    // return ErrorResponse.of(3, "RestTemplate Error - JsonPlaceHolder");
    return new ErrorResponse(ErrorCode.NSH.getCode(), ErrorCode.NSH.getDesc());
  }



  // @ExceptionHandler(RuntimeException.class)
  // @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse runtimeExceptionHandle(RuntimeException e) {
  // return ErrorResponse.of(SysCode.RestTemplate_ERROR.getCode(),
  // SysCode.RestTemplate_ERROR.getDesc());
  // }

  @ExceptionHandler(BusinessRuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ErrorResponse businessRuntimeExceptionHandler(
  BusinessRuntimeException e) {
  return ErrorResponse.of(e.getCode(), e.getMessage());
  }

  // // intcluding all other checked and unchecked exceptions
  // @ExceptionHandler(Exception.class)
  // @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse unhandledException() {
  // return new ErrorResponse(99999, "Other unhandled exception");
  // }



}
