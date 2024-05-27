package com.bootcamp.demo.demo_ex1_simple_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.CalculatorDTO;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.CalculateException;

public interface CalculatorOperator {
 
 @GetMapping(value = "/{x}/{y}/{operation}")
 public CalculatorDTO calculate(@PathVariable String x, @PathVariable String y,
   @PathVariable String operation);

}
