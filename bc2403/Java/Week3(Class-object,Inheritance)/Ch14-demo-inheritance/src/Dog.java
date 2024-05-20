public class Dog extends Animal {
 private Color color;

 public void setColor(Color color) {
  this.color = color;
 }

 public void bark() {
  System.out.println("Barking...");
 }
 
 public static void main(String[] args) {
  Dog dog = new Dog();
  dog.setColor(Color.BLACK);
  dog.setName("Eric");
  System.out.println(dog.getName());
  dog.bark();
 }
}
