package abstracts;

public abstract class SuperAnimal extends SuperObject { 
  // 1. you cannot create an object for an abstract class -> SupperAnimal

 private String name;

 public SuperAnimal() { // 2. Abstract class is still having constructor, even you can't create an object for it
 // super();
 }
 public SuperAnimal(String name) {
  // super();
  this.name = name;
 }

  // 逼child去override的意思
 public abstract void eat(); // 3. Abstact method, but it is a method signature ONLY
 // the child class has to implement it.

 // 4. Automatically inherits abstract method form parent *abstract* class

 public String getName() {
  return this.name;
 }
 public void setName(String name) {
  this.name = name;
 }

 public void run() {
  System.out.println("Animal is running");
 }

 public void sleeping() {
  System.out.println("Animal is slepping");
}

public final void swim() {
 System.out.println("Animal is swimming!");
}

 public static void main(String[] args) {
  // SuperAnimal sa = new SuperAnimal(); /* Cannot new obj */
 }
 
 
}
