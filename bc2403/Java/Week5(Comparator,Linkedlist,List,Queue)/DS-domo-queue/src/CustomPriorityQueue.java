import java.util.PriorityQueue;

public class CustomPriorityQueue {
 public static void main(String[] args) {
  PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator()); 

  pq.add(98);
  pq.add(202);
  pq.add(43);
  pq.add(23);
  pq.add(-3);

  System.out.println(pq);
  System.out.println(pq.poll());
  System.out.println(pq);

  // sort out odd no.
  int size = pq.size();
  int value = 0;
  while (size-- > 0) {
   value = pq.poll();
   if(value % 2 == 1) {
     pq.add(value);
   }
  }
  System.out.println(pq);
 }
}
