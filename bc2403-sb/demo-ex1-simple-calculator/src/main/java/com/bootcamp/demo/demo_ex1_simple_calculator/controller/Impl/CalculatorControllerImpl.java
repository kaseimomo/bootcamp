package com.bootcamp.demo.demo_ex1_simple_calculator.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_ex1_simple_calculator.controller.CalculatorOperator;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.CalculatorDTO;
import com.bootcamp.demo.demo_ex1_simple_calculator.dto.Operation;
import com.bootcamp.demo.demo_ex1_simple_calculator.model.BodyInput;
import com.bootcamp.demo.demo_ex1_simple_calculator.service.CalculatorService;

@RestController
public class CalculatorControllerImpl implements CalculatorOperator {

  @Autowired
  private CalculatorService calculatorService;

  @Override
  public CalculatorDTO calculate(@PathVariable String x, @PathVariable String y,
      @PathVariable String operation) {
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

  @Override
  public CalculatorDTO calculatePost(@RequestBody BodyInput bi) {
    String result;
    Operation opt = Operation.valueOf(bi.getOperation());

    switch (opt) {
      case ADD:
        result = calculatorService.add(bi.getX(), bi.getY());
        return new CalculatorDTO(bi.getX(), bi.getY(), bi.getOperation(),
            result);
      case SUB:
        result = calculatorService.sub(bi.getX(), bi.getY());
        return new CalculatorDTO(bi.getX(), bi.getY(), bi.getOperation(),
            result);
      case MUL:
        result = calculatorService.mul(bi.getX(), bi.getY());
        return new CalculatorDTO(bi.getX(), bi.getY(), bi.getOperation(),
            result);
      case DIV:
        result = calculatorService.div(bi.getX(), bi.getY());
        return new CalculatorDTO(bi.getX(), bi.getY(), bi.getOperation(),
            result);
      default:
        return new CalculatorDTO(bi.getX(), bi.getY(), bi.getOperation(), null);
    }


  }

  // @Override
  // public ResponseEntity<CalculatorDTO> test(@RequestBody BodyInput bi) {
    
  // }



}


