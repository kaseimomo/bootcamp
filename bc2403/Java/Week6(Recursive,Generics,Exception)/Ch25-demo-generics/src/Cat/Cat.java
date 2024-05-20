package Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat extends Animal {
  // <? super Cat> -> List<Cat> or List<Animal>
  // <? extends Cat> -> List<RedCat> or List<Cat>
  public static void addCat(List<? super Cat> cats) {
    // Compile time check
    cats.add(new Cat()); // OK
    cats.add(new RedCat()); // OK
    // cats.add(new Animal()); // NOT OK
    // becuase compiler does not know the list type is List<Cat> or List<Animal>
    // so, during the compile-time, you can add Animal(), coz it may be wrong.
  }

  // addCat2
  public static void addCat2(List<Cat> cats) {}

  // addCat3
  public static <T extends Cat> void addCat3(List<T> cats) { // Cat or below
  }

  // You have to understand the difference bewteen :
  // 1. <T extends Cat> void addCat4(List<T> cats) -> List<Cat>
  // 2. void addCat(List<? extends Cat> cats) -> List<Cat> or List<RedCat>
  public static <T extends Cat> void addCat4(List<T> cats) { // List<Animal>, add(new Cat()), add(new RedCat())
  }

  public static void main(String[] args) {
    // 1. addCat()
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat()))); // ??

    // 2. addCat2()
    // addCat2(new ArrayList<>(List.of(new Animal(), new Animal()))); // no Parent
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));

    
    List<RedCat> rl = new ArrayList<>(List.of(new RedCat(), new RedCat()));
    // addCat2(rl); // NOT OK, compile-time check -> Left hand side is List<RedCat> rl
    // List<RedCat> rl is the obj only in List<RedCat>, no relationship to add anything in addCat2
    // check type of object reference
    List<Cat> r2 = new ArrayList<>(List.of(new RedCat(), new RedCat()));
    addCat2(r2); // OK. addCat2 is checking the type if the obj type is List<Cat>, if not, then compile-time check.

    // Question
    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat()))); // OK? why?
    // new ArrayList<>(List.of(new RedCat(), new RedCat())) -> because it can be stored in List<Cat> or List<Animal>

    List<Cat> cats = new LinkedList<>();
    cats.add(new RedCat());
    cats.add(new Cat());
    // cats.add(new Animal());
    addCat4(cats);

    List<RedCat> redCats = new LinkedList<>();
    addCat4(redCats);

    List<Animal> animals = new LinkedList<>();
    // addCat4(animals);

  }


}
