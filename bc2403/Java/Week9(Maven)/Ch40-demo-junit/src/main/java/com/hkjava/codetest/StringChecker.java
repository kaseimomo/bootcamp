package com.hkjava.codetest;

public class StringChecker {
 public static boolean isPalindrome(String s) {
  // "racar"
  // StringBuilder -> reverse()
  return new StringBuilder(s).reverse().toString().equals(s);
 }
}
