import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityque {
 public static void main(String[] args) {
  Queue<Integer> integers = new PriorityQueue<>();
  integers.add(12); 
  integers.add(5); 
  integers.add(1000); 
  integers.add(-2);
  System.out.println(integers); // [-2, 5, 1000, 12]
  System.out.println(integers.poll()); // -2, sorting
  System.out.println(integers); // [5, 12, 1000]
  System.out.println(integers.poll()); // 5, sorting
  System.out.println(integers.poll()); // 12, sorting
  System.out.println(integers); // [1000]

  System.out.println(integers.poll()); // 1000
 }
}
