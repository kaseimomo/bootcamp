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

 public String scale(String scale) {
  this.scale = scale;
  if (this.score >=95)
  return scale = "Classic: a great wine!";
  else if (this.score >=90)
  return scale = "Outstanding: a wine of superior character and style!";
  else if (this.score >=85)
  return scale = "Very good: a wine with special qualities!";
  else if (this.score >=80)
  return scale = "Good: a solid, well-made wine.";
  else if (this.score >=75)
  return scale = "Mediocre: a drinkable wine that may have minor flaws.";
  else if (this.score >=50)
  return scale = "Not recommended.";
  return "Invalid score.";
 }

 public String toString() {
  return "\n" + "(Wine's detail)\n" + "Type: " + this.type + "\nVariety: " + this.variety //
  + "\nWine Score: " + this.score + " Points. " + this.scale + " \nOrder price: $" //
  + this.price + " \n" + this.pack + " pack(s)";
 }
}
