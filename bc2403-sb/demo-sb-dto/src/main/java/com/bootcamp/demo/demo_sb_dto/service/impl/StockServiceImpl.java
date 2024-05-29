package com.bootcamp.demo.demo_sb_dto.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.demo_sb_dto.config.AppConfig;
import com.bootcamp.demo.demo_sb_dto.exceptions.ListAddExecption;
import com.bootcamp.demo.demo_sb_dto.exceptions.UserNotFoundException;
import com.bootcamp.demo.demo_sb_dto.infra.NotFoundException;
import com.bootcamp.demo.demo_sb_dto.model.Stock;
import com.bootcamp.demo.demo_sb_dto.model.User;
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

  @Override
  public Stock getById(int stockId) throws NotFoundException {
    return this.getAll().stream() //
        .filter(e -> e.getId() == stockId) //
        .findFirst() //
        .orElseThrow(() -> new NotFoundException());
  }

  @Override
  public Stock save(Stock stock, int userId) {
    // user id not found
    // add stock -> fail
    User user = appConfig.getUsers().stream() //
        .filter(e -> e.getId() == userId) //
        .findAny() //
        .orElseThrow(() -> new UserNotFoundException()); // TBC/

    if (user.add(stock))
      return stock;
    throw new ListAddExecption(); // TBC.
  }

  public Stock demoResponseEntity(String id) {
    if (id.length() == 2)
      return new Stock(1, "ABC", 2000);
    throw new IllegalArgumentException();
  }

}
