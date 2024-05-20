public class Animal {

    public static String x = "abc";

    public static String y = "def";

    private String name;

    public Animal() {
        System.out.println("Hi Animal Constructor...");
    }

    public Animal(String name) {
        System.out.println("Hi Animal Constructor...");
        this.name = name;
    }

    public String getAnimalName() {
        System.out.println("Animal getAnimalName");
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void hello() {
        System.out.println("hello");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }

    public String lowerY() {
        return Cat.y.toLowerCase();
    }


    public static void main(String[] args) {
        Cat c = new Cat(12); // Hi Animal Constructor...
        Cat c2 = new Cat(4, "Charles");
        System.out.println(c2.getName());

        Animal animal = new Animal();
        System.out.println();
    }
}
