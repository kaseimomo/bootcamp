package AbstractClassAndInterfaceDifferent;

// - A class can extend another class and implement one or more interfaces at the same time.

public class Dog2 extends Animal implements AnimalInterface {
 // Syntax: class ClassName extends SuperClass implements Interface1, Interface2.

 public Dog2(String name) {
  super(name);
 }

 @Override
 public String getName() {
  return super.getName();
 }

 @Override
 public void makeSound() {
  System.out.println("woof woof");
 }


 // Summary:
 // ** ) Abstract methods in abstract classes and interfaces must be implemented in the subclass or the implementing class, respectively.

 // ** ) The superclass constructor must be called when a subclass is instantiated.

 // ** ) 
}
