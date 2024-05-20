public class Father implements Swim {

 String shout() {
return "I'm the father!";
 }

 @Override
 public void swim() {
  System.out.println("I'm swimming");
  System.out.println("Bye");
 }

 public static void main(String[] args) {
  // Before Lambda
  Father father = new Father();
  father.swim();

  // After Lambda (After java 1.8)
  Swim father2 = () -> {
   System.out.println("I'm father. Able to swim");
   System.out.println("Bye");
  };
  father2.swim();

  Swim mother = () -> {
   System.out.println("I'm mother. I can swim too");
   System.out.println("Hello");
  };
  mother.swim();

  Swim son = () -> {
   System.out.println("I am the son");
  };
  son.swim();

  

  
 }
}
