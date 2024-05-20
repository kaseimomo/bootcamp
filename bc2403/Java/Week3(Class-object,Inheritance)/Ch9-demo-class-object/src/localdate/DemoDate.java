package localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Random;

// Java Project/File: Auto-imported -> java.lang (Math)
// JDK -> java.time, java.util -> self import

public class DemoDate {
 public static void main(String[] args) {
  LocalDate day = LocalDate.of(2023, 12, 1);
  System.out.println(day.toString());

  LocalDate day2 = LocalDate.parse("2023-12-01");
  System.out.println(day2.toString());

  System.out.println(day == day2); // false
  System.out.println(day.compareTo(day2)); // 0
  System.out.println(day.equals(day2)); // true

  System.out.println(day.isAfter(LocalDate.of(2023, 11, 30))); // true
  System.out.println(day.isBefore(day2)); // false

  int year = day.getYear();
  Month month = day.getMonth();
  System.out.println(month.length(false)); // 31
  System.out.println(Month.of(2).length(false)); // 28

  int Random = new Random().nextInt(3); // 0 - 2

  Year y1 = Year.of(2024);
  System.out.println(y1.isLeap());

  System.out.println(day.getDayOfWeek().toString());

  System.out.println(day.plusDays(31).toString());
  LocalDate day3 = day.plusMonths(2);
  LocalDate day4 = day.plusMonths(4);

  LocalDate today = LocalDate.now();
  System.out.println(today.toString());
 }
}
