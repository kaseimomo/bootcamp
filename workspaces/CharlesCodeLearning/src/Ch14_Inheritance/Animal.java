package Ch14_Inheritance;

// Inheritance 繼承
// Parent Class -> also called Super Class *ONLY allow one direction of super class
// Parent's method(行為) can be extended by child class /* Child class extends Parent class */

// Subclass -> Child class
// All the instance variable(特徵) can be used by super()

public class Animal {
 private String name;
 private int age;
 private double weight;

 public void sound() {
  System.out.println("Animal makes a sound");
 }

 public String getName() {
    return this.name;
  }
}

class Dog extends Animal {
 public void barking() {
  System.out.println("Dog is barking");
 }
}

class Cat extends Animal {
 
}


