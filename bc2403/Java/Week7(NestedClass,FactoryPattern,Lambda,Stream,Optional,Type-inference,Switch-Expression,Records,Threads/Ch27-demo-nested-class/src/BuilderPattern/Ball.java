

public class Ball {
  private Color color;
  private double weight;

  enum Color {
    RED, YELLOW, BLACK,;
  }

  // private Ball(Color color, double weight) {
  // this.color = color;
  // this.weight = weight;
  // }

  // Builder pattern (Coding pattern)
  // 1. avoid setter, so that i can create ball object with all attribute values
  // 2. avoid all-args constructor()
  private static class BallBuilder {
    private Color color;
    private double weight;

    public BallBuilder setColor(Color color) { // chain method
      this.color = color;
      return this;
    }

    public BallBuilder setWeight(double weight) { // chain method
      this.weight = weight;
      return this;
    }

    public Ball build() {
      return new Ball(this);
    }
  }

  private Ball(BallBuilder ballBuilder) {
    this.color = ballBuilder.color;
    this.weight = ballBuilder.weight;
  }

  public static BallBuilder builder() {
    return new BallBuilder();
  }

  public String toString() {
    return "Ball(" + "Name=" + " Color=" + this.color + " , Weight=" + weight
        + ")";
  }


  public static void main(String[] args) {
    // Biulder Pattern is an alternative for creating objects.
    // We no longer use all args construtor
    Ball ball = new Ball.BallBuilder() // empty constructor
        .setColor(Color.RED) //
        .setWeight(30.0d) //
        .build();
    System.out.println(ball); // Ball(Color=RED , Weight=30.0)

    // Incapacitation
    Ball ball2 = Ball.builder() //
        .setColor(Color.BLACK) //
        .setWeight(89.0d) //
        .build();
    System.out.println(ball2);



  }
}
