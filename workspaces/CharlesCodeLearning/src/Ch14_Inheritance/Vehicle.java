package Ch14_Inheritance;

public abstract class Vehicle {
 private String licentPlate;
 private int capacity;

 public Vehicle(String lp, int c) {
  this.licentPlate = lp;
  this.capacity = c;
 }

 public int getNoOfPassenger() {
  return this.capacity - 1;
 }

 public String getLicentPlate() {
  return this.licentPlate;
 }

 public int getCapcity() {
  return this.capacity;
 }

 public abstract double totalCharge();


}
