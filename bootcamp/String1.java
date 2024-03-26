public class String1 {
  
  // Java: compile language: 
  // Java file (Helloworld.java) ->Compliation (javac) -> class file(byte code)

  // "String" is a keyword in Java.
  public static void main(String[] args){
    int x = 0;
    char c2 = 's';

    String y = "hello world!";
    String s = "1";
    //int sum = x + s
    
    String s3 = ""; // empty string
    String s4 = " "; // space

    // Tool for String
    // length()
    int lengthOfY = y.length(); // 12
    System.out.println(y.length());

    // charAt()
    char character = y.charAt(2); // l
    System.out.println(y.charAt(0));
    System.out.println(y.charAt(1));
    System.out.println(y.charAt(2));

    // System.out.println(y.charAt(100)); // runtime error

    // equals
    String s1 = "hello";
    String s2 = "hello";

    boolean isS1EqualsToS2 = s1.equals(s2);
    System.out.println(isS1EqualsToS2);

  }
}
