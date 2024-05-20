import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // Get User Input
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a number: ");
    int input = sc.nextInt(); //

    System.out.println("input = " + input);
    sc.close();
  }
 
}
