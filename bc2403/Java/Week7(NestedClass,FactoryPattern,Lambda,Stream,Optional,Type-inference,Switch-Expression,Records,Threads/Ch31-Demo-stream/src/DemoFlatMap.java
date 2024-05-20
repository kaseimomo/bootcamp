import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap {
 public static void main(String[] args) {
  List<List<Integer>> integeLists = new LinkedList<>();
  integeLists.add(List.of(1, 2, 3));
  integeLists.add(List.of(10, -10, 100));
  integeLists.add(List.of(101, 203, -99));

  List<Integer> flattendedList = integeLists.stream() //
    .flatMap(e -> e.stream()) //
    .collect(Collectors.toList());
  System.out.println(flattendedList);

  List<CustomerS> customers = integeLists.stream()
  .map(e -> new CustomerS(e.size(), "Charles")) // 
  .collect(Collectors.toList());
  System.out.println(customers);
 }
}
