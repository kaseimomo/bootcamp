package Wine;

import java.util.Arrays;
import Customer.Item;

public class CustomerOrder {
 private String client;
 private Delivery delivery;

 // one client has many pack(s) wine
 private Wine[] wines;

 public CustomerOrder(String client) {
  this.client = client;
  this.wines = new Wine[0];
  this.delivery = new Delivery();
 }

 public void add(Wine wine) {
  Wine[] copyArr = this.wines;
  this.wines = new Wine[this.wines.length + 1];
  int idx = 0;
  for (int i = 0;  i < copyArr.length; i++) {
   wines[idx++] = copyArr[i];
  }
  wines[idx] = wine;
 }

 public int total() {
  return this.delivery.getFee() + this.wines[0].subTotal();
 }

 public String toString() {
  return "Customer Order - Client: (" + this.client + ")\n" //
  + Arrays.toString(this.wines) + "\n";
 }
 
}
