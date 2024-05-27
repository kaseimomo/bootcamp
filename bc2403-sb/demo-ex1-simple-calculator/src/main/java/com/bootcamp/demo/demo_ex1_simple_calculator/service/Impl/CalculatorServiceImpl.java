package com.bootcamp.demo.demo_ex1_simple_calculator.service.Impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_ex1_simple_calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

 @Override
 public String add(String x, String y) {
  double dx = Double.parseDouble(x);
  double dy = Double.parseDouble(y);
  double add =
    BigDecimal.valueOf(dx).doubleValue() + BigDecimal.valueOf(dy).doubleValue();
  return String.valueOf(add);
 }

 @Override
 public String sub(String x, String y) {
  double dx = Double.parseDouble(x);
  double dy = Double.parseDouble(y);
  double sub =
    BigDecimal.valueOf(dx).doubleValue() - BigDecimal.valueOf(dy).doubleValue();
  return String.valueOf(sub);
 }

 @Override
 public String mul(String x, String y) {
  double dx = Double.parseDouble(x);
  double dy = Double.parseDouble(y);
  double mul =
    BigDecimal.valueOf(dx).doubleValue() * BigDecimal.valueOf(dy).doubleValue();
  return String.valueOf(mul);
 }

 @Override
 public String div(String x, String y) {
  double dx = Double.parseDouble(x);
  double dy = Double.parseDouble(y);
  double div =
    BigDecimal.valueOf(dx).doubleValue() / BigDecimal.valueOf(dy).doubleValue();
  BigDecimal roundedDiv = new BigDecimal(div).setScale(5, RoundingMode.HALF_UP);
  return String.valueOf(roundedDiv);
 }



}
