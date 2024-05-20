package porker;

// Meaning: static final
public enum Suit {
 DIAMOND(1, '\u2662'), //
 CLUB(2,'\u2663'), //
 HEART(3, '\u2661'), //
 SPADE(4, '\u2660');

 private int suitRank;
 private char suitPic;
 // Constructor
 private Suit (int suitRank, char suitPic) {
  this.suitRank = suitRank;
  this.suitPic = suitPic;
 }

 public int getSuitRank() {
  return this.suitRank;
 }
 public char getSuitPic() {
  return this.suitPic;
 }
}
