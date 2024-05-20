import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    // John 13
    // Vincent 18
    HashMap<String, Integer> mapper = new HashMap<>();
    // Left hand side: KEY
    // Right hand side: VALUE
    mapper.put("John", Integer.valueOf(13)); // put an "entry" into map;
    mapper.put("Vincent", 18); // ** .put 入面係for loop
    // no ordering.
    // Get Value by Key (We CANNOT get key by value)
    System.out.println(mapper.get("Vincent")); // 18
    System.out.println(mapper.get("John")); // 13

    // for-each
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    // Key cannot be duplicated in a HashMap
    // put -> update
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent")); // 20
    // add Jenny
    mapper.put("Jenny", 24);
    // sum up all integers in the map
    int sum = 0;
    for (Map.Entry<String, Integer> map : mapper.entrySet()) {
      sum += map.getValue();
    }
    System.out.println("sum=" + sum); // 13+20+24 = 57

    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"), 13);
    ageMap.put(new Customer("John"), 17);
    System.out.println(ageMap.get(new Customer("John"))); // null

    System.out.println(ageMap.size()); // 2

    // Challenge
    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    // John -> order 1: 100. order 2: 250
    // Vincent -> order 1 : 1200. order 2: 20, order 3: 88
    ArrayList<Order> orders = new ArrayList<>();
    orders.add(new Order(100));
    orders.add(new Order(250));
    Customer c1 = new Customer("John");
    orderMap.put(c1, orders);

    ArrayList<Order> orders2 = new ArrayList<>();
    orders2.add(new Order(1200));
    orders2.add(new Order(20));
    orders2.add(new Order(88));
    orderMap.put(new Customer("Vincent"), orders2);

    // Expected output: totalOrderAmount=1658
    // entrySet()
    sum = 0;
    for (Map.Entry<Customer, ArrayList<Order>> entry : orderMap
        .entrySet()/* 這裡是範圍 */) { // entrySet() -> entry -> key and value
      for (Order o : entry.getValue()) {
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);

    // 如果唔係咁在意key
    // values()
    System.out.println(orderMap.values()); // [[Order@42a57993, Order@75b84c92, Order@6bc7c054], [Order@232204a1, Order@4aa298b7]]
    sum = 0;
    for (ArrayList<Order> orderList : orderMap.values()) { //
      for (Order o : orderList) {
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);

    // keySet()
    for (Customer customer : orderMap.keySet()) {
      System.out.println("customer=" + customer.getName());
    }

    // containsKey(), containsValue()
    System.out.println(orderMap.containsKey(new Customer("Vincent")));
    // false, why? Because Customer.class didn't Override hashcode

    // Conclusion:
    // 1. If they are Different Objects -> we can treat them as the same thing(equas() , hashCode())
    // 2. If they are Same Object, all the values inside the object are same

    orderMap.put(new Customer("Sally"), orders);

    // orders -> add an order
    orders.add(new Order(100));
    // print out John and Sally orders
    System.out.println("ketSet : " + orderMap.keySet());
    // System.out.println("ketSet : " + entry.getKey());
    System.out.println("Order : " + orderMap.get(new Customer("Vincent")));
    System.out.println("Order : "+ orderMap.get(new Customer("Sally")));
    System.out.println("Order : "+ orderMap.get(new Customer("John")));

    // Checking if Order "88" is from customer "Vincent".
    for (int i = 0; i < orderMap.get(new Customer("Vincent")).size(); i++) {
      if (orderMap.get(new Customer("Vincent")).get(i).equals(new Order(88))) {
        System.out.println(
            "orderMap.get : " + orderMap.get(new Customer("Vincent")).get(i));
      }
    }
    // Checking if order
    orderMap.get("Vencent");
    

    HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
    HashMap<String, ArrayList<Order>> example2 = new HashMap<>();

    orderMap.remove(new Customer("Vincent")); // Without Override hasCode(), cannot remove by customer object
    System.out.println(orderMap);



  }
}
