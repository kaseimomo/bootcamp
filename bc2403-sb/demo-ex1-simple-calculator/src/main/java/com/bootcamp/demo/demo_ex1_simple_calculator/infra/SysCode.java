package com.bootcamp.demo.demo_ex1_simple_calculator.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SysCode {
 WRONG_INPUT(9, "Invalid Input."),
 NOT_FOUND(10, "Invalid Operation Input"),
 ;

 private int code;
 private String desc;
}
