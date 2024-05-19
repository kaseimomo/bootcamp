package JavaQuest;

import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int firstNo = 1;
    int secondNo = 1;
    int[] fs = new int[15];
    for (int i = 0; i < fs.length; i++) {
      fs[i] = firstNo;
      int nextNo = firstNo + secondNo;
      firstNo = secondNo;
      secondNo = nextNo;
    }
    System.out.println(Arrays.toString(fs));

    int n = 10;
    int n1 = 1;
    int n2 = 1;
    for (int j = 3; j <= n; j++) {
      int next = n1 + n2;
      System.out.print(" " + next);
      n1 = n2;
      n2 = next;
    }
    System.out.print(n1 + " " + n2);
  }
}
