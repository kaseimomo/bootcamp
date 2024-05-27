package com.bootcamp.demo.demo_ex1_simple_calculator.infra;

import lombok.Getter;

@Getter
public class CalculateException extends NumberFormatException{
 
 private int code;

 public CalculateException(SysCode sysCode) {
  super(sysCode.getDesc());
  this.code = sysCode.getCode();
 }
 
}
