public class L1_StringPrinter {
 private String data;

 public L1_StringPrinter(String data) {
  this.data = data;
 }

 public void  setData (String s) {
  this.data = s;
 }

 public void print() {
  System.out.println(this.data);
 }

 public String toString() {
  return "StringPrinter(" //
  + "data=" + this.data + ")";
 }
 public static void main(String[] args) {
  L1_StringPrinter sp = new L1_StringPrinter("Hello");
  sp.print();
 }
}
