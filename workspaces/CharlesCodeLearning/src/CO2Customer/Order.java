package CO2Customer;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {

 private String orderNo;

 // One to many: one order has many items
 // Item.class已經創造出嚟, 第17個type之後的第18個type -> 自創的class
 private Item[] items;

 // public Order(String orderNo, Item[] items) /* Take away "Item[] items" */
 public Order(String orderNo) {
  this.orderNo = orderNo;
  this.items = new Item[0]; /* Add an Empty Array */ 
  //暗底收埋Item[], user 唔需要知道
 }

 // open ADD item method
 public void addItem(Item item) { //either add or addItem is fine
  Item[] copyArr = this.items; 
  this.items = new Item[this.items.length + 1];
  int idx = 0;
  for (int i = 0; i < copyArr.length; i++) {
   items[idx++] = copyArr[i];
  }
  items[idx] = item;
 } 

 // open Total method
 public double total() {
  BigDecimal total = BigDecimal.valueOf(0.0d);
  for (int i = 0; i < items.length; i++) {
   total = total.add(BigDecimal.valueOf(items[i].subTotal()));
  }
  return total.doubleValue();
 }

 public String toString() {
  return "\nOrder No: " + this.orderNo + "\nItem info: " //
  + Arrays.toString(this.items);
 }

}
