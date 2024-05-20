package AbstractClassAndInterfaceDifferent;

// Inteface
// 1) Definition:
// An interface is a purely abstract type that can only contain abstract methods
// (since Java 8, it can also have "default" and "static methods").

// 2) Usage Scenario:
// Use an interface when you want different classes to implement the same methods,
// but these classes don't necessarily share a common ancestor.

// 3) Features:
// - Can only contain abstract methods (since Java 8, it can also have "default" and "static methods").
// - Can contain constants (static final properties).
// - ** Cannot have constructors.
// - Can be implemented by multiple classes (multiple inheritance).



public interface AnimalInterface {


 // No instance variables.
 String getName(); // An interface can only have static constants (public static final) <- implicitly.

 void makeSound(); // Abstract method - (without method bodies).

 default void breathe() {
  System.out.println("Breathing....");
 }

 // Implementing an interface (Implements)
 public class Cat implements AnimalInterface {
  // Syntax: class ClassName implements Interface1, Interface2. <- A class can implement multiple interfaces.
  // A class that implements an interface must provide concrete implementations
  // for all of the interface’s methods unless the class is abstract.


  private String name;

  public Cat(String name) {
   this.name = name;
  }

  @Override
  public String getName() {
   return this.name;
  }

  @Override
  public void makeSound() {
   System.out.println("Meow");
  }

  // Can override breathe() or Use the default implementation


 }

 // Summary: Interfaces are better for defining behavior that different classes can implement.
}
