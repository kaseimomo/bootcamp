package com.bootcamp.demo.demo_data_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // inject
@EnableAsync
public class DemoDataSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDataSchedulerApplication.class, args);
	}

}
