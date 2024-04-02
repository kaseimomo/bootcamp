package questions;
/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int Max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    // code here ...
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > Max) {
        secondMax = Max;
        Max = nums[i];
      } 
      else if(nums[i] > secondMax && Max > nums[i]) {
        secondMax = nums[i];
      }
    }
    System.out.println("Second Max = " + secondMax);

    // nums2
    int Max2 = Integer.MIN_VALUE;
    int secondMax2 = Integer.MIN_VALUE;
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] > Max2) {
        secondMax2 = Max2;
        Max2 = nums2[i];
      } 
      else if(nums2[i] > secondMax2 && Max2 > nums2[i]) {
        secondMax2 = nums2[i];
      }
    }
    System.out.println("Second Max = " + secondMax2);

    // nums3
    int Max3 = Integer.MIN_VALUE;
    int secondMax3 = Integer.MIN_VALUE;
    for (int i = 0; i < nums3.length; i++) {
      if (nums3[i] > Max3) {
        secondMax3 = Max3;
        Max3 = nums3[i];
      } 
      else if(nums3[i] > secondMax3 && Max3 > nums3[i]) {
        secondMax3 = nums3[i];
      }
    }
    System.out.println("Second Max = " + secondMax3);

    // nums4
    int Max4 = Integer.MIN_VALUE;
    int secondMax4 = Integer.MIN_VALUE;
    for (int i = 0; i < nums4.length; i++) {
      if (nums4[i] > Max4) {
        secondMax4 = Max4;
        Max4 = nums4[i];
      } 
      else if(nums4[i] >= secondMax4 && Max4 >= nums4[i]) {
        secondMax4 = nums4[i];
      }
      
    }
    System.out.println("Second Max = " + secondMax4);

  }
}