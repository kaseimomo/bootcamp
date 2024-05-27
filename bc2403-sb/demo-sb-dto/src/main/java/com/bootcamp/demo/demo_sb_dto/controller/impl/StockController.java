package com.bootcamp.demo.demo_sb_dto.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_dto.controller.StockOperator;
import com.bootcamp.demo.demo_sb_dto.dto.StockDto;
// import com.bootcamp.demo.demo_sb_dto.model.Stock;
import com.bootcamp.demo.demo_sb_dto.service.StockService;


@RestController
public class StockController implements StockOperator {
 // User A -> Stock 5 (1000)
 // User B -> Stock 5 (20000)
 // User C -> Stock 10 (200)

 // @PostConstruct

 @Autowired
 private StockService stockService;

 // API return
 // [{"stockNo" : 5, "quantity" :21000}, {"stockNo" : 10, "quantity" :200}]

 @Override
 public List<StockDto> getStocks() {
  return stockService.getAll().stream()//
    .collect(Collectors.groupingBy(e -> e.getId(),
      Collectors.summingInt(e -> e.getQuantity())))// Map.class
    .entrySet().stream()//
    .map(e -> new StockDto(e.getKey(), e.getValue())) //
    .collect(Collectors.toList());
 }
}
