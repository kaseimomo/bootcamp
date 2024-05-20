public class L3_Printer<T> { // <T> 係範圍, Class
 // Lets create 2 classes:
 // L1_StringPrinter
 // L2_IntegerPrinter

 private T data;

 public L3_Printer(T data) {
  this.data = data;
 }

 public void print() {
  System.out.println(data.toString());
  // data.之後望一望個範圍, 其實係Object.class
  // T -> Object.class
 }

 public static void main(String[] args) {
  L3_Printer<String> ps = new L3_Printer<String>("hello"); // You can't input integer value... Compile-time checking
  // We can use the toString() from String.class
  ps.print(); // <- the toString() in String.class

  L3_Printer<Integer> pi = new L3_Printer<Integer>(3); // You can't input String value... compile-time checking
  pi.print();
 }
}
