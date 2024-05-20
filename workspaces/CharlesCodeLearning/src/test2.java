import java.util.Arrays;

public class test2 {
  public static void main (String[] args) {
    
    byte value = 127;
    for (int i = 0; i < 10; i++) {
      value++;
      System.out.println("Value " + value);
    }

    int i = Integer.MAX_VALUE; // 2147483647
    System.out.println(i);
     System.out.println(i + 1); // -2147483648

     long l = Long.MAX_VALUE;
     System.out.println(l);
     System.out.println(l + 1);

     int asciiCode = 65;
     char character = (char)asciiCode;
     System.out.println(character); // A

    character = 'a';
    asciiCode = character;
    System.out.println(asciiCode); // 97

    // Upper set
    int row = 5;
    for (int a = 1; a <= row ; a += 2) {
      for (int b = 1; b <= row - a; b += 2) {
        System.out.print(" ");
      }
      for (int c = 1; c <= a; c++) {
        System.out.print("*");
      }
      System.out.println("");
    } 
    // Lower set
    for (int a = 3; a > 0; a -= 2) {
      for (int b = 1; b <= row - a; b += 2) {
        System.out.print(" ");
      }
      for (int c = 1; c <= a; c++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    int[] integers = {20, 10, 40};
    byte[] bytes = new byte[] {2, 4, 1};
    int score = 0;
      for (i = 0; i < 3; i++) {
        if (i % 2 == 1) {
          score += integers[i];
        }else {
          score += bytes[i];
        }
      }
      System.out.println(score);

      int[] arr = new int[] {3,0,1,1,9,7};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));

  }
}
