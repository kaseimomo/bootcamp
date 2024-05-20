package LinkedList_Video;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class V_LinkedList {
 public static void main(String[] args) {

  // Polymorphism
  // 左面係睇合約, 右面係睇底層

  // What is the defference between ArrayList and LinkedList?

  List<String> ls = new LinkedList<>();
  ls.add("abc");
  ls.add("def");
  ls.add("charles");
  for (int i = 0; i < ls.size(); i++) {
   System.out.println(ls.get(i));
   // Behind of get() is using for-loop to get value. 
   // e.g.: value "charles" needs to loop 3 times to get
  }

  // for-each
  String temp = null;
  for (String s : ls) { 
   // This loop method is similar to the Node.class we created.
   // Moving forward to find the exact value
   if ("def".equals(s))
   temp = s;
  }
  System.out.println(temp);

  // add value at head || last
  LinkedList<String> ll = new LinkedList<>();
  ll.add("hello"); // default = addLast()
  ll.addLast("world");
  ll.addFirst("java"); 
  System.out.println(ll); // [java, hello, world]
  // No need to write toString() because LinkedList already did

  ArrayList<String> as = new ArrayList<>();
  as.add("hello");
  as.add("ijk");
  as.add("def");
  as.remove(1);
  System.out.println(as);

 }
}
