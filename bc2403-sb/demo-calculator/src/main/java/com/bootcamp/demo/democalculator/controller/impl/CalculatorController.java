package com.bootcamp.demo.democalculator.controller.impl;

import java.math.BigDecimal;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.democalculator.controller.CalculatorOperation;

@Controller
@ResponseBody
public class CalculatorController implements CalculatorOperation {


  // @PathVariable is a way to map the variable in the URI to java method input parameters
  @Override
  public int sum(@PathVariable(value = "a") int salary,
      @PathVariable(value = "b") int bonus) {
    return salary + bonus;
  }

  @Override
  public int subtract(@PathVariable(value = "a") int large,
      @PathVariable(value = "b") int samll) {
    return large - samll;
  }

  // We can achieve default mapping by name, if you do not explicitly define ParthVariable value
  @Override
  public int subt(@PathVariable int salary, @PathVariable int bonus) {
    return salary - bonus;
  }

  @Override
  public int multiply(@RequestParam(value = "a") int quantity,
      @RequestParam(value = "b") int price) {
    return quantity * price;
  }

  @Override
  public int divide(@RequestParam int quantity, @RequestParam int price) {
    return quantity / price;
  }

  @Override
  public double sum2(@RequestParam double q, @RequestParam double p) {
    return BigDecimal.valueOf(q).add(BigDecimal.valueOf(p)).doubleValue();
  }

  @Override
  public String sum3(@RequestParam String q, @RequestParam String p) {
    double p2 = 0.0d;
    double q2 = 0.0d;
    try {
      p2 = Double.parseDouble(p);
      q2 = Double.parseDouble(q);
    } catch (NumberFormatException e) {
      return "Both q and p should be Numbers.";
    }
    return BigDecimal.valueOf(q2).add(BigDecimal.valueOf(p2)).toString();
  }

  public static void main(String[] args) {
    CalculatorController cc = new CalculatorController();
    System.out.println(cc.sum(10, 20));
    System.out.println(cc.subt(93, 20));
    System.out.println(cc.subtract(22, 11));



  }
}
