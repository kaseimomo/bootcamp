package questions;

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
  }
}
