package localdate;

import java.time.LocalDate;

public class HKLocalDate {
 
 private LocalDate[] holidays;

 private LocalDate date;

 public HKLocalDate(int year, int month, int day) { // new HKLocalDate(2020, 1, 1);
  this.date = LocalDate.of(year, month, day);
  }
 
 public HKLocalDate tomorrow() {
  this.date = this.date.plusDays(1);
  return this;
 }

 public String toString(){
  return this.date.toString();
 }

 public static HKLocalDate now() {
  int year = LocalDate.now().getYear();
  int month = LocalDate.now().getMonthValue();
  int day = LocalDate.now().getDayOfMonth();
  return new HKLocalDate(year, month, day);
 }
  
 public static void main(String[] args) {
  HKLocalDate day = new HKLocalDate(2023, 12, 1);
  System.out.println(day.tomorrow().toString());
 }
}
