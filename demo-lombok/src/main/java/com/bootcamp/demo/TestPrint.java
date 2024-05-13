package com.bootcamp.demo;

import java.time.LocalDate;

public class TestPrint {
 public static void main(String[] args) {
  Staff peter = new Staff(001, "Peter Lau", "Marketing Sales Leader", null);
  Staff peter2 = new Staff(001, "Peter Lau", "Marketing Sales Leader", null);
  Staff peter3 = new Staff(001, "Peter Lau", "Marketing Sales Manager", null);
  System.out.println(peter);
  System.out.println(peter == peter2); // false
  System.out.println(peter.equals(peter2)); // true
  System.out.println(peter.equals(peter3)); // false
  System.out.println(peter.hashCode()); // -1407345897
  System.out.println(peter2.hashCode()); // -1407345897
  System.out.println(peter3.hashCode()); // 268118047


  Order order1 = new Order(01, "abc");
  Customer c1 = new Customer("Chalres");
  c1.add(order1);
  Customer c2 = new Customer("Chalres");
  c2.add(order1);
  System.out.println(c1.equals(c2));
  System.out.println(order1.toString());

  System.out.println(c1.orderCount());
  System.out.println(c2.isVIP());

  Staff t1 = Staff.builder() //
  .name("Charles")
  .joinDate(LocalDate.of(2013, 4, 30))
  .build();

  System.out.println(t1.toString());
 }
}
