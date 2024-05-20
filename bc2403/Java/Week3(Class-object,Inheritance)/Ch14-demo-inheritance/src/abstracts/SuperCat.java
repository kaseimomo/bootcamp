package abstracts;

public class SuperCat extends SuperAnimal {

 private int age;

 public SuperCat(int age, String name) {
  super(name); // !!!!
  this.age = age;
 }

 public int getAge() {
  return this.age;
 }

 @Override
 public void sleeping() {
  System.out.println("Cat is sleeping.");
 }

 @Override
 public void eat() {
  System.out.println("Cat is eating");
 }

 @Override
 public void sit() {
  System.out.println("cat is sitting on the couch");
 }

 // @Override
 // public void swim(){} <- cannot override final

 public static void main(String[] args) {
  SuperCat sc = new SuperCat(3, "Jenny");
  System.out.println(sc.getName());
  System.out.println(sc.getAge());
  sc.sleeping();
  sc.eat();
  sc.run(); // no override
  sc.sit();

  SuperCat sc2 =sc;
  System.out.println(sc2 == sc);
  System.out.println(sc2.equals(sc));
 }
 
}
