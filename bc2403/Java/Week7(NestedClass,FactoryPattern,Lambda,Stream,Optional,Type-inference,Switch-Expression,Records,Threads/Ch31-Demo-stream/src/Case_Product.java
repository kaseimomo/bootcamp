import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Case_Product {
 private String name;
 private String categary;
 private double price;
 private int quantity;

 public Case_Product(String name, String categary, double price, int quantity) {
  this.name = name;
  this.categary = categary;
  this.price = price;
  this.quantity = quantity;
 }

 public String getName() {
  return this.name;
 }

 public String getCategary() {
  return this.categary;
 }

 public Double getPrice() {
  return this.price;
 }

 public int getQuantity() {
  return this.quantity;
 }

 public static void main(String[] args) {
  List<Case_Product> products = new ArrayList<>();
  products.add(new Case_Product("Laptop", "Electronics", 1200, 5));
  products.add(new Case_Product("Book", "Stationery", 500, 10));
  products.add(new Case_Product("Watch", "Fashion", 1500, 3));
  products.add(new Case_Product("Headphones", "Electronics", 800, 8));
  products.add(new Case_Product("Shoes", "Fashion", 2000, 2));

  // stream
  // 1. Filter all products with price > 1000
  // 2. sort ascending order by name
  // 3. map the result set to a list of string "Laptop-5"
  // 4. Collect to List<String>

  List<String> result = products.stream(). //
    filter(p -> p.getPrice() > 1000)
    .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName())) // compareTo
    .map(p -> p.getName().concat("-").concat(String.valueOf((p.getQuantity())))) //
    .collect(Collectors.toList());
  System.out.println(result);

  
 }
}
