package Ch14_Inheritance;

import java.math.BigDecimal;

public class Taxi extends Vehicle {
 // Parent class -> Vehicle's instance variables are inherited implicitly: licentPlate and capacity

 private double miniCharge;

 // constructor
 public Taxi(String lp, int c, double mc) {
  super(lp, c); // Constructor from parent class: Vehicle
  this.miniCharge = mc;
 }

 public double getMiniCharge() {
  return this.miniCharge;
 }

 @Override
 public double totalCharge() {
  return BigDecimal.valueOf(super.getCapcity()) //
    .multiply(BigDecimal.valueOf(this.miniCharge)) //
    .doubleValue();
 }



}
