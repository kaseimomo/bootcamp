package Queue_Video;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class V_Queue {

 public static void main(String[] args) {

  List<String> strings = new LinkedList<>();
  strings.add("hello");
  strings.remove(0);
  strings.add("def");

  // Queue<String> strings2 = strings;
  // Different type of class
  // Queue<xxx> xxx != List<xxx> xxx
  // Both are extended from Collection.class

  // What if we force them to pair -> downcast
  Queue<String> strings2 = (Queue<String>) strings; // we ignore the risk first...
  // Queue means you can get things on head, and add things to tail
  // 左手面係指針, 講緊obj有什麼才能
  // 底層有甚麼是右手面決定 -> "= new LinkedList<>();"
  // According from the Data Structures, LinkedList has implemented 2 interfaces (List and Deque)
  // 所以strings2. 的底層一定與Array無關 <- ArrayList dose not implemente Queue
  // strings2.remove(1); // Doesn't make scence that Queue can remove index...
  // There's no index concept in Queue.
  // Compile run time error if the righthand side is ArrayList
  // java.util.ArrayList cannot be cast to class java.util.Queue

  // add() -> add to the tail of queue
  strings2.add("abc");
  System.out.println(strings2); // [def, abc]
  System.out.println(strings2.size()); // 2

  // poll() -> "remove" -> and then "return the head object" <- 條隊第一個走咗,第二個做頭
  strings2.poll();
  System.out.println(strings2); // [abc]
  // poll() again will turn to null. There's no obj in the Queue
  System.out.println(strings2.poll()); // abc <- remove "abc"
  System.out.println(strings2); // []
  System.out.println(strings2.poll()); // null <- there's nothing to remove
  // 2 steps of process to complete poll().

  // peek() -> Just return the head object <- 望一望邊個喺隊頭
  strings2.add("001");
  strings2.add("002");
  System.out.println(strings2.peek()); // 001
  // Print all the obj
  System.out.println(strings2);

  // Use while loop to print all obj
  Queue<String> backup = new LinkedList<>(strings2); // <- Create a temporary queue to backup
  while (backup.size() > 0) {
   /* Please note the size() is not stable */
   System.out.println(backup.poll()); 
  }
  // Use isEmpty() instead of size()
  while (!strings2.isEmpty()) {
   System.out.println(strings2.poll());
  }

  // Challenge: remove even no.
  Queue<Integer> integers = new LinkedList<>();
  integers.add(1);
  integers.add(101);
  integers.add(2);
  integers.add(99);
  integers.add(-8);
  int size = integers.size();
  int value = -1;
  while (size-- > 0) {
   value = integers.poll();
   if (value % 2 == 1) {
    integers.add(value);
   }
  }
  System.out.println(integers); // [1, 101, 99]

  // remove()
  integers.remove();
  System.out.println(integers); // [101, 99]
  // This method differs from poll() only in that it throws an exception 
  // if this queue is empty.
  integers.remove(); // remove 101
  integers.remove(); // remove 99
  //integers.remove(); // java.util.NoSuchElementException
  // The queue was removed....??



  

  
  



 }

}
