package com.hkjava.codetest;

import java.util.List;

public class Calculator {

 //
 public static String concat(List<String> strings) {
  StringBuilder sb = new StringBuilder();
  for (String s : strings) {
   sb.append(s);
  }
  return sb.toString();
 }

 //
 public static int sum(int x, int y) {
  return x + y;
 }

 //
 public static int subtract(int x, int y) {
  x -= y;
  return -1; // 1000 lines....
 }

 //
 public static int[] sort(int[] arr) {
  int n = arr.length;
  int temp = 0;
  for (int i = 0; i < n - 1; i++) {
   for (int j = 0; j < n - i - 1; j++) {
    if (arr[j] > arr[j + 1]) {
     temp = arr[j];
     arr[j] = arr[j + 1];
     arr[j + 1] = temp;
    }
   }
  }
  return arr; // Return the sorted array
 }





}
