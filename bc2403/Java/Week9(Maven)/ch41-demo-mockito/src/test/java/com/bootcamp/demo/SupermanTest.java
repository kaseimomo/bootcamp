package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // inject a set of annotation
public class SupermanTest {

  @Spy
  private Cat cat; // mocked cat, but with all implementation by default

  @InjectMocks // something like calling the constructor by putting the mocked cat as param
  private Superman superman;

  @Test
  void testSum() {
    when(cat.sum(98, 10)).thenReturn(1); // The follow are mock test
    assertEquals(50, superman.sum(98)); // 1 + 2
    verify(cat, times(1)).sum(98, 10);

    when(cat.sum(98, 10)).thenReturn(2);
    assertEquals(50, superman.sum(98)); // 2 + 2
    verify(cat, times(2)).sum(98, 10);

    when(cat.sum(98, 10)).thenReturn(4);
    assertEquals(99, superman.sum(98)); // 4 + 2
    verify(cat, times(3)).sum(98, 10);

    // This one is real test
    assertEquals(99, superman.sum(0));
  }

  @Test
  void testSum2() {
    when(cat.sum(94, 10)).thenReturn(0);
    assertEquals(99, superman.sum(94)); // 0 + 6
    verify(cat, times(1)).sum(94, 10);
  }

  @Test
  void testSubtract() {
    when(cat.subtract(100, 90)).thenReturn(1);
    assertEquals(99, superman.sum(90));
    assertEquals(99, superman.sum(0));

    verify(cat, times(1)).subtract(100, 90);
  }


}
