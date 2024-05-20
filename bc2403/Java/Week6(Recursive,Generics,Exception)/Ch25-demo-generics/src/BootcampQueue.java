import java.util.LinkedList;
import java.util.Queue;

public class BootcampQueue<T> { //
 // T is a thing, which no relationship with Object class
 // T is actually ready to be a class

 private Queue<T> data;

 private Object data2;

 public BootcampQueue() {
  this.data = new LinkedList<>();
 }

 // create a add()
 public void add(Object data2) { // data2 -> Integer or String or Customer ...
  this.data2 = data2;
 }

 // create a add2()
 // T is a class now BUT we don't know yet.
 // It's not the same concept like Object class.
 public void add2(T data) {
  this.data2 = data;
 }

 // poll
 public T poll() {
  return this.data.poll();
 }


 public static void main(String[] args) {
  BootcampQueue<String> bq = new BootcampQueue<>();
  // bq.add2(3); // After add an integer value, it will be compile time error
  // -> add2(), T 是什麼 -> 係compile time時候決定 -> "BootcampQueue<String> " <- defining <String>, which is String tpye only
  bq.add2("hello"); // -> return type is String 

  // add() return type is Object class....
  bq.add(3); // add any type because it's from Object class
  bq.add(3L); // add any type because it's from Object class
  bq.add("llll"); // add any type because it's from Object class

  // 既然係compile time時候決定, 試一試 define <Integer>
  BootcampQueue<Integer> bq1 = new BootcampQueue<>();
  // Compile time error when you put a String value
  // bq1.add2("afd");
  bq1.add(100); // -> return type is integer 
  // Thus, 寫 T 可以在寫method的return type時候俾user決定


 }
}
