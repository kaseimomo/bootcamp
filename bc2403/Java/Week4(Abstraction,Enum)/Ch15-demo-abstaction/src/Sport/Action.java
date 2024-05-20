package Sport;

public interface Action {
 void run();
 void walk();
 // after Java 8
 default void swim(){ // 自動繼承的instance method
   System.out.println("Default method: swim...");
 }
 static void sleep() { // normal static method
  System.out.println("Static method: sleep...");
 }

 public static void main(String[] args) {
  Action.sleep();
  
  Person p = new Person();
  p.swim();

  Staff s = new Staff();
  s.swim();
 }
}
