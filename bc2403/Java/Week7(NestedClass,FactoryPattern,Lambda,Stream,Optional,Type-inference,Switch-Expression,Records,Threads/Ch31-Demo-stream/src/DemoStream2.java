import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static void main(String[] args) {
    // static method -> constructor -> new Stream object
    Stream<String> empty = Stream.empty();
    System.out.println(empty.count()); // 0

    // static method -> constructor -> new Stream object
    Stream<String> strings = Stream.of("Hello", "abc");
    // You can filter, collect

    Stream<Integer> integers = Stream.iterate(1, n -> n + 2).limit(10); // ten numbers
    System.out.println(integers.collect(Collectors.toList())); // [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

    strings = strings.filter(e -> e.length() > 3); // intermediate operation -> new Stream
    // .count(); // terminal operation
    // System.out.println(strings.collect(Collectors.toList())); // [Hello]

    // stream -> forEach
    strings.forEach(e -> { // terminal operation
      System.out.println(e);
    });


    // sorted()
    List<Integer> integers2 = new ArrayList<>(List.of(3, -1, 100, -200));
    List<Integer> integers3 = integers2.stream()//
        .filter(e -> e.compareTo(0) >= 0) // >=0 , filter first
        .sorted()// interminate operation
        .collect(Collectors.toList());
    System.out.println(integers3); // [3, 100]

    //
    List<CustomerS> customers =
        new LinkedList<>(List.of(new CustomerS(13, "Charles"),
            new CustomerS(18, "Tommy"), new CustomerS(15, "Jenny"),
            // add one more Jenny
            new CustomerS(15, "Jenny")));

    // ****** Comparator
    Comparator<CustomerS> sortByAgeDesc =
        (c1, c2) -> c1.getAge() > c2.getAge() ? -1 : 1;

    List<CustomerS> sortedCustomers = customers.stream() //
        // Comparator object -> descending order for age
        .sorted(sortByAgeDesc) //
        .collect(Collectors.toList());
    System.out.println(sortedCustomers);

    // List<Customer> -> List<String>
    // Type change
    List<String> name = customers.stream() //
        .filter(c -> c.getAge() > 13)//
        .map(c -> c.getName()) // type change: Customer -> Stirng
        // you can try (name -> name.startsWith("J"))
        // .filter(name -> name.startsWith("J")).sorted()//
        .distinct()//
        .collect(Collectors.toList());
    // .collect(Collectors.toMap(s -> s.charAt( 0), s -> s));
    System.out.println(name); // [Tommy, Jenny]


    Stream.of(1, 2, 3).map(i -> {
      System.out.println(i); // 1 2 3
      return i + 1;
      // });
    }).forEach(e -> System.out.println(e)); // 1 2 2 3 3 4
    // nothing printout...
    // becasue map() is interminate operations, the map function will not be executed until terminal operate

    Stream.of(1, 2, 3).map(i -> {
      System.out.println(i); // 1 2 3
      return i + 1;
    }).count();
    // becasue map() won't affect the result of count,
    // so Steam would NOT execute map function if the terminal operation is count()
  }

}
