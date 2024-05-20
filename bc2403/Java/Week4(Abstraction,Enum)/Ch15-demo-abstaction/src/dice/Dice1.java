package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice1 implements Roll {

 private final Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE, // final 係final個指針
   Color.PINK, Color.BLACK, Color.WHITE};

 public Color[] getColors() {
  return this.colors;
 }

 @Override
 public int roll() {
  int idx = new Random().nextInt(6); // 0,1,2,3,4,5
  return colors[idx].getValue();
 }
 public Color roll2() {
  int idx = new Random().nextInt(6); // 0,1,2,3,4,5
  return colors[idx];
 }

 

 @Override
 public String toString() {
  return "Dice1(" + "colors=" + Arrays.toString(this.colors) + ")";
 }

 public static void main(String[] args) {
  Dice1 d = new Dice1();
  d.getColors()[1] = Color.RED;
  System.out.println(d.toString());
 }

 // RED 1
 // YELLOW 2
 // BLUE 3
 // PINK 4
 // BLACK 5
 // WHITE 6
}
