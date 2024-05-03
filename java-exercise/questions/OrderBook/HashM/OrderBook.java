package HashM;

import java.util.Map;

public class OrderBook {
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

 private double price;
 private int quantity;
 private int marketIndex; // 

 private Map<Double, Integer> entries; // $1 - $2, no ordering
 // Map advantage: hash -> search by key ($1.5 -> $4000)



 public OrderBook(double price, int quantity) {
  this.price = price;
  this.quantity = quantity;





  
 }
}
