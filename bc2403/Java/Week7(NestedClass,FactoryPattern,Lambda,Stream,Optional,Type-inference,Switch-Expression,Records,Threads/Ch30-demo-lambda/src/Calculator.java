@FunctionalInterface // <- one method per interface
public interface Calculator {
 int square(int x);
 

 public static void main(String[] args) {
  // lambda
  Calculator calculator = (x) -> {
   return (int) Math.pow(x, 2);
  };
  System.out.println(calculator.square(2)); // 4
  System.out.println(calculator.square(5)); // 25

  // If we have only one parameter in the method of FunctionalInterface
  Calculator calculator2 = x -> (int) Math.pow(x, 2);
  System.out.println(calculator2.square(3)); // 9
  System.out.println(calculator2.square(4)); // 16

  // What is this?
  Calculator calculator3 = x -> 3; // means x is always 3
  System.out.println(calculator3.square(0)); // 3
  System.out.println(calculator3.square(2)); // 3
  System.out.println(calculator3.square(7)); // 3
  

 }
}
