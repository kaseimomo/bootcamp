public class Outer {
    private int x = 10; // instance variable
    public static int y = 100; // static variable

    public int getX() { // instancce method
        return this.x;
    }

    public static int getY() { // static method
        return y;
    }

    // 1. Static class in class
    public static class StaticNested { // 1. Static Nested Class (Stataic member of Outer Class)
        void print() {
            System.out.println("hello");

            // System.out.println("hello" + x);
            /* cannot access outer obj instance variable x */

            System.out.println("hello: " + y);
        }
    }

    // 2. non-Static class in class
    public class Inner { // 2. non-static classc (non-static)
        void print() {
            System.out.println("hello2");

            // System.out.println("hello 2 " + this.x);
            // NOT OK.
            /* because this -> the obj instance variable x from Outer */

            System.out.println("hello2: " + y); // ok
        }
    }

    // 3. A class inside a method
    public void print() {
        class LocalInner {
            int x;

            LocalInner(int x) { // <- Construtor
                this.x = x;
            }

            void print() {
                System.out.println("hello3: " + this.x);
            }
        }
        LocalInner li = new LocalInner(20);
        li.print(); // hello3: 20
    }


    public static void main(String[] args) throws Exception {
        // new a o1 Outer obj
        Outer o1 = new Outer();
        System.out.println(o1.x); // 10
        System.out.println(Outer.y); // 100 <- static int y
        System.out.println(Outer.getY()); // 100 <- static method
        System.out.println(getY()); // same..

        // new a o2 static class in class - StaticNested
        /* (syntax): Static class in class -> Outer.StaticNested */
        Outer.StaticNested o2 = new Outer.StaticNested();
        o2.print(); // hello // hello: 100

        // new a o3 in non-Static class - Inner
        Outer o3 = new Outer();
        Outer.Inner o4 = o3.new Inner();
        o4.print(); // hello2 // hello2: 100
        // -> o3.new Inner() -> new Outer().new Inner();
        Outer.Inner o5 = new Outer().new Inner();// 直接call
        o5.print(); // same..

        // Instance void method - print()
        Outer o6 = new Outer();
        o6.print(); // hello3 20
        o1.print(); // same..

        // Before Java 8 (before lambda)
        Drivable charles = new Drivable() {
            @Override
            public void drive() {
                System.out.println("im driving...");
            }

            @Override
            public void abc() {
                System.out.println("abc...");
            }
        };
        charles.drive();
        charles.abc();

        // After Java 8
        Drivable2 charles2 = () -> {
            System.out.println("I'm driving Lambda");
            System.out.println("def...");
        };

        charles2.drive();
    }
    @FunctionalInterface
    public interface Drivable2{
        void drive();
    }
}
