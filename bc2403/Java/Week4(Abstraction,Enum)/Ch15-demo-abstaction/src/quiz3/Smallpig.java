package quiz3;

interface Vegetarian {
 default public String eat() {
  return "[Vegetarian] I am able to eat";
 }
}
interface Runner {
 default public String eat() {
  return "[Runner] I'm able to eat";
 }
}

class Animal {
 public String eat() {
  return "[Animal] I'm able to eat";
 }
}

class Pig extends Animal {
 public String eat() {
  return "[pig] I am able to eat";
 }
}

public class Smallpig extends Pig implements Vegetarian, Runner {
public static void main(String[] args) {
 Smallpig smallpig = new Smallpig();
 System.out.println(smallpig.eat());
}
}
