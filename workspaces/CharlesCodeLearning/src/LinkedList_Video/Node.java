package LinkedList_Video;

public class Node {
 // ArrayList() != LinkedList () <- They have their own methods
 // The behind of LinkedList is not array
 // LinkedList -> 一個new obj會儲存自己的Value 和 另一個new obj的地址
 // Let's simulat a structure like linkedList()

 private String str;

 private Node next; // <- Object reference

 public Node(String str, Node next) {
  this.str = str;
  this.next = next;
 }

 // The constructor only store value, which mean Node's obj will be null
 public Node(String str) {
  this.str = str;
 }

 // A Setter to append another obj. (e.g. Add 1 obj into 3 objs)
 public void setNext(Node next) {
  this.next = next;
 }

 public Node getNext() {
  return this.next;
 }

 public void setString(String str) {
  this.str = str;
 }

 public String getString() {
  return this.str;
 }

 public static void main(String[] args) {
  // "hello", "abc", "def"
  Node head = new Node("hello", new Node("abc", new Node("def")));
  // "head" means the head of " = new Node("hello", new Node(.......))); "
  // 向前行 -> "hello" contains obj ref. of "abc".
  // And then "abc" contains obj ref. of "def". But "abc" cannot go back to find "hello". And so on...

  // Check if head contains "def"
  // linkedList起手用while loop
  Node temp = head; // 將head抄出來, 保留地址
  Boolean result = false;
  while (temp.next != null) { // stop loop if next = null    (<- BUG)
   if ("def".equals(temp.getString())) { // Find if temp.getNext() = "def"
    result = true; // Set a boolean to return the result
    break; // Break finding "def" when it's True
   }
   temp = temp.getNext(); // Move to the next Node, 向前推
   // 搵到next有value之後, 放入temp, 直到下一個next的value係null 就STOP
  }
  System.out.println(temp.getString()); // "def"
  System.out.println(result); // false ? Why?
  // Check "while (temp.next != null) {....." -> temp.next is the bug
  // 抄出來的temp 和 temp.next 這兩個地址是不一樣...
  // temp表達最頭一個的地址, 每loop一次就改變 -> 因為temp = temp.getNext();
  // 但temp.next係表達temp的最頭的下一個next的地址
  // 開始的條件是: loop到頭的下一個如果是null就停止
  // 裡面的if條件是: 頭是="def"的話就break, 而上面的loop只關心下一個是否null, 指針指到null先停
  // 因此, "while (temp.next != null)" 和裡面的if條件不符合

  // Let's DEBUG ~~~~~~~
  while (temp!= null) { // stop loop if head = null   (<- 更改為當頭!=null)
   if ("def".equals(temp.getString())) { // Find if temp.getNext() = "def"
    result = true; // Set a boolean to return the result
    break; // Break finding "def" when it's True
   }
   temp = temp.getNext(); // Move to the next Node, 向前推
   // 搵到next有value之後, 放入temp, 直到下一個next的value係null 就STOP
  }
  System.out.println(temp.getString()); // "def"
  System.out.println(result); // True

  

 }
}
