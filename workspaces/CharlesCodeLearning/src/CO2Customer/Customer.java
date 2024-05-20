package CO2Customer;

import java.util.Arrays;

public class Customer {

 private String username;

 // one Customer has many orders
 private Order[] orders;

 // public Customer (String username, Order[] orders) {
 public Customer(String username) {
  this.username = username;
  this.orders = new Order[0];/* Add an empty Array */
 }

 // open ADD order method
 public void addOrder(Order order) { // either add or addOrer is okay. Because you can copy this method for another class, which mean using "add" is much better.
  Order[] copyArr = this.orders;
  this.orders = new Order[this.orders.length + 1];
  int idx = 0;
  for (int i = 0; i < copyArr.length; i++) {
   this.orders[idx++] = copyArr[i];
  }
  orders[idx] = order;
 }


 public String toString() {
  return "Customer: \n(" + "User Name: " + this.username //
    + "\nOrder info: " + Arrays.toString(this.orders) //
    + ")";
 }

}
