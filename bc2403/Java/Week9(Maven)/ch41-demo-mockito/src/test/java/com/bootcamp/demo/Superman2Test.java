package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Superman2Test {

  @Mock
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test
  void testSum() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(2);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  @Test
  void testSum2() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(3);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(99, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  @Test
  void testSum3() {
    // No mocked behavior, assume return int default value
    assertEquals(0, superman.test(10));
    verify(cat, times(1)).sum(10, 10);
  }

}