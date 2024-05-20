package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
  
  @Test
  void testSum() {
    Cat cat = new Cat();
    Assertions.assertEquals(10, cat.sum(3, 7));
    Assertions.assertEquals(200, cat.sum(100, 100));
    Assertions.assertEquals(-1, cat.sum(9, -10));
    Assertions.assertEquals(0, cat.sum(0, 0));
  }
}