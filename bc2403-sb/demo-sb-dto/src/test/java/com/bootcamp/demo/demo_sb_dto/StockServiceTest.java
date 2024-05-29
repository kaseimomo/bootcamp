package com.bootcamp.demo.demo_sb_dto;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.bootcamp.demo.demo_sb_dto.config.AppConfig;
import com.bootcamp.demo.demo_sb_dto.model.Stock;
import com.bootcamp.demo.demo_sb_dto.model.User;
import com.bootcamp.demo.demo_sb_dto.service.StockService;

@SpringBootTest // Complete Bean Env.
public class StockServiceTest {

 @MockBean
 private AppConfig appConfig;

 @Autowired
 private StockService stockService;

 @Test
 void testSave() {
  Stock stock = new Stock(1, "MMM", 1234);

  User userA = new User();
  User userB = new User();
  List<User> users = new ArrayList<>(List.of(userA, userB));

  Mockito.when(appConfig.getUsers()).thenReturn(users);

  stockService.save(stock, 1);
  assertThat(userA.getStocks().size(), is(0));
  assertThat(userB.getStocks().size(), is(0));

  stockService.save(stock, 0);
  assertThat(userA.getStocks().size(), is(1));
  assertThat(userB.getStocks().size(), is(1));

 }

}
