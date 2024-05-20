import java.util.Arrays;

public class LoopPractice {

 public int[] getConcatenation(int[] nums) {
  int[] arr = new int[2 * nums.length];
  for (int i = 0; i < nums.length; i++) {
   arr[i] = nums[i];
   arr[i + nums.length] = nums[i];
  }
  return arr;
 }

 public int numIdenticalPairs(int[] nums) {
  int n = nums.length;
  int count = 0;
  for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
       if (nums[i] == nums[j] && i < j) { // "i < j" is while the same position will not be counted.
           count++;
          }
      }
  } 
  return count; 
}

 public static void main(String[] args) {
   LoopPractice test = new LoopPractice();
   int[] nums = {1,2,1};
   System.out.println(Arrays.toString(test.getConcatenation(nums)));

  LoopPractice identicalPair = new LoopPractice();
  int[] ip = new int[] {1,5,1,2,1,5};
  System.out.println(identicalPair.numIdenticalPairs(ip));

  Integer min = Math.min(3, 4);
  System.out.println(min.compareTo(3));

  







 }
}
