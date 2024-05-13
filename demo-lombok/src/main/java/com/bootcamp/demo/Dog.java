package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// @NoArgsConstructor
public class Dog {

 private String name;
 private int age;

// Custom Constructor
public Dog(String name) {
 this.name = name;
}

 public Dog() {
  this.name = "Sally";
  this.age = 23;
 }


 public static void main(String[] args) {
  Dog dog = new Dog("Charles", 12);
  Dog dog2 = new Dog();
  dog.setAge(27);
  System.out.println(dog.getAge()); // 27
  System.out.println();




 }
}
