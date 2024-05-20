package Exeption_Video;

public class V_Exception {
 /* 1. Assume the method is not allow to have negative numbers... e.g.: Salary */
 public static int totalSalary(int[] arr) {
  int sum = 0;
  for (int x : arr) {
   if (x < 0) // <- if negative No.
    throw new IllegalArgumentException(); // return -1 <- User不會明白
   // IllegalArgumentException() is describing an Error
   sum += x;
  }
  return sum;
 }

 /* 3. loop and append characters from a char[] */
 // ArrayIndexOutOfBoundsException
 public static String geString(char[] characters, int beginIdx, int endIdx) {
  StringBuilder sb = new StringBuilder();
  for (int i = beginIdx; i <= endIdx; i++) {
   sb.append(characters[i]);
  }
  return sb.toString();
 }

 // 6. IllegalStateException
 public static void checkParameters(int n1, int n2) {
  if (n1 + n2 > 0)
   System.out.println("Correct state");
  if (n1 * n2 > 100) {
   System.out.println("Correct state");
  throw new IllegalStateException();
  }
 }



}
