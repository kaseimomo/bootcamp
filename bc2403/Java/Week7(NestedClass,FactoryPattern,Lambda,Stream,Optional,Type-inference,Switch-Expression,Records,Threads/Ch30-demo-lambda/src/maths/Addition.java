package maths;

public class Addition implements MathOperation {
 
 @Override
 public double operate(int x, int y) {
  return x + y;
 }

 public static void main(String[] args) {
  Addition addition = new Addition();
  addition.operate(100, 5);
 }
}
