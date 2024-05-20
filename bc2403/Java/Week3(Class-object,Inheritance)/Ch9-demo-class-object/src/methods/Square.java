package methods;

import java.util.Arrays;

public class Square {

 private int length;
 // constructor
 public Square(int length) {
  this.length = length;
 }

 public void setLength(int length) {
  this.length = length;
 }
 public int getLength() {
  return this.length;
 }

 public int area() {
  return this.length * this.length;
 }

 public static void reSize(Square square, int newLength) {
  square.setLength(newLength);
  // return square;
 }
 public static int sum(int x, int y) {
  return x + y;
 }

 public static String concat(String x, String y) {
  return x + y;
 }

 public static void addOne(short[] arr) { // why void? because don't have to give out the reference
  for (int i = 0; i < arr.length; i++) {
   // arr[i] = (short) (arr[i] + 1); // short + int -> int (cannot assign int value to short variable)
   arr[i]++;
   System.out.println(arr[i]);
  }
 }

 public static void xxx(Square square) {
  square = new Square(3);
 }

 public static void main(String[] args) {
  // pass by value -> primitives, wrapper classes object, String object
  // pass by reference -> all types of array object, custom class object

  int a = 4;
  int b = 7;
  int r1 = sum(a, b); // passing copy of values a and b
  // after sum() ,a = 4, b = 7 , r1 = 11

  Integer q = 10; // wrapper class
  Integer e = 11;
  sum(q, e);
  // after sum(), q = 10, e = 11

  String s1 = "hello";
  String s2 = "world";
  concat(s1, s2); // passing copy of values of s1 and s2
  // after concat(), s1 = "hello", s2 = "world"

  short[] arr1 = new short[] {3, 4, 9};
  addOne(arr1); // passing copy of reference of arr1
  System.out.println(Arrays.toString(arr1));
  // after addOne(), [4, 5, 10], arr1 is still pointing ot the original object

  Square sq1 = new Square(10);
  reSize(sq1, 20);// passing copy of reference of sq1
  System.out.println(sq1.area()); // 400

  Square sq2 = new Square(9);
  xxx(sq2);
  System.out.println(sq2.area());

 }

 
}
