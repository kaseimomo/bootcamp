package JavaQuest;
/*
 * Sum up to Zero
 */

import java.util.Arrays;
import java.util.Random;

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1

  }

  // code here ...
  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  public static int[] sumToZero(int n) {
    int[] arr = new int[n];
    int index = 0;
    for (int i = 0; i < n / 2; i++) {
      arr[index++] = -i - 1;
      arr[index++] = i + 1;
    }
    System.out.println(Arrays.toString(arr));
    return arr;



    // Random random = new Random();
    // int rn = 0;
    // int[] arr = new int[n];
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0)
    // rn = random.nextInt(n);
    // arr[i] = rn;
    // }
    // System.out.println(Arrays.toString(arr));
    // return arr;
  }

}
