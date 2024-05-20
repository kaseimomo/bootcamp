package com.bootcamp.demo;

public class Cat {
 private String name;
 private int age;

 public Cat(String name, int age) {
  if (name == null) 
   throw new NullPointerException("Name cannot be null when create object");
   this.name = name;
   this.age =age;

  this.name = name;
  this.age = age;
 }

 public String getName() {
  return this.name;
 }

 public int getAge() {
  return this.age;
 }

 public static void main(String[] args) {
  Cat c = new Cat("Charles", 30);
 }
}
