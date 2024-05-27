package com.bootcamp.demo.democalculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
 private String addr1;
 private String addr2;
 private String addr3;
 // private String[] addr;

 // public Address(String... addr){
 //  this.addr = new String[3];
 //  this.addr = addr;
 //  this.addr1 = this.addr[0];
 //  this.addr2 = this.addr[1];
 //  this.addr3 = this.addr[2];
 // }
 
}
