package Wine;

public class Wine {
 public static final String subTotal = null;
 private String type;
 private String variety;
 private int score;
 private int pack;
 private int price;
 private String scale;

 public Wine(String type, String variety, int score, int price, int pack) {
  this.type = type;
  this.variety = variety;
  this.score = score;
  this.price = price;
  this.pack = pack;
 }

 public int subTotal() {
  return this.price * this.pack;
 }

 public String toString() {
  return "\n" + "(Wine's detail)\n" + "Type: " + this.type + "\nVariety: "
    + this.variety //
    + "\nWine Score: " + this.score + " Points. " + Wine.scale(score)
    + " \nOrder price: $" //
    + this.price + " \n" + this.pack + " pack(s)";
 }

 public static String scale(int score) {
  if (score >= 95)
   return "Classic: a great wine!";
  else if (score >= 90)
   return "Outstanding: a wine of superior character and style!";
  else if (score >= 85)
   return "Very good: a wine with special qualities!";
  else if (score >= 80)
   return "Good: a solid, well-made wine.";
  else if (score >= 75)
   return "Mediocre: a drinkable wine that may have minor flaws.";
  else if (score >= 50)
   return "Not recommended.";
  return "Invalid score.";
 }

}
