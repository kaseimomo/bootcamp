package Practice;

public class Square {

 private int length;
 
 // Constructor -> Class name
 public Square (int length) {
  this.length = length;
 }

 public void setLength(int length) {
  this.length = length;
 }

 public int getLength() {
  return this.length;
 }

 // Static Method - Area
 public static int area(int length) {
  return length * length;
 }
 // Instance Method - Area
 public int area() {
  return this.length * this.length;
 }

// Static Method - resize
public static void reSize(Square square, int newLength) {
 square.setLength(newLength);
}
// Instance Method - resize
public void reSize(int length) {
 this.length = length;
}

 
}
