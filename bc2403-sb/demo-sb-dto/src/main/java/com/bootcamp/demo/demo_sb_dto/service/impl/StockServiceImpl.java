package com.bootcamp.demo.demo_sb_dto.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_sb_dto.config.AppConfig;
import com.bootcamp.demo.demo_sb_dto.model.Stock;
import com.bootcamp.demo.demo_sb_dto.service.StockService;

@Service
public class StockServiceImpl implements StockService {

 @Autowired
 private AppConfig appConfig;

 @Override
 public List<Stock> getAll() {
  return appConfig.getUsers().stream() //
    .flatMap(e -> e.getStocks().stream()) //
    .collect(Collectors.toList());
 }
}
