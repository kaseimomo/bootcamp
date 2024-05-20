import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
 @Override
 public int compare(Integer a, Integer b) {
  return a > b ? -1 : 1;
 }
 
}
