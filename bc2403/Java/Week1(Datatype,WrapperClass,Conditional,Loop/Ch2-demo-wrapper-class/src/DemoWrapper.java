public class DemoWrapper {
    public static void main(String[] args) {
        int x = 1; // (+, -, *, /)
        Integer x2 = 1; // Integer wrapper class -> object (i.e. String.class -> String Object)
        Integer x3 = new Integer("1");

        Long l = 12312L;
        Long l2 = new Long("12312312");

        Short s = 32767;
        Short s2 = new Short("32767");

        Byte b = 127;
        Byte b2 = new Byte("127");

        Float f = 11.11F;
        Float f2 = new Float("11.11F");

        Double d = 123.12;
        // Double d2 = new Double("123.12");

        if (x2.equals(1)) {
            System.out.println("x2 = 1");
        }

        if (x2 == 1) {
            System.out.println("x2 = 1");
        }

        x2 = 128;
        if (x2 == 128) {
            System.out.println("x2 = 128");
        }

        Integer num1 = Integer.valueOf(127); // valueOf() -> "new" a Integer object
        Integer num2 = Integer.valueOf(127);
        // "==" is checking if they are same object
        System.out.println(num1 == num2); // true
        // equals() is checking if they are the same value
        System.out.println(num1.equals(num2)); // true

        Integer num5 = new Integer("127");
        System.out.println(num1 == num5); // false
        System.out.println(num1.equals(num5));

        Integer num3 = Integer.valueOf(128);
        Integer num4 = Integer.valueOf(128);
        System.out.println(num3 == num4); // false. Why?
        System.out.println(num3.equals(num4)); // true

        String str = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = String.valueOf("hello");
        System.out.println(str == str2); // true
        System.out.println(str == str3); // false
        System.out.println(str == str4); // true
        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str3)); // true

        Double d2 = 1.0;
        Double d3 = 1.0;
        Double d4 = Double.valueOf(1.0);
        System.out.println(d2 == d3); // false !! Java can not handle Double and Float !! ONLY String and Integer can handle.
        System.out.println(d2 == d4); // false !! Java can not handle Double and Float !! ONLY String and Integer can handle.
        System.out.println(d2.equals(d3)); // true
        System.out.println(d2.equals(d4)); // true

        System.out.println(d2.compareTo(d3));

        int u = 1;
        if (u == 1) {

        }

        // 17 Types + array
        Integer i1 = 3; // 3 (int value) -> Integer Object with value 3 -> auto-box
        int i2 = i1; // i1 (Integer Object) -> unbox

        Character c2 = 'c'; // auto-box
        char c3 = c2; // unbox

        Integer i3 = 10;
        // short s4 = i3; // Integer -> int (unbox) -> short (un-secure)
        long l4 = i3; // Integer -> int (unbox) -> long (upcast)

        int i5 = 12;
        Long l5 = (long)i5; // need manually add (long)
        // int -> long (upcast) -> Long (autobox) 

        // Float.valueOf()
        Float f3 = Float.valueOf("1.0");
        // f3.compareTo(...) -> 0, -1, 1
        // f3.equals(...) -> true, false

    }
}
