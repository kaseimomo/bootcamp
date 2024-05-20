package Queue_Video;

import java.util.Deque;
import java.util.LinkedList;

public class V_Deque {

 public static void main(String[] args) {
  /* Deque extends Queue */
  Deque<String> strings = new LinkedList<>();
  // By the signature of Queue<>, add value from head is imporsible.
  // We don't have to concern the add() is adding value from head.
  // BUT using Deque<> signature, we have to check carefully!!!

  strings.add("hello");
  // add() is default addLast() <- In Queue<>, there's no addLast().
  strings.add("abc");
  strings.addFirst("ijk");
  // addFirst() is adding value from head
  System.out.println(strings); // [ijk, hello, abc]

  strings.poll();
  // poll() is default pollFirst()
  strings.pollLast();
  // pollLast() is removing value from tail
  System.out.println(strings); // [hello]

  // pop() and push()
  strings.add("world");
  strings.addFirst("java");
  System.out.println(strings); // [java, hello, world]
  strings.pop(); // same as remove. And this is removeFirst
  System.out.println(strings); // [hello, world]
  strings.push("pushhhh"); // This method is equivalent to addFirst.
  System.out.println(strings); // [pushhhh, hello, world]
  

  



 }
}

