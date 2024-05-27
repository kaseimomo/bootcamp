package com.bootcamp.demo.demo_ex1_simple_calculator.controller.Impl;

import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_ex1_simple_calculator.controller.CalculatorOperator;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.CalculatorDTO;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.ErrorException;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.Operation;
import com.bootcamp.demo.demo_ex1_simple_calculator.infra.CalculateException;
import com.bootcamp.demo.demo_ex1_simple_calculator.service.CalculatorService;
import jakarta.websocket.server.PathParam;

@RestController
public class CalculatorControllerImpl implements CalculatorOperator {

 @Autowired
 private CalculatorService calculatorService;

 @Override
 public CalculatorDTO calculate(@PathVariable String x, @PathVariable String y,
   @PathVariable String operation){
  String result;
  Operation opt = Operation.valueOf(operation);
  
   switch (opt) {
    case ADD:
     result = calculatorService.add(x, y);
     return new CalculatorDTO(x, y, operation, result);
    case SUB:
     result = calculatorService.sub(x, y);
     return new CalculatorDTO(x, y, operation, result);
    case MUL:
     result = calculatorService.mul(x, y);
     return new CalculatorDTO(x, y, operation, result);
    case DIV:
     result = calculatorService.div(x, y);
     return new CalculatorDTO(x, y, operation, result);
     default:
     return new CalculatorDTO(x, y, operation, null);
   }
   
 

  }

 }




