package objects;

import java.util.Objects;

public class College {

 private double area;
 private double gps;

 public double getArea() {
  return this.area;
 }

 public double getGps() {
  return this.gps;
 }

 // equals()
 @Override
 public boolean equals(Object o) {
  if (this == o)
   return true;
  if (!(o instanceof College))
   return false;
  College c = (College) o;
  return Objects.equals(this.area, c.getArea());
 }

 // hashCode()
 @Override 
 public int hashCode() { 
  return Objects.hash(this.area); 
  // 這個override的意思是 入面個value是一樣的話, 就retrun返一樣的hashcode
 }

 @Override
 public String toString() {
  return "College(" //
    + "area=" + this.area //
    + ")";
 }

 public static void main(String[] args) {
  Object o = new College(); // Polymorphism
  // College x = new Object(); Not okay -> Object() level is higher
  // College x = new College(); Okay
  o.hashCode(); //
  System.out.println(o.hashCode()); // After override -> address -> int value -> 31
  System.out.println(new College().hashCode()); // After override -> 31
  System.out.println(o.equals(new College())); // when not override -> false; After override -> true


  if (o instanceof College) { // ask if o is an object of College.class, instanceof -> true/false
   College c2 = (College) o;
  }

  Class<?> s = o.getClass();
  System.out.println(s.getName()); // return package String -> objects.College
  System.out.println(o.getClass().getName());


  String str = "ABC";
  System.out.println(str.hashCode()); // 64578

  System.out.println(o);
 }


}
