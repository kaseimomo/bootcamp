package com.bootcamp.demo.demo_sb_restful.infra;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// @RestControllerAdvice // @ContollerAdvice + @ResponseBody
public class GlobalExceptionHandler {

  // User ApiResp.class directly, instead of ErrorResponse.class
  @ExceptionHandler(NumberFormatException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResp<Void> numberNotFoundExceptionHandler(NumberFormatException e) {
    // return new ErrorResponse(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
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

  @ExceptionHandler(BusinessRuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ErrorResponse businessRuntimeExceptionHandler(
      BusinessRuntimeException e) {
    return ErrorResponse.of(e.getCode(), e.getMessage());
    // (e.getCode(), e.getMessage());
  }

  // // intcluding all other checked and unchecked exceptions
  // @ExceptionHandler(Exception.class)
  // @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  // public ErrorResponse unhandledException() {
  // return new ErrorResponse(99999, "Other unhandled exception");
  // }

  // @ExceptionHandler(IllegalArgumentException.class)
  // public ErrorResponse illegalArgumentExceptionHandler(IllegalArgumentException e) {
  // return new ErrorResponse(0, null);
  // }

  // @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
  // public ErrorResponse arrayIndexOutOfBoundsExceptionHandler(ArrayIndexOutOfBoundsException e) {
  // return new ErrorResponse(0, null);
  // }

  // @ExceptionHandler(StringIndexOutOfBoundsException.class)
  // public ErrorResponse stringIndexOutOfBoundsExceptionHandler(StringIndexOutOfBoundsException e) {
  // return new ErrorResponse(0, null);
  // }


  // @ExceptionHandler(IllegalStateException.class)
  // public ErrorResponse oillegalStateExceptionHandler (IllegalStateException e) {
  // return new ErrorResponse(0, null);
  // }

  // Alternative
  // @ExceptionHandler({NullPointerException.class, NumberFormatException.class,
  // ArithmeticException.class}) // catch
  // public ErrorResponse exceptionHandler(RuntimeException e) {
  // if (e instanceof NullPointerException) {
  // return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  // } else if (e instanceof NumberFormatException) {
  // return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  // } else if (e instanceof ArithmeticException) {
  // return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  // }
  // return ErrorResponse.of(99999, "Unhandled Exception.");
  // }

  // @Getter
  // @AllArgsConstructor
  // private enum ErrorCode {
  // NPE(99, "Null Pointer Exception."), NFE(99,
  // "Number Format Exception."), AE(99, "Arithmetic Exception."),;

  // private int code;
  // private String desc;

  // }



}
