package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// We can use static import to inport all static methods of the Class.
class CalculatorTest {
 @Test
 void testSum() {
  int actual = Calculator.sum(3, 4);
  assertEquals(7, actual);
  assertEquals(-10, Calculator.sum(-1, -9));
  assertEquals(0, Calculator.sum(0, 0));

  assertNotEquals(8, Calculator.sum(3, 4));
 }

 // Test-Driven Design
 @Test
 void testSubtract() {
  // assertEquals(8, Calculator.subtract(-1, -9));
  // assertEquals(8, Calculator.subtract(10, 2));
  assertEquals(-1, Calculator.subtract(2, 3));
  // assertEquals(-1, Calculator.subtract(2, 2));
 }

 @Test
 void testSort() {
  int[] arr = new int[] {1, 4, 3, 2};
  // Assertions.assertEquals(new int[]{1,2,3,4}, Calculator.sort(arr));
  Calculator.sort(arr);
  assertArrayEquals(new int[] {1, 2, 3, 4}, Calculator.sort(arr));
 }

 @Test
 void testConcat() {
  String[] arr = new String[] {"Hello", " World", ". Thank you."};
  Calculator.concat(List.of(arr));
  assertEquals("Hello World. Thank you.", Calculator.concat(List.of(arr)));
 }

 @ParameterizedTest
 @CsvSource({"2, 1, 1", "100, 49, 51"})
 void testSumEquals(int expected, int x, int y) {
  assertEquals(expected, Calculator.sum(x, y));
 }

 @ParameterizedTest
 @CsvSource({"2, 1, 2", "100, 49, 50"})
 void testSumNotEquals(int expected, int x, int y) {
  assertNotEquals(expected, Calculator.sum(x, y));
 }

 @Test
 void testIsPalindrome() {
  assertTrue(StringChecker.isPalindrome("racar"));
  assertFalse(StringChecker.isPalindrome("raca"));
 }

 public static void main(String[] args) {
  
  
 }

}
