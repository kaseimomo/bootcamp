package shapeIneritance;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {

  private double radius;
  private int circleID;

  // Constructor
  public Circle(int circleID, double radius) {
    this.circleID = circleID;
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  // public BigDecimal area2() { // This object is heavy
  // return BigDecimal.valueOf(this.radius) //
  // .multiply(BigDecimal.valueOf(this.radius)) //
  // .multiply(BigDecimal.valueOf(Math.PI)); //
  // }

  public double getRadius() {
    return this.radius;
  }

  public int getID() {
    return this.circleID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
    // 如果this這個obj. ref. 與 pass入嚟的o這個obj. ref.是一樣的話, 就一定一樣  (obj.ref. = 地址)
      return true;
    if (!(o instanceof Circle)) 
    // 這個是防守: check o 這個obj 是否擁有Circle的instance variable - ID(今次係check ID)
    // The relationship between Object object and Circel object
      return false;
    Circle circle = (Circle) o; // 降級 downcast
    return this.circleID == circle.getID(); // 只關心ID是否一樣, 無論半徑怎樣變化
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.circleID);
  }

  public static void main(String[] args) {
    Circle c = new Circle(001, 10.1d); // 假設c係昨天的c, 身份證001, radius係10.1
    Circle c2 = new Circle(001, 11.5d); // 而c2係今日的c 身份證一樣, radius係11.5
    Circle c3 = c;

    System.out.println(c.equals(c2)); // override equal()之後,留意equal()只會認ID, radius的變化是不受影響
    System.out.println(c.hashCode()); // 112810359
    System.out.println(c2.hashCode()); // 2124308362
    // after override hascode
    System.out.println(c.hashCode());
    System.out.println(c2.hashCode()); // 32
    System.out.println(c.equals(c3)); // 32

    Square s = new Square();
    // System.out.println(c.equals(s));
  }

}
