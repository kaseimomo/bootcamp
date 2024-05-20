package Udemy.demo_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Fruit {
 public static void main(String[] args) {
 Map<String, Double> fruitPrices = new HashMap<>();
 fruitPrices.put("Melon", 1.99);
 fruitPrices.put("Mango", 3.99);
 fruitPrices.put("Peach", 1.99);
 fruitPrices.put("Lemon", 2.99);

 System.out.println(fruitPrices.toString()); // {Peach=1.99, Mango=3.99, Lemon=2.99, Melon=1.99}
 
 }
}
