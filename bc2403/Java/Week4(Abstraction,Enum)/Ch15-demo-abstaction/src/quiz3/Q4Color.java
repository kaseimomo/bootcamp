package quiz3;

public enum Q4Color {
 RED(1), YELLOW(2), BLUE(3);

static int counter = 0;
 int value;

 Q4Color(int i) {
  this.value = i;
  // counter++; // not ok
 }

 public static void main(String[] args) {
  System.out.println(Q4Color.counter);
 }
}
