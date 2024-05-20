package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Testing Environment
// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
class SolutionTest {

  int x = 0; // instance variable

  @BeforeAll
  static void initialize() {
    System.out.println("SolutionTest: BeforeAll()");
  }

  @BeforeEach // before each testing method
  void setup() {
    this.x = 100;
    System.out.println("SolutionTest: BeforeEach()");
  }

  // AfterAll and AfterEach
  @AfterAll
  static void close() {
    System.out.println("SolutionTest: AfterAll");
  }

  @AfterEach
  void afterEach() {
    System.out.println("SolutionTest: AfterEach");
  }

  @Test
  void testX() {
    this.x++;
    assertEquals(101, this.x);
  }

  @Test
  void testX2() {
    this.x++;
    assertEquals(101, this.x);
  }

  @Test
  void testSolution1() {
    assertEquals(2, new Solution().getTotalCount(List.of("avc", "abc")));
  }

  @Test
  void testSolution2() {
    assertEquals(0, new Solution().getTotalCount(List.of()));
  }

  // How Maven handle Test Phrase?
  public static void main(String[] args) {
    SolutionTest st1 = new SolutionTest();
    st1.testSolution1(); // success or fail
    SolutionTest st2 = new SolutionTest();
    st2.testSolution2(); // success or fail
    SolutionTest st3 = new SolutionTest();
    st3.testX(); // success or fail
    SolutionTest st4 = new SolutionTest();
    st4.testX2(); // success or fail
    // how many cases of success or failed?
  }

}
