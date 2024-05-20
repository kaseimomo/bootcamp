package porker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

  public static final Suit[] SUITS = //
      new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  public static final Rank[] RANKS = //
      new Rank[] {Rank.ONE, Rank.TWO, Rank.THREE, //
          Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, //
          Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JAKE, //
          Rank.QUEEN, Rank.KING};

  private final Card[] cards; // final the address of array

  private Deck(boolean isEmpty) {
    if (isEmpty) {
      this.cards = new Card[0];
    } else {
      this.cards = new Card[52];
      int idx = 0;
      for (Suit suit : SUITS) { // SUIT
        for (Rank rank : RANKS) { // RANK
          this.cards[idx++] = new Card(rank, suit);
        }
      }
    }
  }

// Use the Collections.shuffle() by ArrayList() 
  private Deck(boolean isEmpty, Card[] cards) {
    this.cards = cards;
  }
  public static Deck shuffle() {
    Deck deck = new Deck(false);
    List<Card> cardList = new ArrayList<>(List.of(deck.cards));
    Collections.shuffle(cardList);
    Card[] shuffledCards = cardList.toArray(new Card[0]);
    return new Deck(false, shuffledCards);
  }

// public Card[] shuffle() {
//   int r = new Random().nextInt(52);
//   for (Suit suit : SUITS) {
//     for (Rank rank : RANKS) {
//       this.cards[r] = new Card(rank, suit);
//     }
//   }
//   return this.cards;
// }


//   public Card[] getCards() {
//     return this.cards;
//   }

  public static Deck empty() {
    return new Deck(true);
  }

  public static Deck full() {
    return new Deck(false);
  }

  public String toString() {
    return "Deck (" //
        + "Cards = " + Arrays.toString(this.cards) //
        + ")";
  }

  public static void main(String[] args) {
    // Deck deck = new Deck();
    // insert 52 card to the deck

    // System.out.println(Deck.shuffle());
    System.out.println(Deck.full());
    Deck s = new Deck(false);
    // System.out.println(Deck.shuffle());

  }

}
