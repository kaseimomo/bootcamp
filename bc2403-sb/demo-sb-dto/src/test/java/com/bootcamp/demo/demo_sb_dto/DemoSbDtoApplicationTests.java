package com.bootcamp.demo.demo_sb_dto;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import com.bootcamp.demo.demo_sb_dto.config.AppConfig;
import com.bootcamp.demo.demo_sb_dto.controller.impl.StockController;

// Test Environment
@SpringBootTest
// 1. Test @SpringBooApplication -> @ComponentScan -> Sping Context -> Server Start
// 2. 100% simulating the actual @SpringBootApplication env.
// @WebMvcTest(StockController.class)
class DemoSbDtoApplicationTests {

@Autowired
private AppConfig appConfig;

@Autowired
private StockController stockController;

	// @Test
	// void contextLoads() {
		
	// }

}
