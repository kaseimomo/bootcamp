package com.bootcamp.demo.demo_sb_dto.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_dto.controller.StockOperator;
import com.bootcamp.demo.demo_sb_dto.dto.StockDTO;
import com.bootcamp.demo.demo_sb_dto.infra.NotFoundException;
import com.bootcamp.demo.demo_sb_dto.model.Stock;
// import com.bootcamp.demo.demo_sb_dto.model.Stock;
import com.bootcamp.demo.demo_sb_dto.service.StockService;
import com.bootcamp.demo.demo_sb_dto.service.impl.StockServiceImpl;


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
  public List<StockDTO> getStocks() {
    return stockService.getAll().stream()//
        .collect(Collectors.groupingBy(e -> e.getId(),
            Collectors.summingInt(e -> e.getQuantity())))// Map.class
        .entrySet().stream()//
        .map(e -> new StockDTO(e.getKey(), e.getValue())) //
        .collect(Collectors.toList());
  }

  @Override
  public Stock getStockById(String id) throws NotFoundException {
    // try {
    Stock stock = stockService.getById(Integer.parseInt(id));
    // } catch (NotFoundException e) {
    // } catch (NumberFormatException e) {
    // }
    return stock;
  }

  @Override
  public Stock saveStock(Stock stock, int userId) {
    return stockService.save(stock, userId);
  }

  // Demo ResponseEntity<>
  @GetMapping(value = "/test/{id}")
  public ResponseEntity<Stock> demoResponseEntity(@PathVariable String id) {
    Stock stock = null;
    try {
      stock = new StockServiceImpl().demoResponseEntity(id);
      return ResponseEntity.ok().body(stock);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(new Stock(99, "ZZZ", 0)); // 400
    }

  }

}
