package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Customer {

 private String cusName;
 private List<Order> orders;

 public Customer(String name, List<Order> orders) {
  name = this.cusName;
  orders = this.orders;
 }

 public Customer (String name) {
  this.cusName = name;
  orders = new LinkedList<>();
 }

 public void add(Order order) {
  orders.add(order);
 }

 public int orderCount() {
  return this.getOrders().size();
 }

 public boolean isVIP() {
  return this.orderCount() >= 10;
 }

 // static method : input parameter -> produce -> output
 // instance method : Class attribute -> similar to static method parameter
 public static int orderCount(Customer customer) {
  return customer.orderCount();
 }

 public static void main(String[] args) {
  
  



 }
}
