package Ch11_InstanceMethod;

public class VariableArg {
 public static int sum(int[] nums) {
  int sum = 0;
  for (int num : nums) {
   sum += num;
  }
  return sum;
 }

 // public static int sum(int... nums) {
 //  int sum = 0;
 //  for (int num : nums) {
 //   sum += num;
 //  }
 //  return sum;
 // }
 public static void main(String[] args) {
  // System.out.println(sum());
 }
}
