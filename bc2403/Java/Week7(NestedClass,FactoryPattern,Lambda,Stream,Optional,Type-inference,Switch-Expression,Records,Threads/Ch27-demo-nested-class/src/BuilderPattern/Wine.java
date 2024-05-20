package BuilderPattern;

public class Wine {
 private Variety variety;
 private int size;

 enum Variety {
  CABERNET_SAUVIGNON("Red Wine"), //
  PINOT_NOIR("Red Wine"), //
  MERLOT("Red Wine"), //
  SAUVIGNON_BLANC("White Wine"), //
  CHARDONNAY("White Wine"), //
  RIESLING("White Wine"),;

  private String color;

  private Variety(String color) {
   this.color = color;
  }
 }

 private static class WineMaker {
  private Variety variety;
  private int size;

  public WineMaker setVariety(Variety variety) {
   this.variety = variety;
   return this;
  }

  public WineMaker setSize(int size) {
   this.size = size;
   return this;
  }

  public Wine cap() {
   return new Wine(this);
  }
 }

 public Wine(WineMaker wineMaker) {
  this.variety = wineMaker.variety;
  this.size = wineMaker.size;
 }

 public static WineMaker makeWine() {
  return new WineMaker();
 }

 @Override
 public String toString() {
  return "Wine(" + this.variety.color + ", Variety: " //
    + this.variety + ", Bottle size: " + this.size + "ml)";
 }

 public static void main(String[] args) {
  Wine w1 = makeWine() //
    .setVariety(Variety.CABERNET_SAUVIGNON) //
    .setSize(750) //
    .cap();
    System.out.println(w1);

    Wine w2 = new Wine.WineMaker().setVariety(Variety.SAUVIGNON_BLANC).setSize(800).cap();
    System.out.println(w2);

    System.out.println(makeWine().setVariety(Variety.PINOT_NOIR).setSize(100).cap());
 }
}
