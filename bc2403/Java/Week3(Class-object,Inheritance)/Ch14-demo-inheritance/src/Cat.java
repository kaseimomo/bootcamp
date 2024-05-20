public class Cat extends Animal {

 // Child Class Cat object inherit all instance variables, instance methods from Parent Class Aninaml object
 // but it dose not inherit constructor

 private int age;

 private String name;

 public Cat(String name) {
  super(name);
 }
 public Cat(){
  
 }
 
 public Cat(int age) {
  super(); // create Animal, call緊parent個constructor
  this.age = age;
 }

 public int getAge() {
  System.out.println("Cat getAge");
  return this.age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 // public String getAnimalName() {
 //  return this.name;
 // }

 public Cat(int age, String name) {
  super(name);
  this.age = age;
 }

 public String getCatName() {
  System.out.println("super test");
  return super.getName();
 }

 public void setCatName(String name) {
  this.name = name;
 }

 // approach 2
 public String getCatName(String name) {
  return "name = " + super.getName();
 }

 @Override
 public String toString() {
  return "name : " + this.getName() + " , age : " + this.age;
 }

 @Override
 public void sleep() { // method signature is same as the Animal object sleep()
  System.out.println("cat is sleeping...");
 }

 public String upperX() {
  return Animal.x.toUpperCase();
 }

 public static void main(String[] args) {
  Cat cat = new Cat(12);
  cat.setName("Kate");
  cat.setName("Mike");
  System.out.println(cat.getName());

  // Cat has its own instance variable
  cat.setAge(10);
  System.out.println(cat.getAge());

  // Another child class extends Animal

  // New Animal

  // call sleep()
  cat.sleep();
  // cat.run();

  Cat c1 = new Cat("test");
  System.out.println("c1 : " + c1);
  c1.setAge(100);
  System.out.println("c1 : " + c1);

  Cat c2 = new Cat("Chris");
  c2.setCatName("Bella");
  System.out.println(c2.getCatName());
  System.out.println(c2.getName());

  Cat c3 = new Cat("abc");
  System.out.println(c3.x.toUpperCase());
  System.out.println(c3.upperX());

  Animal a = new Cat(10, "Jenny"); //
  Cat c = (Cat) a; // downcast
  System.out.println(c.getCatName());


 }
}
