package com.bootcamp.demo.demo_sb_dto.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_sb_dto.dto.StockDto;
// import com.bootcamp.demo.demo_sb_dto.model.Stock;

public interface StockOperator {
 @GetMapping(value = "/stocks")
 List<StockDto> getStocks();

}
