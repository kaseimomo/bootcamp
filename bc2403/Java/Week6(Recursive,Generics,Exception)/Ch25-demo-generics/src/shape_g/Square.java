package shape_g;

public class Square implements Shape{
 private double length;

 public Square(double length) {
  this.length = length;
 }
 public double getLength() {
  return this.length;
 }

 public void setLength(double length) {
   this.length = length;
 }

 @Override
 public double area(){
  return this.length * this.length;
 }

}
