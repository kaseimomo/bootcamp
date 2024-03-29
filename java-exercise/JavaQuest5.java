package questions;

public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output: We found 3 character c in the String.
   * 
   * When target = 'z', the expected output: Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    int count = 0;
    int countz = 0;
    // Use a loop to count the target of character in a String.
    // code here ...
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      }
    }
    if (count >= 0) {
      System.out.println("we found " + count + "character in the String.");
    } else {
      System.out.println("Not Found.");
    }
    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here ...
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'z') {
        countz++;
      }
    }
    if (countz >= 0) {
      System.out.println("Not Found.");
    }
  }
}
