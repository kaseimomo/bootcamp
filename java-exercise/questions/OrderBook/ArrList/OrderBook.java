package ArrList;

import java.util.ArrayList;
import java.util.List;

public class OrderBook {

 private int marketIndex; //
 private List<Buy> buyOrders;
 private List<Sell> sellOrders;

 public OrderBook() {
  this.buyOrders = new ArrayList<>();
  this.sellOrders = new ArrayList<>();
 }

 public void addBuyOrder(double p, int qty) {
  if (qty > 0) {
   if (p >= 1.0d && p <= 2.0d) {
    buyOrders.add(new Buy(p, qty));
   } else {
    System.out.println(
      "Buying Price invalid. It should be in the range of $1.00 - $2.00!");
   }
  } else {
   System.out.println("Buying Qantity must > 0 !");
  }
 }

 public void addSellOrder(double p, int qty) {
  if (qty > 0) {
   if (p >= 1.0d && p <= 2.0d) {
    sellOrders.add(new Sell(p, qty));
   } else {
    System.out.println(
      "Selling Price invalid. It should be in the range of $1.00 - $2.00!");
   }
  } else {
   System.out.println("Selling Qantity must > 0 !");
  }
 }











 
}
 // assumption $1 - $2, $0.05
 // Buy, your price < market price
 // Buy, your price >= market price
 // Sell, your price > market price
 // Sell, your price <= market price
 // getOrderBook, Map -> List


 // Buy
 // $10 2q (1) -> trade(V / O 1q at $10)
 // $2 1000q

 // Sell
 // $11 3q (1)
 // $13 100q (1)

 // Market Price -> the price of the last trade in the market

 // $1 - $2, no ordering
 // Map advantage: hash -> search by key ($1.5 -> $4000)
