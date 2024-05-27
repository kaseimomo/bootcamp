package com.bootcamp.demo.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.democalculator.model.Address;
import com.bootcamp.demo.democalculator.model.Customer;

public interface CustomerOperation {

 @GetMapping(value = "/customers")
 List<Customer> getAll();

 @GetMapping(value = "/custOrder-Charles")
 List<Customer> custOrder();

 @GetMapping(value = "/newCustomer")
 Customer addCustomer(String name, Address address);

 @GetMapping(value = "/fullList")
 List<Customer> fullList();

 @GetMapping(value = "/remove")
 Customer removeList(int id);
}
