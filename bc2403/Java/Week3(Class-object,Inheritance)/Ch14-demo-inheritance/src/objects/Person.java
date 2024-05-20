package objects;

public class Person {
 
 private Dog dog;

 public Dog getDog() {
  return this.dog;
 }
 public void setDog(Dog dog) {
  this.dog = dog;


 }
 public static void main(String[] args) {
  Person charles = new Person();
  charles.setDog(new Dog(1, Color.BLACK));

  Dog charlesDog1 = charles.getDog();

  charles.setDog(new Dog(Color.RED));

  Dog charlesDog2 = charles.getDog();

  Person vincent = new Person();
  vincent.setDog(new Dog(Color.BLACK));

  Dog vincentDog = vincent.getDog();


  // System.out.println(p1.getClass());
 }
}
