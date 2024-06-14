package com.bootcamp.demo.demo_data_scheduler.config;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppScheduler2 {
 // @Scheduled(fixedDelay = 5000) // ms
 // @Async
 public void sayHello() throws InterruptedException{
  System.out.println("\ntask1: Start: " + LocalDateTime.now());
  Thread.sleep(10000);
  System.out.println("task1: Hello world!");
  System.out.println("task1: end: " + LocalDateTime.now());
 }
}
