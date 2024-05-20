import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {

 @Override
 public int compare(Ball b1, Ball b2) {
  return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0) ? -1
    : 1;
 }

 public static void main(String[] args) {
  List<Ball> balls = new LinkedList<>();
  balls.add(new Ball(Color.BLACK, 10.3d));
  balls.add(new Ball(Color.YELLOW, 2.0d));
  balls.add(new Ball(Color.YELLOW, 3.2d));
  balls.add(new Ball(Color.RED, 7.4d));
  balls.add(new Ball(Color.RED, 2.4d));

  Collections.sort(balls, new SortByColor());
  System.out.println("\nSort by Color = " + balls);
  Collections.sort(balls, new SortBySize());
  System.out.println("\nSort by Size = " + balls);

  // Lets try random
  int random = new Random().nextInt(2);
  // Comparator<Ball> formular = null;
  // if (random == 0) {
  //  formular = new SortByColor();
  // } else if (random == 1) {
  //  formular = new SortBySize();
  // }
  // Collections.sort(balls, formular);
  Collections.sort(balls, getFormula(random));
  System.out.println("\nRandom is " + random + " = " + balls);
 }

  public static Comparator<Ball> getFormula(int num) { // enum
    if (num == 0) {
     return new SortByColor();
    } else if (num == 1) {
     return new SortBySize();
    }
    return null;
  }
 

}
