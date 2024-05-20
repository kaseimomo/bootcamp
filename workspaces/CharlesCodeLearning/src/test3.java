public class test3 {
 public static void main(String[] args) {
  String phoneNo = "53451338";
  int max = -1;
  for (int i = 0; i < phoneNo.length(); i++) {
   int n = Character.getNumericValue(phoneNo.charAt(i));
   if (n > max) {
    max = n;
   }
  }
  System.out.println(max);
 }
}
