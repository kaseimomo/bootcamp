package Shapes;

import java.math.BigDecimal;

// 1. You can implements more than one Interface in a class
public class Circle implements Shape { // implements -> 實行

 private double radius;

 public double getRadius() {
  return this.radius;
 }

 @Override
 public double area() {
  return BigDecimal.valueOf(this.radius) //
  .multiply(BigDecimal.valueOf(this.radius)) //
  .multiply(Shape.PI) //
  .doubleValue();
 }

 @Override
 public String print() {
  return String.valueOf(this.radius);
 }

  public void sleep() {
   System.out.println("sleep...");
  }



 public static void main(String[] args) {
  // Polymorhism
  Shape s = new Circle(); // OK
  s.area();
  s.print();
  // s.sleep();
 }


}
