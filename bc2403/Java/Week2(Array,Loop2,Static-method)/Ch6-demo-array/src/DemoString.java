public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "";
    String s3 = " ";

    String s4 = "  ";

    // isEmpty() vs isBlank()
    boolean isEmptyResult = s2.isEmpty(); // true
    System.out.println(isEmptyResult);

    System.out.println(s.isEmpty()); // false
    System.out.println(s3.isEmpty()); // false

    System.out.println(s.isBlank()); // false
    System.out.println(s2.isBlank()); // true
    System.out.println(s3.isBlank()); // true (different)

    System.out.println(s4.isEmpty()); // false
    System.out.println(s4.isBlank()); // true

    // substring()
    String result = s.substring(0, 3); // beginIndex extends to endIndex - 1
    System.out.println(result); // hel

    result = s.substring(2);
    System.out.println(result); // llo

    // toLowercase()
    System.out.println("HELlo".toLowerCase()); // hello
    // toUppercase()
    System.out.println("HELlo".toUpperCase()); // HELLO

    // String 提供咗好多有用*基礎*的工具

    System.out.println(s.contains("ll")); // true

    // startsWith()
    System.out.println(s.startsWith("he")); // true
    // endsWith()
    System.out.println(s.endsWith("lo")); // true

    // replace()
    String after = s.replace("l", "z");
    System.out.println(after); // hezzo

    // trim() -> remove the space at the beginning and the tail of the string
    String s5 = "     hello  ! world  ";
    System.out.println(s5.trim()); // hello ! world
    System.out.println(s5.replace(" ", "")); // hello!world

    // indexOf()
    char c = s.charAt(2); // 'l'
    System.out.println(s.indexOf('l')); // 2, the index of the first matching character
    System.out.println(s.indexOf('!')); // -1
    System.out.println(s.lastIndexOf('l')); // 3 // try use foo loop to find last index of "hello"

    System.out.println("hello".equals("hello")); // true
    System.out.println("hello".equals("Hello")); // false
    System.out.println("hello".equalsIgnoreCase("Hello")); // true


  }
}
