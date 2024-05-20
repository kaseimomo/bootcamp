public class Test {
 public static void main(String[] args) {
  Car car = new Car(); // still work, becaruse the class "Car" is public
  car.setSpeed(100.0d);
  System.out.println(car.getColor()); // null 嬲
  System.out.println(car.getCapcity()); // int defaul value is 0

  if (car.isSpeeding()) { // car.isSpeeding() == true
   
  }

  // int[] integers = null;
  // integers[0] = 1; // null pointer exception

  // int x = null;
  Integer x2 = null;
  String s2 = "hello"; // 背後係 char[] -> 'h' 'e' 'l' 'l' 'o'

  boolean b1 = true;
  System.out.println(b1); 
 }
}
