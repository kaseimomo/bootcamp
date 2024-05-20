package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // inject a set of annoution
public class CalculatorTest {

  @Mock
  private Cat mockedCat;
  // new Cat() ?

  @Test
  void testCalculatorSum() {
    // Let/ assume "cat.sum(8, 10)", return 100
    // cat.sum() testing already completed in CatTest.java
    // so, calculator.sum() should focus on its own logic (something + 3)
    Mockito.when(this.mockedCat.sum(8, 10)).thenReturn(100);

    Calculator calculator = new Calculator(8, mockedCat);
    int result = calculator.sum(); // -> new Cat(8, 10).sum()
    assertEquals(103, result); // not 21

    // verify() is to ensure calculator.sum() had called cat.sum().
    verify(this.mockedCat, times(1)).sum(8, 10);
  }

}