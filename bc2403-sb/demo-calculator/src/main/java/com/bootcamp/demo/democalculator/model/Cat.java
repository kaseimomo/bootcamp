package com.bootcamp.demo.democalculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
 private String name;
 private int age;
 private Color[] color;
}
