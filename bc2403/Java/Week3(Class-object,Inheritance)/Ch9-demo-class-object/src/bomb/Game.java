package bomb;

import java.util.Random;
import java.util.Scanner;

public class Game {
 public static void main(String[] args) {
  // min = 1, max = 100
  // random = 47 -> bomb
  // Round 1: Select a number between 1 - 100 -> User input: 45 -> game continue
  // Round 1: Select a number between 46 - 100 -> User input: 59 -> game continue
  // Round 1: Select a number between 46 - 48 -> User input: 47 -> game exit

  Scanner sc = new Scanner(System.in);
  int min = 1;
  int max = 100;
  int boom = new Random().nextInt(max) + 1;
  int n = 0;
  do {
   System.out.println("Select a number between " + min + " - " + max + ":");
   n = sc.nextInt();

   if (n < min || n > max) {
    System.out.println("The number is not in range. Please select again.");
    continue;
   }

   if (n < boom) {
    min = n + 1;
   } else if (n > boom) {
    max = n - 1;
   }
  } while (n != boom);
  System.out.println("Boom!");
  sc.close();
}

}