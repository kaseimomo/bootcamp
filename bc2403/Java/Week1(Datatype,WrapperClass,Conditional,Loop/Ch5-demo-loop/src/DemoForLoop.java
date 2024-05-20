public class DemoForLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * x; // 2 * 2 = 4
    x *= x; // 4 * 2 = 8

    // 2^60

    /*  */
    // System.out.println("hello world");
    // System.out.println("hello world");

    /* for (initialization; continue condition; incremental rule) */
    for (int i = 0; i < 3; i++) {
      // Step 1: int i = 0
      // Step 2: i < 3 ? yes
      // Step 3: Print hello world
      // Step 4: i++ -> i become 1
      // Step 5: i < 3 ? yes
      // Step 6: Print hello world
      // Step 7: i++ -> i become 2
      // Step 8: i < 3 ? yes
      // Step 9: Print hello world
      // Step 10: i++ -> i become 3
      // Step 11: i < 3 ? no
      // Step 12: no print */

      /* Never to re-assign value to i -> (i++) within the loop */
      System.out.println("hello world" + i); /* it will print 3 times */
    }
    for (int i = 5; i >= 0; i--) { // 5, 4, 3, 2, 1, 0
      System.out.println("hello world" + i);
    }

    // print out: 1 3 5 7 9
    for (int i = 1; i <= 9; i += 2) {
      System.out.print(i + " ");
    }

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) { // odd number
        System.out.print(i + " ");
      }
    }
    String s = "abcdefg";
    // print out: aceg
    // charAt(), String concat
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        result += s.charAt(i);
      }
    }
    System.out.println(result);

    // Find if "cd" is in "abcdefg".
    String pattern = "cd";
    // "abcdefg" has string pattern "cd", so print true
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'd') {
        System.out.println("true.");;
      }    
   }
    // Use String.contain
     boolean contain = s.contains("cd");
     System.out.println(contain);


    // 55 = 1 + 2 + 3 + 4 + ... + 10
    int max = 10;
    int min = 1;
    // print: 55
    int k = 0;
    for (int i = min; i <= max; i++) {
      k += i;
    }
    System.out.println(k); // 55

    // sum up all even numbers
    int e = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 == 0) {
        e += i;
      }
    }
    System.out.println(e);

    // Counting
    String str = "hello world";
    // count the number of 'l' -> 3
    k = 0;
    char l = 'l';
    for (int i = 0; i < str.length(); i++) {
      // if chatAt()
      if (str.charAt(i) == l) {
        k ++;
      }
    }
    System.out.println(k);

    // sum up all odd numbers, and minus all even numbers
    e = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 == 0) {
        e -= i;
      } else {
        e += i;
      }
    }
    System.out.println(e);
  }

}


