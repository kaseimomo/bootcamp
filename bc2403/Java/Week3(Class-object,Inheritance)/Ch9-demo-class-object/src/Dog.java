public class Dog {
  // Dog
  private String firstName;
  private String lastName;
  private int age;

  // Empty constructor
  public Dog() {

  }

  // All arguments constructor
  public Dog(int age, String firstName, String lastName) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Dog(int age, String lastName) {
    this.age = age;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // public String getFirstName() {
  // return this.firstName;
  // }
  // public String getLastName() {
  // return this.lastName;
  // }
  // public int getAge() {
  // return this.age;
  // }

  public String toString() {
    return "Dog(firstName=" + firstName + ", lastName=" + lastName + ", age="
        + age + ")";
  }

  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

  //
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
    System.out.println(dog.toString()); // "Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName()); // John lau

    // Square
    Square square = new Square();
    square.setLength(13);
    System.out.println(square.toString()); // "Square(length=13)"
    System.out.println(square.area()); // 169

    Dog dog2 = null;
    // dog2.setAge(4); // NPE: null pointer exception
    Dog dog3 = new Dog();
    dog3.setAge(15); // dog3 (address) -> find the dog object ->

    Dog dog4 = new Dog(13, "Ken", "Wong");
    System.out.println(dog4.toString());

    Dog dog5 = new Dog(13, "Jenny");
    System.out.println(dog5.toString());

  }
}
