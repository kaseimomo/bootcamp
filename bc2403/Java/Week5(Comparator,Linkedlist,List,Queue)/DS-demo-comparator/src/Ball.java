import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
 private Color color;
 private double size;

 public Ball(Color color, double size) {
  this.color = color;
  this.size = size;
 }

 public double getSize() {
  return this.size;
 }

 public Color getColor() {
  return this.color;
 }

 @Override
 public int compareTo(Ball b) {
  // this, b -> int
  // -1(<0) 將this啲個element向前行. -1 means (this) object move to left
  // return this.color == Color.YELLOW ? -1 : 1;
  // return this.size > b.getSize() ? -1 : 1;
  if (this.color == Color.YELLOW)
   return -1;
  if (this.color.name().charAt(0) > b.getColor().name().charAt(0))
   return -1;
  else if (this.color.name().charAt(0) < b.getColor().name().charAt(0))
   return 1;
  return this.color == b.getColor() && this.size > b.getSize() ? -1 : 1;
 }

 @Override
 public String toString() {
  return "Ball(" + "Size=" + this.size + ", Color=" + this.color + ")";
 }

 public static void main(String[] args) {
  long start = System.currentTimeMillis();

  List<Ball> balls = new LinkedList<>();
  balls.add(new Ball(Color.BLACK, 10.3d));
  balls.add(new Ball(Color.YELLOW, 2.0d));
  balls.add(new Ball(Color.YELLOW, 3.2d));
  balls.add(new Ball(Color.RED, 7.4d));
  balls.add(new Ball(Color.RED, 2.4d));
  Collections.sort(balls);
  // Compile-time Check if the list of the objects implements a contract "Comparable"
  System.out.println(balls);

  // Let's try YELLOW ball always be the first

  long end = System.currentTimeMillis();
  System.out.println(end - start + "ms");
 }

 public static int getX(List<String> strings) {
  return strings.size();
 }

 // Same Method Signature, because List<Integer> is same as List<String, from input parameter perspective


}
