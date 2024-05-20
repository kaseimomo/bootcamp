package maths;

@FunctionalInterface
public interface MathOperation {
 double operate(int x, int y);
// 這裡是作者提供的骨架
 static double calculate(int x, int y, MathOperation formular) {
  return formular.operate(x, y);
 }
// 下面可以令user可以自由發揮, 創作不同公式
 public static void main(String[] args) {
  // Create Class Addition implement MathOperation
  // @Override operate() 
  // a + b -> new Addition()
  MathOperation addtion = (a, b) -> a + b;
  MathOperation subtract = (a, b) -> a - b;
  MathOperation multiply = (a, b) -> a * b;
  MathOperation divide = (a, b) -> a / b;

  System.out.println(MathOperation.calculate(100, 5, addtion));
  System.out.println(MathOperation.calculate(100, 5, subtract));
  System.out.println(MathOperation.calculate(100, 5, multiply));
  System.out.println(MathOperation.calculate(100, 5, divide));



 }
}
