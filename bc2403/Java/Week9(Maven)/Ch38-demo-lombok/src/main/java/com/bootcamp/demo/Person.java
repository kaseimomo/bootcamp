package com.bootcamp.demo;

import lombok.Value;
import lombok.With;
// import lombok.var;

// read-only
@Value // <- @AllArgsConstructor + getters

public class Person {
 @With
 private String name; // final
 @With
 private int age; // final

 // can we add setter? -> you can't because the instance varaible has been final
 // public void setName (String name) {
 //  this.name = name;
 // }

 public static void main(String[] args) {
  Person p1 = new Person("Charles", 5);
  System.out.println(p1.getAge());
  System.out.println(p1.getName());

  Person p2 = new Person("Charles", 5);
  System.out.println(p1.equals(p2)); // ture

  System.out.println(p1);
  System.out.println(p2);
  
  p2.withAge(123); // ?? what is this? Check source code

  // var name = "Vincent"; // var <- java 11

 }
}
