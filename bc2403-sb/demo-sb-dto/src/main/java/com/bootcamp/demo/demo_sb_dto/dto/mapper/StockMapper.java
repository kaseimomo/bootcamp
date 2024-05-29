package com.bootcamp.demo.demo_sb_dto.dto.mapper;

import com.bootcamp.demo.demo_sb_dto.dto.StockDTO;
import com.bootcamp.demo.demo_sb_dto.model.Stock;

public class StockMapper {
  public static StockDTO mapToStockDTO(Stock stock) {
    return new StockDTO(stock.getId(), stock.getQuantity());
  }
}
