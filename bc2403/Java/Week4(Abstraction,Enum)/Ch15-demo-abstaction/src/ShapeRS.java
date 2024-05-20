public interface ShapeRS {
 double calculatedArea();

 public class Rectangle implements ShapeRS {
  private double length;
  private double width;

  public Rectangle (double length, double width) {
   this.length = length;
   this.width = width;
  }

  @Override
  public double calculatedArea() {
   return length * width;
  }

 }

 public class Square extends Rectangle{
 
  public Square (double side) {
   super(side, side);
  }

 }

 public static void main(String[] args) {
  Square s = new Square(10);
 
 
  String[] p1 = new String[] { "ABC", "BCD", "XYZ" };
  String[] p2 = p1;
  String[] p3 = new String[] { "ABC", "BD", "XYZ" };
  String s1 = "ABC";
  String s2 = "ABC";
  System.out.println (p1 == p2); // true
  System.out.println (p2 == p3); // false
  System.out.println (s1 == s2); // true
  // System.out.print (s1.equals (pl.getStrings ( [1]));
  // System.out.print (s2.equals (s1));
 
 
 
 }
}
