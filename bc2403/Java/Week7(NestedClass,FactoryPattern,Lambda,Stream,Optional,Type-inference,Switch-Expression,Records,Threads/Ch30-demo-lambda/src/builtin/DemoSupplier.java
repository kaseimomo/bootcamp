package builtin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
 public static void main(String[] args) {
  // T get();
  Supplier<String> hello = () -> "hello";
  System.out.println(hello.get()); // return String

  // e.g.: Enum
  Supplier<WeekdayEnum> monday = () -> WeekdayEnum.MONDAY;
  WeekdayEnum monday2 = WeekdayEnum.MONDAY;
  printName(() -> WeekdayEnum.MONDAY); //  MONDAY

  // e.g.: LocalDate
  Supplier<LocalDate> now = () -> LocalDate.now(); 
  System.out.println(now.get()); // 2024-04-29 <- now()

  // e.g.: Random()
  Supplier<Integer> random = () -> new Random().nextInt(10) + 1; 
  System.out.println(random.get());
 } 

 public static void printName(Supplier<WeekdayEnum> weekday) {
  System.out.println(weekday.get());
 }
}
