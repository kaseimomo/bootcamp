package Practice;

public class UserPrint {
 public static void main(String[] args) {
 
  // use class name -> static method to call
  int area = Square.area(30);
  System.out.println(area); 
  
  // use object -> instance method to call
  Square sq = new Square(20);
  System.out.println(sq.area()); 

  Square.reSize(sq, 5);
  System.out.println(sq.area());
  
  Square sq2 = new Square(area); // 900
  sq2.reSize(12);
  System.out.println(sq2.area()); // 144

 }
}
