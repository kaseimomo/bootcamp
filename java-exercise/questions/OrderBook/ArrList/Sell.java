package ArrList;

public class Sell {
 private double price;
 private int quantity;

 public Sell(double price, int quantity) {
  this.price = price;
  this.quantity = quantity;
 }

 public double getSellPrice() {
  return this.price;
 }
 public int getSellQuantity() {
  return this.quantity;
 }

 @Override
 public String toString() {
  return "Buy[Price= " + this.price + // 
  ", Quantity= " + this.quantity + "]";//
 }
}
