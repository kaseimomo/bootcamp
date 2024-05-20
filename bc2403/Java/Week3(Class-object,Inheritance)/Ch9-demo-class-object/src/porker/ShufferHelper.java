package porker;

public class ShufferHelper {
 
 private Card[] cards;

 public void riffle() {
  for (int i = 0; i < this.cards.length / 2; i++) { // 0 - 25

  }
 }

 public static void main(String[] args) {
  ShufferHelper shuffleJHelper = new ShufferHelper();
  shuffleJHelper.riffle();
  shuffleJHelper.riffle();
 }
}
