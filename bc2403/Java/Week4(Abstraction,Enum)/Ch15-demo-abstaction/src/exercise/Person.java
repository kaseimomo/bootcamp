package exercise;

public class Person implements Exercise, Work {
 
 @Override
 public void run() {

 }

 @Override
 public void walk() {

 }

 @Override
 public void swim() {

 }

 @Override
 public void work() {

 }

 public static void main(String[] args) {
  Run charles = new Person();
  charles.run();

  Walk charles2 = new Person();
  charles2.walk();
  Person p = (Person) charles2;
  p.run();
  p.walk();
  p.swim();

  Exercise charles3 = new Person();
  charles3.run();
  charles3.walk();
  charles3.swim();
  //charles3.work();
 }
 
}
