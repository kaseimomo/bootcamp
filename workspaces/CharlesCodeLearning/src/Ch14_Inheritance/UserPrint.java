package Ch14_Inheritance;

public class UserPrint {
 public static void main(String[] args) {
  Animal animal = new Animal();
  animal.sound();
  animal.getName();

   // Polymorthism
 Vehicle taxi = new Taxi("mx123", 4, 20.5d);
  System.out.println(taxi.totalCharge());
 }
}
