import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) throws Exception {
    List<Integer> integers = new LinkedList<>();
    integers.add(21);
    integers.add(44);
    integers.add(100);
    integers.add(101);

    // List of Odd number
    List<Integer> odds = new ArrayList<>();
    for (Integer number : integers) {
      if (number % 2 == 1)
        odds.add(number);
    }
    System.out.println(odds); // [21, 101]

    // Stream
    // remove even
    List<Integer> result = integers.stream() // List<Integer> -> Stream<Integer>
        .filter(e -> e % 2 == 1) // .Stream<Integer>
        .collect(Collectors.toList()); // List<Integer> (new List) ->
    // .toList -> Returns a Collector that accumulates the input elements into a new List.
    System.out.println(result); // [21, 101]

    // remove odd
    List<Integer> result2 =
        integers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
    System.out.println(result2); //

    // = 101
    List<Integer> result3 =
        integers.stream().filter(e -> e == 101).collect(Collectors.toList());
    System.out.println(result3);

    // romove dup
    // List.of(101, 101, 203, 200)
    List<Integer> integers2 = new LinkedList<>(List.of(101, 101, 203, 200));
    List<Integer> result4 = integers2.stream()// .stream()
        .distinct() // distinct = remove dup
        .collect(Collectors.toList());
    System.out.println(result4);

    // counting
    long size = integers2.stream() // .stream()
        .distinct() //
        .count();
    System.out.println(size); // 3

    // counting
    long size2 = integers2.stream() // .stream()
        .filter(e -> e < 200) //
        .distinct() //
        .count();
    System.out.println(size2); // 1

    List<CustomerS> customers = new LinkedList<>(
        List.of(new CustomerS(13, "Jenny"), new CustomerS(18, "Charles")));

    List<CustomerS> adultCustomers = customers.stream() // -> new a Stream<Customer>
        .filter(e -> e.getAge() >= 18) //
        .collect(Collectors.toList()); // -> new ArrayList() -> existing Customer Charles

    System.out.println(customers);
    System.out.println(adultCustomers);
    // updating customers
    customers.get(1).setAge(19); // -> adultCustomers has been updated


    // stream -> startWith "a"
    String[] strings = new String[] {"abc", "Akjf", "a", "aaa"};
    // fixed size list -> do not support add/remove,etc
    Arrays.asList(strings);

    List<String> startsWitha = Arrays.asList(strings).stream()
        .filter(e -> e.startsWith("a")).collect(Collectors.toList());
    System.out.println(startsWitha); // [abc, a, aaa]

    // List -> array
    String[] arr = startsWitha.stream() //
        .toArray(s -> new String[s]);
    System.out.println(Arrays.toString(arr));

  }

  // Using Arrays.asList to create a list with initial elements
  List<String> fruits1 =
      Arrays.asList("apple", "banana", "cherry", "orange", "grape");
  // Using ArrayList<>() to create an empty list
  List<String> fruits2 =
      new ArrayList<>(List.of("apple", "banana", "cherry", "orange", "grape"));

  // /* 1. Creation of List:
  // * <>)) Creation of List: Arrays.asList("apple", "banana", "cherry", "orange", "grape"):
  // * This creates an immutable List backed by the specified array of elements.
  // * It returns a fixed-size list, and any attempt to modify the list's size
  // * (add or remove elements) will result in an UnsupportedOperationException.
  // *
  // * <>)) new ArrayList<>(List.of("apple", "banana", "cherry", "orange", "grape")):
  // * This creates a mutable ArrayList containing the specified elements.
  // * It uses the List.of method introduced in Java 9 to create an immutable list,
  // * and then it creates a new ArrayList initialized with the elements of this immutable list.
  // * The resulting ArrayList is mutable and allows modifications to its size and elements.

  // /* 2. Mutability:
  // * <>)) Arrays.asList: The list created by Arrays.asList is initially mutable
  // * (you can modify its elements), but it's fixed-size, so you cannot add or remove elements.
  // * 
  // * <>)) new ArrayList<>(List.of(...)): The ArrayList created this way is fully mutable,
  // * allowing you to add, remove, or modify elements as needed.
  // */



  public static List<Integer> getOdds(List<Integer> integers) {
    return integers.stream()//
        .filter(e -> e % 2 == 1) //
        .collect(Collectors.toList());
  }
}
