public class Person {

 void read() {
  System.out.println("im reading...");
 }

 public static void main(String[] args) {
  Person p1 = new Person();
  p1.read();

  Person p2 = new Person() {
  @Override
  public void read() {
   System.out.println("im reading!");
  }
 };

 p2.read();
 }
}
