package Customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Item {

 private String desc; // description
 
 private double price;

 private int quantity;

 public Item(String desc, double price, int quantity) {
  this.desc = desc;
  this.price = price;
  this.quantity = quantity;
 }

 public double subtotal() {
  return BigDecimal.valueOf(this.price) //
  .multiply(BigDecimal.valueOf(this.quantity)) //
  .doubleValue(); 
 }

 public String toString() {
  return "Item(" //
  + "description=" + this.desc //
  + ", price=" + this.price //
  + ", quantity=" + this.quantity //
  + ")";
 }


}
