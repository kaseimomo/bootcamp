package com.bootcamp.demo.demo_data_scheduler.config;

import java.time.LocalDateTime;
import org.springframework.cglib.core.Local;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppScheduler {
 
 @Scheduled(fixedDelay = 5000) // ms
 @Async
 public void sayHello() throws InterruptedException{
  System.out.println("\ntask1: Start: " + LocalDateTime.now());
  Thread.sleep(10000);
  System.out.println("task1: Hello world!");
  System.out.println("task1: end: " + LocalDateTime.now());
 }

 @Scheduled(fixedRate = 6000) //ms
 @Async
 public void sayGoodbye() throws InterruptedException {
  System.out.println("\n  task2: Start: " + LocalDateTime.now());
  Thread.sleep(5000);
  System.out.println("  task2: Goodbye!");
  System.out.println("  task2: end: " + LocalDateTime.now());
 }

 @Scheduled(cron = "0 43 17 * * MON-FRI")
 public void runTask() {
  System.out.println("cron job!!!");
 }

 
}
