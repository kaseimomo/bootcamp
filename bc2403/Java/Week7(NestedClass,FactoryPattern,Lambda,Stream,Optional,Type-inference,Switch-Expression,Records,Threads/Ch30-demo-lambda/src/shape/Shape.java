package shape;

import java.math.BigDecimal;

public interface Shape {

 // Lambda -> Able to skip Class to implement the interface
 // However, for example: in Shape class,
 // we cannot use other class's attributes: 
 // Circle - radius or Square - length

 double area();


 public static void main(String[] args) {
  Shape circle = () -> {
   return 3.0d * 3.0d * Math.PI;
  };

  Shape square = () -> {
   return 3.0d * 3.0d;
  };

 Shape circumference = () -> {
  return BigDecimal.valueOf(4.0d).doubleValue() * 2 * Math.PI; 
 };

 }
}


