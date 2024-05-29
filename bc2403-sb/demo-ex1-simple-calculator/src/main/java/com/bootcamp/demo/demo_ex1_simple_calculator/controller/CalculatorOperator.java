package com.bootcamp.demo.demo_ex1_simple_calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.CalculatorDTO;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.CalculateException;
import com.bootcamp.demo.demo_ex1_simple_calculator.model.BodyInput;

public interface CalculatorOperator {

  @GetMapping(value = "/{x}/{y}/{operation}")
  @ResponseStatus(value = HttpStatus.OK)
  CalculatorDTO calculate(@PathVariable String x, @PathVariable String y,
      @PathVariable String operation);

  @PostMapping(value = "/operate")
  @ResponseStatus(value = HttpStatus.OK)
  CalculatorDTO calculatePost(@RequestBody BodyInput bi);


  // @PostMapping(value = "/operate")
  // @ResponseStatus(value = HttpStatus.OK)
  // ResponseEntity<CalculatorDTO> test(@RequestBody BodyInput bi);

}
