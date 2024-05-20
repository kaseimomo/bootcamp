import java.util.ArrayList;
import java.util.LinkedList;

public class Node { // Node即是object

 private String str; // object reference
 private Node next; // object reference

 public Node(String str) {
  this.str = str;
 }

 public Node(String str, Node next) {
  this.str = str;
  this.next = next;
 }

 // setter
 public void setNext(Node next) {
  this.next = next;
 }

 public Node getNext() {
  return this.next;
 }

 public void setStr(String str) {
  this.str = str;
 }

 public String getStr() {
  return this.str;
 }

 public static void main(String[] args) {
  // "hello" , "abc" , "def"
  Node head = new Node("hello", new Node("abc", new Node("def")));

  // check if head contain "def" -> true / false
  // for loop?? while loop -> linkedlist
  Node temp = head;
  boolean result = false;
  while (temp != null) {
   System.out.println(temp.str);
   // find "def"
   if ("def".equals(temp.getStr())) {
    result = true;
    break;
   }
   // move to the next Node
   temp = temp.getNext();
   System.out.println("temp.getNext()=" + temp.str);
   // System.out.println("checking: " + temp.getStr());
  }
  System.out.println(temp.getStr()); // "def"
  System.out.println(result); // false


  LinkedList<String> ll = new LinkedList<>();
  ll.add("hello"); // default addLast()
  ll.addLast("abc");
  ll.addFirst("def");
  System.out.println(ll);

  ArrayList<String> as = new ArrayList<>();
  as.add("hello");
  as.add("ijk");
  as.add("def");
  as.remove(1);
  System.out.println(as);
 }
}
