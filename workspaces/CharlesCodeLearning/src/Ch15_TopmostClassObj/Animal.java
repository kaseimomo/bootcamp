package Ch15_TopmostClassObj;

public class Animal {
 protected String name;

 public void makeSound() {
  System.out.println("Some generic animal sound");
 }
}


class Dog extends Animal {
 // Constructor
  public Dog(String name) {
   this.name = name;
  }

  @Override
  public void makeSound() {
   System.out.println("Dog sound!");
  }

  
  public void sleeping() {
   System.out.println("Dog is sleeping...");
  }

  public static void main(String[] args) {
   Dog dog = new Dog("ABC");
   System.out.println(dog.name);
   dog.makeSound();
   dog.sleeping();
  }
}
