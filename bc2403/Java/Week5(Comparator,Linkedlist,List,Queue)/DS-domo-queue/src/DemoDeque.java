import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoDeque {
 public static void main(String[] args) {
  // Deque extends Queue
  Deque<String> strings = new LinkedList<>();

  strings.add("hello"); // default meaning: addLast -> tail
  strings.add("abc");
  strings.addFirst("ijk"); // addFirst() -> head
  System.out.println(strings);

  System.out.println(strings.poll()); // pollFirst()
  System.out.println(strings.pollLast()); // poll the element from tail

  strings.add("world");
  System.out.println(strings.peek());
  System.out.println(strings.peekLast());

  strings.pop(); // removeFirst
  System.out.println(strings); // [world]
  strings.push("mmm"); // addFirst, [mmm, world]
  System.out.println(strings);// [mmm, world]
  System.out.println(strings.size());

  // Stack (pop, push)
  List<String> strings3 = new Stack<>(); // thread-safe
  strings3.add("hello");

  Stack<String> strings4 = new Stack<>();
  strings4.push("hello");
  strings4.push("hello2");
  strings4.push("hello3");
  System.out.println(strings4.pop()); // hello3

  // Stack use case: reverse

  // Queue / Deque -> LinkedList or ArrayList
  Queue<String> qs = new ArrayDeque<>(); // LinkedList / Array
  qs.add("hello");
  qs.add("abc");
  System.out.println(qs.poll()); // hello

  qs.add("x");
  qs.add("y");
  qs.remove();
  System.out.println(qs); // [x, y]
  qs.remove("y");
  System.out.println(qs); // [x]

  Deque<String> ds = (Deque<String>) qs;
  ds.addLast("mnm");
  ds.addFirst("mnm");
  System.out.println(ds); // [mnm, x, mnm]

  System.out.println(qs); // [mnm, x, mnm]
  qs.add("ooo");
  qs.offer("kkk");
  System.out.println(qs);

  Deque<String> ds2 = new LinkedBlockingDeque<>(2);
  ds2.add("hello");
  ds2.add("world");
  System.out.println(ds2.size());
  // ds2.add("xxx"); // java.lang.IllegalStateException: Deque full
  System.out.println(ds2.offer("yyy")); // false 
  System.out.println(ds2);



 }
}
