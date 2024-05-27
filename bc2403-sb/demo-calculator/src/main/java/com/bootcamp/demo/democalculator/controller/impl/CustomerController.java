package com.bootcamp.demo.democalculator.controller.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.democalculator.controller.CustomerOperation;
import com.bootcamp.demo.democalculator.model.Address;
import com.bootcamp.demo.democalculator.model.Customer;
import com.bootcamp.demo.democalculator.model.Order;

@Controller
@ResponseBody
public class CustomerController implements CustomerOperation {

  public static int id = 0;
  
  @Override
  public List<Customer> getAll() {
    Address a1 = new Address("abc", "def", "ijk");
    Address a2 = new Address("bbb", "def", "ijk");
    Address a3 = new Address("ccc", "def", "ijk");

    Order o1 = new Order(1, a1);
    Order o2 = new Order(1, a1);
    Order o3 = new Order(1, a1);

    List<Order> orderList1 = new ArrayList<>();
    orderList1.add(o1);
    List<Order> orderList2 = new ArrayList<>();
    orderList2.add(o2);
    orderList2.add(o3);

    List<Customer> customers = new LinkedList<>();
    customers
        .add(new Customer("Charles", LocalDate.of(2013, 10, 1), orderList1));
    customers.add(new Customer("Jenny", LocalDate.of(2013, 10, 1), orderList1));

    return customers;
  }

  @Override
  public List<Customer> custOrder() {
    return new ArrayList<>(List
        .of(new Customer("Charles", LocalDate.of(2013, 10, 03), new ArrayList<>(
            List.of(new Order(123, new Address("abc", "abc", "abc")))))));
  }


  @Override
  public Customer addCustomer(@RequestParam String name, //
  @RequestBody Address address) {
  if (!name.isEmpty())
  id++;
  Customer.customerList.add(new Customer(name,
  LocalDate.now(),
  new ArrayList<>(List.of(new Order(id, address)))));
  return Customer.customerList.get(id - 1);
  }

  // get fullList
  @Override
  public List<Customer> fullList() {
  return Customer.customerList;
  }

  @Override
  public Customer removeList(@RequestParam int id) {
  return Customer.customerList.remove(id - 1);
  }

}
