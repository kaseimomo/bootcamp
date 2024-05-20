public class Car {

    // Attributes
    private String color; // private and public diff; Color can be any color

    private double speed;

    private int capacity;

    private boolean speeding; // false, useless -> we should use speed to derive isSpeeding()

    // ...

    // Behavior or instance methods

    // Setter 
    public void setColor(String x) { // read
     this.color = x;
    }
    public void setSpeed(double y) {
     this.speed = y;
     if (y > 90) 
      this.speeding = true;
    }
    public void setCapacity(int z) {
     this.capacity = z;
    }

    // Getter 
    public String getColor() { // write
     return this.color;
    }
    public double getSpeed() {
     return this.speed;
    }
    public int getCapcity() {
     return this.capacity;
    }
    public boolean isSpeeding() {
     return this.speeding;
    }

    public String toString() {
     return "Car(" //
     + "color = " + this.color //
     + ", speed = " + this.speed //
     + ", capacity = " + this.capacity //
     + ")";
    }

    public static void main(String[] args) { //
     System.out.println("hello");
     Car c = new Car(); //c代表heap生產一個car object, 而car內面有strings
     // c -> object reference
     c.setColor("RED");
     System.out.println("color = " + c.getColor()); // RED

     // speed = 80;
     c.setSpeed(80);
     System.out.println("speed = " + c.getSpeed());

     // capacity = 4;
     c.setCapacity(4);
     System.out.println("capacity = " + c.getCapcity());

     System.out.println(c.toString());

    }
}
