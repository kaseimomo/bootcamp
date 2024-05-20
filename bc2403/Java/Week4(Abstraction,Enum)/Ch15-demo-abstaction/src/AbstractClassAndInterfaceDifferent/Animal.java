package AbstractClassAndInterfaceDifferent;
// Abstract Class
// 1) Definition:
// An abstract class is a class that cannot be instantiated(實例化) and can contain both abstract and concrete(具體) methods.

// 2) Usage Scenario:
// Use an abstract class when you want a class to have some common behavior or properties, but also want different subclasses to have their own specific implementations.

// 3) Features:
// - Can contain concrete methods (methods with implementations).
// - Can contain properties (variables).
// - Can have constructors.
// - Can implement interfaces.


public abstract class Animal { 
 // Syntax: class SubClass extends SuperClass. A class can extend only one superclass.
 
 private String name; // An abstract class can have instance variables.

 public Animal(String name) {
  this.name = name;
 }

 public String getName() { 
  return this.name;
 }

 public abstract void makeSound(); // abstract method

 // Implementing an abstrct class (Extends)
 public class Dog extends Animal { 
  // If a class extends an abstract class, 
  // it must either provide implementations for all abstract methods 
  // in the abstract class or be declared abstract itself.

  // instance variable 會自動繼承

  public Dog(String name) {
   super(name); // Constructor Invocation: super()
  }
  // The constructor of the superclass is called first. 
  // If not explicitly called, the default (no-argument) constructor is invoked.

  @Override
  public void makeSound() {
   System.out.println("woof");
  }
 }

 // Summary: Abstract classes are better suited for classes with shared behavior.
}
