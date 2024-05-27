package com.bootcamp.demo.demo_ex1_simple_calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Operation {
 ADD("add"), //
 SUB("sub"), //
 MUL("mul"), //
 DIV("div");

 private String operation;

 // private Operation(String operation) {
 //  this.operation = operation;
 // }
}
