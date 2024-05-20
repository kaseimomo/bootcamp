package ClassObject;
public class ClassObject {

  // Attributes
  // Car
  private String color;
  private double speed;
  private int capacity;
  private boolean isSpeeding; // plz rmb default is false!!
  // isSpeeding or isxxxxxx is useless in Attribute
  private double carFee;
  // Person
  private int age;


  // SETTER - a tool for main
  // Setter don't need to return something
  // 指針指向一個object係唔使return出嚟
  // Set need () <- parameter

  public void setColor(String color) { // * SET
    this.color = color; // "this"啲個color 係代表緊上面Attributes個個color
  }

  public void setSpeed(double speed) {
    this.speed = speed;
    if (speed > 90)
      this.isSpeeding = true;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // GETTER
  // You have to "return" when you use "getter"
  // getter係你要拎野,所以唔應該要有參數parameter
  public String getColor() { // *READ
    return this.color;
  }

  public Double getSpeed() {
    return this.speed;
  }

  public int getCapcity() {
    return this.capacity;
  }

  public boolean isSpeeding() { // this is Getter
    return this.isSpeeding;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() { // this is Getter
    return this.age >= 65;
  }

  public String toString() {
    return "Car(" + //
        "color=" + this.color + //
        ", speed=" + this.speed + //
        ", capacity" + this.capacity + //
        ")";
  }

  public static void main(String[] args) {
    ClassObject c = new ClassObject(); // c is an object reference
    // c is an object reference, so input "c." to call object
    c.setColor("RED");
    System.out.println(c.getColor());
    c.setCapacity(6);
    c.setSpeed(95d);

    System.out.println(c.isSpeeding + ". c is speeding!!!");


    ClassObject person = new ClassObject();
    person.setAge(65);
    System.out.println(person.isElderly());
    ClassObject person2 = new ClassObject();
    person2.setAge(30);


    System.out.println(c.toString());
  }
}
