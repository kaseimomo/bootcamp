package com.bootcamp.demo.demo_ex1_simple_calculator.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
// @Setter
@EqualsAndHashCode
@AllArgsConstructor
public class CalculatorDTO {
 private String x;
 private String y;
 private String operation;
 private String result;

 // @JsonInclude(JsonInclude.Include.NON_NULL)
 // public String getResult() {
 //   return result;
 // }
}
