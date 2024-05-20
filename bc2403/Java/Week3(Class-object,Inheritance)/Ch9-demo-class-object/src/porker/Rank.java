package porker;

public enum Rank {
 ONE(1,'A'), //
 TWO(2, '2'), //
 THREE(3, '3'), //
 FOUR(4, '4'), //
 FIVE(5, '5'), //
 SIX(6, '6'), //
 SEVEN(7, '7'), //
 EIGHT(8, '8'), //
 NINE(9, '9'), //
 TEN(10, '9'), //
 JAKE(11, 'J'), //
 QUEEN(12, 'Q'), //
 KING(13, 'K');

 private int rankNo;
 private char rankChar;
 // Contrcutor
 private Rank (int rankNo) {
  this.rankNo = rankNo;
  
 }
 private Rank (char rankChar) {
  this.rankChar = rankChar;
 }
 private Rank (int rankNo, char rankChar) {
  this.rankNo = rankNo;
  this.rankChar = rankChar;
 }

 public int getRankNo() {
  return this.rankNo;
 }
 public char getRankChar() {
  return this.rankChar;
 }
}
