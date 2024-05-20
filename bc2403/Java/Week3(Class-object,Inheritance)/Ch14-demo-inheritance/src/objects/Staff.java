package objects;

import java.time.LocalDate;

public class Staff { // 1. All class implicitly extends Topmost class "Objcet"

 private LocalDate joinDate;

 public Staff(LocalDate joinDate) {
  this.joinDate = joinDate;
 }

 public LocalDate getJoinDate() {
  return this.joinDate;
 }

 /* 2. Every class should implement/override its own toString() to represent its object values */
 @Override
 public String toString() {
  return "Sfaff()" + "jointDate=" + this.joinDate + ")";
 }

 public static void main(String[] args) {
  Object o = new Object();
  System.out.println(o.toString()); // java.lang.Object@7344699f 
  // <- obj ref. 唯一可以辨認obj的ID

  Staff s = new Staff(LocalDate.now());
  System.out.println(s);
  System.out.println(s.toString()); // objects.Staff@15db9742
  // After adding toString() , print result: Sfaff()jointDate=2024-04-17)

  Staff s2 = new Staff(LocalDate.now());
  System.out.println(s2.toString()); // objects.Staff @6d06d69c

  System.out.println(s == s2); // false
  System.out.println(s.getJoinDate().compareTo(s2.getJoinDate())); // 0, which means False
  System.out.println(s.getJoinDate().equals(s2.getJoinDate())); // true

  Integer i = 10;
  System.out.println(i.toString());
 }

}
