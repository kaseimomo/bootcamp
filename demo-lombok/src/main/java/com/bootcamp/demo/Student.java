package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// Getter/Setter is a field/class level annotation

@Getter
@Setter
@Data

@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
 @NonNull
 private String name;
 private int age;

 public static void main(String[] args) {
  Student s1 = new Student("Charles",4);
  System.out.println(s1.getName());
  s1.setAge(5);

  Student s2 = new Student("Charles");

 }
 
}
