package com.bootcamp.demo.demo_sb_restful.infra;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import lombok.AllArgsConstructor;
import lombok.Getter;

// @RestControllerAdvice // @ContollerAdvice + @ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(NullPointerException.class)
  public ErrorResponse nullPointerExceptionHandler(NullPointerException e) {
    return new ErrorResponse(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  }

  @ExceptionHandler(NumberFormatException.class) // catch
  public ErrorResponse numberNotFoundExceptionHandler(NumberFormatException e) {
    return new ErrorResponse(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  }

  @ExceptionHandler(ArithmeticException.class)
  public ErrorResponse arithmeticExceptionHandler(ArithmeticException e) {
    return new ErrorResponse(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  }

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
  //     ArithmeticException.class}) // catch
  // public ErrorResponse exceptionHandler(RuntimeException e) {
  //   if (e instanceof NullPointerException) {
  //     return ErrorResponse.of(ErrorCode.NPE.getCode(), ErrorCode.NPE.getDesc());
  //   } else if (e instanceof NumberFormatException) {
  //     return ErrorResponse.of(ErrorCode.NFE.getCode(), ErrorCode.NFE.getDesc());
  //   } else if (e instanceof ArithmeticException) {
  //     return ErrorResponse.of(ErrorCode.AE.getCode(), ErrorCode.AE.getDesc());
  //   }
  //   return ErrorResponse.of(99999, "Unhandled Exception.");
  // }

  @Getter
  @AllArgsConstructor
  private enum ErrorCode {
    NPE(99, "Null Pointer Exception."), NFE(99,
        "Number Format Exception."), AE(99, "Arithmetic Exception."),;

    private int code;
    private String desc;

  }



}
