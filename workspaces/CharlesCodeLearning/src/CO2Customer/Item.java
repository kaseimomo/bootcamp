package CO2Customer;

import java.math.BigDecimal;

public class Item {

 private String desc; // Description
 private double price;
 private int quantity;

 public Item(String desc, double price, int quantity) {
  this.desc = desc;
  this.price = price;
  this.quantity = quantity; 
 }

 // open subTotal method, return subTotal
 // NO NEED parameter. We already have the info we need -> Price and Quantity
 // Thus, we should use <this.> concept to return subTotal
 public double subTotal() {
  return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
 }

 public String toString() {
  return "\nDescription: " + this.desc + "\nPrice: " + this.price //
  + "\nQuantity: " + this.quantity;
 }
 
}
