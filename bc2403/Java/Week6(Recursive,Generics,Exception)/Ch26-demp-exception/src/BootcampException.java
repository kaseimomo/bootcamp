public class BootcampException extends Exception {
 // "extends Exception" implies "BootcampException" is a checked exception
 // because Exception.class is a checked exception

 public static void main(String[] args) { // throw JVM
  try {
   int x = 10;
   int y = 10;
   calculate(x, y);  
   System.out.println("End of Calculate() method");
  } catch (BootcampException e) { // e代表個exception
   System.out.println("Error: Exception in calculate() method, recovery step...");
  } finally { // 無論成功與否都要行到最後 - finally
   System.out.println("Finally.. ");
  }



 }

 public static int divide(int x, int y) {
  return x / y; // if y = 0, JVM will throw an object of ArithmeticException
  // /0 唔應該發生
  // null唔應該發生
  // 所以唔應該發生話比java聽要try chatch
 }

 public static void calculate(int x, int y) throws BootcampException { // solution 1
  try {
   divide(x, y);
   // ... throw  IAE
  } catch (ArithmeticException | IllegalArgumentException e) { // or
   throw new BootcampException();
   // because it is a checked exception, so we have to handle it before compliation
  }
 }
}
