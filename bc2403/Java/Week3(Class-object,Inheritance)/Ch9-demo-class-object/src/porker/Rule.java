package porker;

public class Rule {

  // Design : Single Card
  // instance method: card.compareTo(Card card) -> 1,0,-1
  // static method: compareTo(Card c1, Card c2) -> 1,0,-1

  public static boolean isFullHouse(Card[] cards) { // 應該開個新class, like Rules??
    // Early Return
    if (cards.length != 5)
      return false;
    // main logic ...
    return false;
  }


  public static void main(String[] args) {

  }
}
