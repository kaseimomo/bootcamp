import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeArea {

 public static void main(String[] args) {
  List<Integer> nums = new LinkedList<>();
  nums.add(87);
  nums.add(64);
  nums.add(43);
  nums.add(16);
  nums.add(33);
  // Filter odd , even
  List<Integer> oddNum = nums.stream() //
    .filter(e -> e % 2 == 1) // result we want
    // Inside the parameter, e is presenting the result we want
    .collect(Collectors.toList());
  // .toList -> Returns a Collector that accumulates the input elements into a **new List
  List<Integer> evenNum = nums.stream() //
    .filter(e -> e % 2 == 0).collect(Collectors.toList());
  System.out.println(oddNum); // [87, 43, 33]
  System.out.println(evenNum); // [64, 16]

  // count nums > 50
  long result = nums.stream()//
    .filter(e -> e > 50)//
    .count();
  System.out.println(result); // 2

  List<CustomerS> customers = new ArrayList<>(List.of//
  (new CustomerS(17, "Jack"), //
    new CustomerS(30, "Rax"), //
    new CustomerS(28, "Ella"), //
    new CustomerS(15, "Jane"), //
    new CustomerS(40, "Sam")));

  List<String> names = customers.stream() //
    .filter(e -> e.getAge() > 18) //
    .map(e -> e.getName()) // getName() return to String <- Type has been changed from CustomerS to String
    .collect(Collectors.toList());
  System.out.println(names); // [Rax, Ella, Sam]

  Comparator<CustomerS> sortByName =
    (n1, n2) -> n1.getName().charAt(0) > n2.getName().charAt(0) ? -1 : 1;
  Comparator<CustomerS> sortByAge =
    (a1, a2) -> a1.getAge() > a2.getAge() ? -1 : 1;

  List<CustomerS> sortedByName = customers.stream() //
    .sorted(sortByAge) //
    .sorted(sortByName) //
    .collect(Collectors.toList());
  System.out.println(sortedByName);

n -> {  
    sb.append("[");
    for(int i = 0; i < n; i++) {
      if (i < n - 1) {
        sb.append(",");
      }
    }
    sb.append("]");
    return sb.toString();
  };


 }

}
