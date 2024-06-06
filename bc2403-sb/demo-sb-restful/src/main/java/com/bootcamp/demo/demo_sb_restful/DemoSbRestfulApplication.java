package com.bootcamp.demo.demo_sb_restful;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbRestfulApplication {

	public static void main(String[] args) {
		// Try to find a bean can be @autowired to CommandLineRunner (interface)
		// bean.run(); -> (one of the processes of SpringApplication.run)
		SpringApplication.run(DemoSbRestfulApplication.class, args);

		// double x = 10.0 / 3.0;
		// double y = BigDecimal.valueOf(10.0)//
		// 		.divide(BigDecimal.valueOf(3.0), 4, RoundingMode.HALF_UP)//
		// 		.doubleValue();
		// System.out.println(y); //3.3333

	}

}
