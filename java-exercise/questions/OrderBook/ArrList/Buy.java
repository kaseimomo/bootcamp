package ArrList;

public class Buy {
 private int quantity;
 private double price;

 public Buy(double price, int quantity) {
  this.price = price;
  this.quantity = quantity;
 }

 public double getBuyPrice() {
  return this.price;
 }
 public int getBuyQuantity() {
  return this.quantity;
 }

 @Override
 public String toString() {
  return "Buy[Price= " + this.price + // 
  ", Quantity= " + this.price + "]";//
 }
}
