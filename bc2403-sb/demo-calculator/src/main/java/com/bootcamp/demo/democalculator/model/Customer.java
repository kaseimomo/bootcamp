package com.bootcamp.demo.democalculator.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
 private String name;
 private LocalDate joinDate;
 private List<Order> orders;

 public final static List<Customer> customerList = new ArrayList<>();

}
