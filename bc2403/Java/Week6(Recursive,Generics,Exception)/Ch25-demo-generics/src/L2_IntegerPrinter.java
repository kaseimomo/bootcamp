public class L2_IntegerPrinter {
 private Integer data;

 public L2_IntegerPrinter(Integer data) {
  this.data = data;
 }

 public void print() {
  System.out.println(this.data);
 }
 public static void main(String[] args) {
  L2_IntegerPrinter ip = new L2_IntegerPrinter(123);
  ip.print();
 }
}
