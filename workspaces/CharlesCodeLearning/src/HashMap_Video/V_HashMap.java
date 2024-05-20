package HashMap_Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class V_HashMap {
 public static void main(String[] args) {
  // put() -> 一條一條record put入去
  // 公式: HashMap < 左面->Key , 右面->Value >
  // e.g. name, age
  HashMap<String, Integer> mapper = new HashMap<>();
  mapper.put("John", 13); // Reminder that 13 has been autoboxed!! -> Integer.valueOf(13)
  mapper.put("Vincent", 18); //
  // In data structure, there's no ordering here. 因為Map底層唔係Array
  System.out.println("Age=" + mapper.get("Vincent")); // 18
  System.out.println("Age=" + mapper.get("John")); // 13
  // 永遠係by Key 去get Value, 不可能用Value搵到Key
  // Map 底層有一個叫 Entry, 一條Record就一條Entry <- Entry is a Class
  for (Map.Entry<String, Integer> m : mapper.entrySet()) { // 左面: 一條Entry, 右面: 一堆Entries
   System.out.println(m.getKey() + " " + m.getValue());
  }
  // Key can't be duplicated in a HashMap
  mapper.put("Vincet", 20); // "put" is to find the same Key to update Value
  mapper.put("Rexy", 18);
  // Sum up all age in map
  int sum = 0;
  for (Map.Entry<String, Integer> age : mapper.entrySet()) {
   sum += age.getValue();
  }
  System.out.println("Sum=" + sum); // 69
  // *Key has to be a Class
  /* The behind of put() method, the Key is identfied by hashCode. */
  // Reminder that "equals()" and "hashCode()" has already overrided all(8) wrapper classes + String Class, which total 9 Classes
  // If the Key is not a Wrapper Class which is a custome Class
  // Let's create a class called "Customer" to replace the Key of mapper.
  HashMap<Customer, Integer> ageMap = new HashMap<>();
  ageMap.put(new Customer("Jack"), 20);
  ageMap.put(new Customer("Jack"), 25);
  // After Overrided equals() and hashCode(), the updated Value:age is 25
  System.out.println(ageMap.get(new Customer("Jack"))); // 25
  // Now in Heap memory, "Jack" 出現咗3次, 但memory曾經出現過幾多Object係唔重要.
  // 重要係Key能夠認到同一個hashCode地址(same Key)後, get()出嚟要係 = 25
  System.out.println(ageMap.size()); // 1 -> There's only one entry in ageMap, hashCode地址一樣, 即係認到係同一個“Jack”
  // Thus, ageMap.size() will be 2, and ageMap.get() will null *if we wipe out override hashCode in Customer.class*
  /* Set底層係Map, thats why hashSet has no sequence ordering. */


  // Let's try if customer has a list of orders
  // Eric has order1: $100 and order2: $250
  // Indi has order1: $1200, order2: $20 and order3: $88
  // Find the total order amount, which expected output is $1658
  HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();

  // Eric's orders1
  ArrayList<Order> orders1 = new ArrayList<>();
  orders1.add(new Order(100));
  orders1.add(new Order(250));
  /* The behind of add() method is using equals() */
  orderMap.put(new Customer("Eric"), orders1);
  System.out.println("Eric's order size is " + orders1.size()); // 2

  // Indi's orders2
  ArrayList<Order> orders2 = new ArrayList<>();
  orders2.add(new Order(1200));
  orders2.add(new Order(20));
  orders2.add(new Order(88));
  orderMap.put(new Customer("Indi"), orders2);
  System.out.println("Indi's order size is " + orders2.size()); // 3

  // totalOrderAmount
  int totalOrderAmount = 0;
  for (Map.Entry<Customer, ArrayList<Order>> e : orderMap.entrySet()) {
   for (Order o : e.getValue()) {
    totalOrderAmount += o.getAmount();
   }
  }
  System.out.println("totalOrderAmount=$" + totalOrderAmount);

  // What is orderMap.entrySet()? -> It's an entry that orderMap contains all Key and Value
  // In this case, Key is not the target range to loop.
  // Our target is to get the Value. We can use the range of orderMap.values() for each-loop
  totalOrderAmount = 0;
  for (ArrayList<Order> orderList : orderMap.values()) {
   for (Order o : orderList) {
    totalOrderAmount += o.getAmount();
   }
  }
  System.out.println("totalOrderAmount=$" + totalOrderAmount);

  // To concern what customer we have in here. We can loop keySet().
  for (Customer c : orderMap.keySet()) {
   System.out.println("Customer: " + c.getName());
  }

  System.out.println(orderMap.containsKey(new Customer("Eric"))); // true <- Customer.class has overrided hashCode()
  // Conclusion:
  // 1. If they are Different Objects -> we can treat them as the same thing -> by using Override(equas() , hashCode())
  // 2. If they are Same Object, all the values inside the object are same
 }
}

