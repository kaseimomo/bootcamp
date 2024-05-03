package Wine;

import java.util.Arrays;
import Customer.Item;

public class CustomerOrder {
 private String client;

 // one client has many pack(s) wine
 private WineMaker[] wines;

 public CustomerOrder(String client) {
  this.client = client;
  this.wines = new WineMaker[0];
 }

 public void add(WineMaker wine) {
  WineMaker[] copyArr = this.wines;
  this.wines = new WineMaker[this.wines.length + 1];
  int idx = 0;
  for (int i = 0;  i < copyArr.length; i++) {
   wines[idx++] = copyArr[i];
  }
  wines[idx] = wine;
 }

 public String toString() {
  return "Customer Order - Client: (" + this.client + ")\n" //
  + Arrays.toString(this.wines) + "\n";
 }
 
}
