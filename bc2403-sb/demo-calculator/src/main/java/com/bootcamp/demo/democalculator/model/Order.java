package com.bootcamp.demo.democalculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
 private int id;
 private Address address;
}
