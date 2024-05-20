import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Case_Order {
  private int orderId;
  private int customerId;
  private double amount;
  private LocalDate orderDate;

  public Case_Order(int orderId, int customerId, double amount,
      LocalDate orderDate) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.amount = amount;
    this.orderDate = orderDate;
  }

  public int getOrderId() {
    return this.orderId;
  }

  public int getCustomerId() {
    return this.customerId;
  }

  public double getAmount() {
    return this.amount;
  }

  public LocalDate getOrderDate() {
    return this.orderDate;
  }

  @Override
  public String toString() {
    return "\n(Order id = " + this.orderId //
        + ", Customer id = " + this.customerId //
        + ", Order Amount = " + this.amount //
        + ", Order Date = " + this.orderDate //
        + ")";
  }


  public static void main(String[] args) {
    List<Case_Order> orders = new ArrayList<>();
    orders.add(new Case_Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
    orders.add(new Case_Order(2, 102, 1200, LocalDate.of(2023, 4, 20)));
    orders.add(new Case_Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
    orders.add(new Case_Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
    orders.add(new Case_Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));
    orders.add(new Case_Order(6, 101, 600, LocalDate.of(2023, 4, 16)));
    orders.add(new Case_Order(7, 103, 850, LocalDate.of(2023, 4, 30)));

    // stream()
    // 1. filter orders with amount < 1000
    // 2. sort by descending order by orderDate
    // 3. group by customer ID -> average amount of orders per customer
    // Collect to Map<Integer, Double>
    // Collectors.groupingby(...)
    Map<Integer, Double> result = orders.stream()//
        .filter(o -> o.getAmount() < 1000) //
        // .sorted((o1, o2) -> o1.getOrderDate().compareTo(o2.getOrderDate())) // compareTo -> The comparison is primarily based on the date, from earliest to latest.
        .sorted(
            (o1, o2) -> o1.getOrderDate().isAfter(o2.getOrderDate()) ? -1 : 1) // isAfter (Boolean) -> Checks if this date is after the specified date.
        .collect(Collectors.groupingBy(o -> o.getCustomerId(), // Case_Order::getCustomerID
            Collectors.averagingDouble(o -> o.getAmount()))); // Case_Order::getAmount
    System.out.println(result); // {101=700.0, 103=875.0}

    // Challenge: filter orders of that customer with total amount of all orders > 1100
    // Approach: groupingby sum -> Map -> stream -> entry -> flatmap -> orders (mapping)
    List<Case_Order> result2 = orders.stream() //
        .collect(Collectors.groupingBy(Case_Order::getCustomerId,
            Collectors.summingDouble(Case_Order::getAmount))) //
        .entrySet().stream() //
        .filter(entry -> entry.getValue() > 1100) // filter entry
        .flatMap(entry -> orders.stream()
            .filter(order -> order.getCustomerId() == entry.getKey()))
        .collect(Collectors.toList());

    System.out.println(result2);

    



  }
}
