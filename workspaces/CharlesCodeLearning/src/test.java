import java.util.Arrays;
import java.util.Random;

public class test {
  public static void main(String[] args) {
    // equals()
    String day = "Sunday"; // Monday, Tuesday...
    // Print out: Sunday is a weekend.
    String week;
    if (day == "Monday" || day == "Tuesday" || day == "Wednesday"
        || day == "Thursday" || day == "Friday") {
      week = "weekday";
      System.out.println(day + " is " + week + ".");
    } else {
      week = "Weekend";
      System.out.println(day + " is " + week + ".");
    }
    // print out: June is my birthmonth.
    String month = "June";
    if (month == "June") {
      System.out.println(month + "is my birthmonth.");
    }


    for (int i = 1; i < 6; i += 2) {
      for (int k = 0; k < (2 - i / 2); k++) {
        System.out.print(" ");
        // Step 1: i = 1 -> k = 0 < 1.5 -> print (" ")
        // Step 2: i = 1 -> k = 1 < 1.5 -> print (" ")
        // Step 3: i = 1 -> k = 2 < 1 (false) -> no print
        // Step 6: i = 3 -> k = 0 < 0.5 -> print (" ")
        // Step 7: i = 3 -> k = 1 < 0.5 (false) -> no print
        // Step 12: i = 5 -> k = 0 < -0.5 (false) -> no print
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
        // Step 4: i = 1 -> j = 0 < 1 -> print ("*")
        // Step 5: i = 1 -> j = 1 < 1 (false) -> no print
        // Step 8: i = 3 -> j = 0 < 3 -> print ("*")
        // Step 9: i = 3 -> j = 1 < 3 -> print ("*")
        // Step 10: i = 3 -> j = 2 < 3 -> print ("*")
        // Step 11: i = 3 -> j = 3 < 3 (false) -> no print
        // Step 13: i = 5 -> j = 0 < 5 -> print ("*")
        // Step 14: i = 5 -> j = 1 < 5 -> print ("*")
        // Step 15: i = 5 -> j = 2 < 5 -> print ("*")
        // Step 16: i = 5 -> j = 3 < 5 -> print ("*")
        // Step 17: i = 5 -> j = 4 < 5 -> print ("*")
        // Step 18: i = 5 -> j = 5 < 5 (false) -> no print
      }
      System.out.println("");
    }
    for (int i = 3; i > 0; i -= 2) {
      for (int k = 0; k < (2 - i / 2); k++) {
        System.out.print(" ");
        // Step 1: i = 3 -> k = 0 < 0.5 -> print (" ")
        // Step 2: i = 3 -> k = 1 < 0.5 (false) -> no print
        // Step 7: i = 1 -> k = 0 < 1.5 -> print (" ")
        // Step 8: i = 1 -> k = 1 < 1.5 -> print (" ")
        // Step 9: i = 1 -> k = 2 < 1.5 (false) -> no print
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
        // Step 3: i = 3 -> j = 0 < 3 -> print ("*")
        // Step 4: i = 3 -> j = 1 < 3 -> print ("*")
        // Step 5: i = 3 -> j = 2 < 3 -> print ("*")
        // Step 6: i = 3 -> j = 3 < 3 (false) no print
        // Step 10: i = 1 -> j = 0 < 1 -> print ("*")
        // Step 11: i = 1 -> j = 1 < 1 (false) no print
      }
      System.out.println("");
    }

    // find how many space in a string "My name is Charles. She is my wife, Moon."
    String str = "My name is Charles. She is my wife, Moon.";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        count++;
      }
    }
    System.out.println("The are " + count + " spaces in the string.");

    // Find the index of space which before "Charles" and "Moon".
    for (int i = 0; i < str.length(); i++) {
      if (str.indexOf("Charles") == i) {
        System.out.println(i - 1);
      }
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.lastIndexOf("Moon") == i) {
        System.out.println(i - 1);
      }
    }

    int value = 127;
    for (int i = 0; i < 10; i++) {
      value++;
    }
    System.out.println("Value " + value);

    String str1 = "Hello! World! ";
    System.out.println(str1.substring(7, 12));
    System.out.println(str1.trim());
    System.out.println(str.compareTo(str1));

    String str2 = "Moon"; // use ascii as reference to compare integer; M = 77
    String str3 = "Hello"; // H = 72
    System.out.println(str2.compareTo(str3)); // 77 - 72 = 5

    // What is concat String? - concentrate , join stings together
    System.out.println(str1.concat(str));


    Integer num = Integer.valueOf(123);
    Integer num2 = Integer.valueOf(123);
    Integer num3 = new Integer(123);
    System.out.println(num.equals(num2)); // true
    System.out.println(num == num2); // true
    System.out.println(num.equals(num3)); // true
    System.out.println(num == num3); // false

    Integer num4 = Integer.valueOf(128);
    Integer num5 = Integer.valueOf(128);
    Integer num6 = new Integer(128);
    System.out.println(num4.equals(num5)); // true
    System.out.println(num4 == num5); // false
    System.out.println(num4.equals(num6)); // true
    System.out.println(num4 == num6); // false


    /*
     * Hence, "==" is checking if 2 objects are the same. -> reference quality Moreover, checking 2 integer objects which over 127 will present false.
     * 
     * equals() is checking if 2 values are the same. -> value quality 用equals()先係專業寫Java
     */

    // Autoboxing
    Boolean boo = true;
    Character abc = 'A';
    Byte bit = 123;
    Double db = 12.34;
    // constructors that accept primitive value
    Boolean boo1 = new Boolean(true);
    Character abc1 = new Character(abc);
    Byte bit1 = 123;
    new Byte((byte) 123);
    Double db1 = new Double(12.34);
    // constructors that accept String
    // constructors that accept using static method valueOf()

    int[] arr = new int[] {8, 3, 4, 9, 6};
    System.out.println(arr.length); // 5
    // Find the max fo the array number
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
    System.out.println(Arrays.toString(arr));


    boolean result = false;
    String[] name1 = new String[] {"Sunny", "Charles", "Indi", "Eric"};
    for (int i = 0; i < name1.length; i++) {
      if (name1[i].contains("Eric") == true) {
        System.out.println(name1[i]);
      }
    }

    // swap the min to the head of array
    int min = Integer.MAX_VALUE;
    int temp;
    int idx = 0;
    int[] numbers = new int[] {1, 101, -1000, -3, 4};
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
        idx = i;
        temp = numbers[0];
        numbers[0] = min;
        numbers[idx] = temp;
      }
    }
    System.out.println(Arrays.toString(numbers));

    int[] numbers1 = {1, 2, 3, 2, 1, 3, 1, 4, 5, 4};
    int[] countArray = new int[numbers1.length];
    for (int i = 0; i < numbers1.length; i++) {
      countArray[numbers1[i]] += 1;
    }
    System.out.println(Arrays.toString(countArray));
    // Find the maximum count
    int maxCount = 0;
    for (int count1 : countArray) { // 唔識睇啲個loop...? This is for-each-loop
      if (count1 > maxCount) {
        maxCount = count1;
      }
    }
    System.out.println("Maximum count = " + maxCount);
    // please continue week 2 notes: 6-Array -> Counting Algorithms

    /* loop2 */
    // for-each-loop
    // Syntax 語法
    // for (Identifier : Collection) {}
    // If you want to through all element from the beignning, you can use for-each
    // int
    int[] numbers2 = new int[] {1, 2, 3, 4, 5, 6};
    for (int number : numbers2) {
      System.out.println(number);
    }
    // String
    String[] name2 = new String[] {"Moon", "Nicole", "Katie", "Yuna", "Joyce"};
    for (String name : name2) {
      System.out.println(name);
    }
    // String.split()
    // Split the string with specified words or delimiter like "," || " " || "."
    String str4 = "Hello, Charles! Welcome to Java World!";
    String[] parts = str4.split(" ");
    for (String part : parts) {
      System.out.println(part);
    }
    String diamond = "  *, ***,*****, ***,  *"; // Thats hard coded XDDDD
    String[] print = diamond.split(",");
    for (String newDiamond : print) {
      System.out.println(newDiamond);
    }

    // While Loop
    int count2 = 1;
    while (count2 >= 1 && count2 <= 5) {
      System.out.println(count2);
      count2++;
    }
    boolean condition = true;
    while (!condition) { // not true = false
      System.out.println("This line won't compile...");
    }
    // Break statement
    count = 0;
    while (true) {
      count++;
      System.out.println("Count = " + count);
      if (count > 5) { // 1,2,3,4,5,6
        break;
      }
    }
    // Continue statement
    count = 0;
    while (count < 5) {
      count++;
      if (count == 3) {
        continue;
      }
      System.out.println(count);
    }

    // do-while
    // Use scanner to print postivie numbers
    // int positiveNo;
    // Scanner sc = new Scanner(System.in);
    // do{
    // System.out.println("Please enter a positive numbers: ");
    // positiveNo = sc.nextInt();
    // } while (positiveNo <= 0);
    // System.out.println("The number you input is " + positiveNo + ". Thanks you.");


    // 8-Static Methods

    int n = 5;
    Random random = new Random();
    int randomNumber = random.nextInt(n);
    System.out.println(randomNumber);


    int[] nums = new int[] {1, 2, 3, 2};
    int count4 = 0;
    for (int i = 0; i < nums.length; i++) {
      int same = 0;
      for (int j = 0; j < nums.length; j++) {
        if (i == j) {
          continue;
        }
        if (nums[i] == nums[j]) {
          same++;
        }
      }
      if (same == 0) {
        count4 += nums[i];
      }
    }
    System.out.println(count4);

    char c = '5';
    int f = 5;
    int result3 = c + f;
    System.out.println(result3);

    int[] moon = new int[] {3, 6, 1, 9};
    String[] Charles = new String[] {"Moon", "Indi", "Sunny", "Eric"};

    System.out.println(Charles[2]);

  }
}


