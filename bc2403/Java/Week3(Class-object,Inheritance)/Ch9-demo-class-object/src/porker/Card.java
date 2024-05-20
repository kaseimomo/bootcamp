package porker;

import java.util.LinkedList;
import java.util.List;

public class Card {

 private Rank rank;
 private Suit suit;

 // All arguments
 public Card(Rank rank, Suit suit) {
  this.rank = rank;
  this.suit = suit;
 }

 // Get
 public Rank getRank() {
  return this.rank;
 }

 public Suit getSuit() {
  return this.suit;
 }
 
 // toString()
 public String toString() {
  return "\n[" + this.rank.getRankChar() + this.suit.getSuitPic() + "]";
 }

 public static void main(String[] args) {
  List<Card> cards = new LinkedList<>();
  cards.add(new Card(Rank.ONE, Suit.DIAMOND));
 }

}
// public static final char DIAMOND = 'D'; // Card.DIAMAND
// public static final char CLUB = 'C'; //
// public static final char HEART = 'H'; //
// public static final char SPADE = 'S'; //
// public static final int ONE = 1 ; // Card.ONE
// public static final int TWO = 2 ;
// public static final int THREE = 3 ; //
// public static final int FOUR = 4 ; //
// public static final int FIVE = 5 ; //
// public static final int SIX = 6 ; //
// public static final int SEVEN = 7 ; //
// public static final int EIGHT = 8 ; //
// public static final int NINI = 9 ; //
// public static final int TEN = 10 ; //
// public static final int JAKE = 11 ; // Card.JAKE
// public static final int QUEEN = 12 ; //
// public static final int KING = 13 ; //
