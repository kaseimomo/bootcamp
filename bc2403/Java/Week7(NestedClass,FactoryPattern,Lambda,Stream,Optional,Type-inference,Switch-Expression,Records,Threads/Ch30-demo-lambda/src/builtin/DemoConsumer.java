package builtin;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    // Consumer<>
    // Represents an operation that accepts a single input argument and returns no result.
    // Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
    // This is a functional interface whose functional method is accept(Object).

    // void accept(T t)
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("hello"); // hello

    Consumer<List<Integer>> printer2 = intergers -> {
      for (Integer num : intergers) {
        System.out.println(num);
      }
    };
    printer2.accept(new ArrayList<>(List.of(13, 300, 29)));
    // 13
    // 300
    // 29

    // BiConsumer<>
    // Represents a function that accepts two arguments and produces a result.
    // This is the two-arity specialization of Function.
    // This is a functional interface whose functional method is apply(Object, Object).
    BiConsumer<String, Boolean> printer3 = (s, b) -> {
      if (b == true)
        System.out.println(s.toUpperCase());
      else
        System.out.println(s.length());
    };
    printer3.accept("Bootcamp", false); // 8
    printer3.accept("Bootcamp", true); // // BOOTCAMP

    BiConsumer<Integer, String> pairLog = (key, value) -> System.out.println(key + " : " + value);
    pairLog.accept(10, "TEN"); // 10 : TEN
    pairLog.accept(3, "THREE"); // 3 : THREE


    // BiFunction<T,U,R>
    // * t the first function argument
    // * u the second function argument
    // * return the function result
    BiFunction<Integer, Integer, Integer> sum = (x, y) -> {
      return x + y;
    };
    System.out.println(sum.apply(4, 3)); // 7

    // Count Strings in LinkedList<>
    List<String> strings = new LinkedList<>();
    strings.add("xyz");
    strings.add("ijk");
    int o = 3; // local variable in main method
    // for-each
    for (String s : strings) {
      o += 1; // 5
    }
    // for loop
    for (int i = 0; i < strings.size(); i++) {
      o += 1; // 7
    } ;

    // Lambda -> Consumer
    // forEach 
    strings.forEach(s -> {
      // o += 1; // Lambda forEach: cannot modify non-local variable
      int p = 1;
      System.out.println(s); // xyz
    });
    // p = 2; // NOT OK

    // forEach (Map)
    Map<String, String> nameMap = new HashMap<>();
    nameMap.put("Chalres", "abc");
    nameMap.put("Jenny", "ijk");
    for (Map.Entry<String, String> entry : nameMap.entrySet()) {
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
    // Lambda - Map -> Biconsumer
    // forEach 
    nameMap.forEach((k, v) -> {
      System.out.println("k=" + k + ", v=" + v);
    });


    //
    for (String str : strings) {
      str = "hello";
      System.out.println("inside the loop: " + str); // hello
    }
    System.out.println("outside the loop: " + strings); // [xyz, ijk]
    // Lambda
    strings.forEach(e -> {
      e = "hello";
      System.out.println("inside the loop: " + e);// hello
    });
    System.out.println("outside the loop: " + strings); // [xyz, ijk]

    //
    Queue<String> q = new LinkedList<>();
    strings.forEach(e -> {
      q.add(e);// OK
      // q = new ArrayDeque<>(); // NOT OK
    });
    //
    Queue<String> q2 = new LinkedList<>();
    for (String str : strings) {
      q2.add(str); // OK
      q2 = new ArrayDeque<>(); // OK
    }

    // Using Consumer to modify each element of the list
    List<String> names = new ArrayList<>();
    names.add("Moon");
    names.add("nicOle");
    names.add("KaiTe");
    Consumer<String> modifyConsumer = (strObj) -> //
    names.set(names.indexOf(strObj), strObj.toUpperCase());
    names.forEach(modifyConsumer); // Applying Consumer to each elemen
    System.out.println(names); // [MOON, NICOLE, KAITE]

  }
}
