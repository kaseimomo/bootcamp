package questions;

import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Input a month number: 2 Input a year: 2016 February 2016 has 29 days
   * 
   * Input a month number: 12 Input a year: 2014 December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        MonthOfName = "January";
        // Code here ...
        number_Of_DaysInMonth = 31;
        break;
      case 2:
        MonthOfName = "February";
        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // otherwise the February should have 28 days only
        // how about other months, December?
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
          number_Of_DaysInMonth = 29;
        } else {
          number_Of_DaysInMonth = 28;
        }
        break;
      case 12:
        MonthOfName = "December";
        // Code here ...
        number_Of_DaysInMonth = 31;
        System.out.println(MonthOfName + " " + year + " has "
            + number_Of_DaysInMonth + " days\n");
        break;
    }
    System.out.print(
        MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");

        input.close();
  }

}


