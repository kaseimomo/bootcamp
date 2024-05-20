public class DemoMethod { // 首先要java知道啲個係java class file, class係死物

    // static method
    // void is a return type, representing it should not return anything.
    public static void main(String[] args) {

        System.out.println("hello");

        // main 係 mothod名
        // calculating
        int result = 1 + 3;
        int result2 = 2 + 5;

        // Mothod 可以 call method
        result = sum(1, 3);
        result2 = sum(2, 5);

        sum(1.3, 1.4); //
        System.out.println(sum("1", "3"));

        Integer m = 3;
        Integer n = 4;
        if (m > n) { // wrong

        }
        if (m.compareTo(n) > 0) { // checking if m > n

        }
        // radius -> Circle area
        double area = area(3.2d);
        double area2 = area("Circle", 3.2d);
        double area3 = area("Square", 3.2d);
        double area4 = calculate("Circle", "area", 3.2d);
        double area5 = calculate("Square", "area", 3.2d);
        double parimeter = calculate("Circle", "parimeter", 3.2d);
        double parameter2 = calculate("Square", "parimeter", 3.2d);

        // Adult
        int age = 18;
        if (age >= 18) {

        }
        boolean isAdult = isAdult(age);

        double pi = Math.PI;


    }

    // static method
    // sum is a method name
    // "(int x, int y)" is declaration of input parameters for methods
    // "int" is also a return type
    // keyword "return" : for all non-void scenario
    public static int sum(int x, int y) { // use long is fine because it's upcast
        int z = x + y;
        return z; // use (short) is fine but you have to risk over fload and 精度損失
    }

    // subtraction
    public static int subtraction(int a, int b) {
        // int c = a - b;
        return a - b; // int value - int value -> int value
    }

    // Method Definition: Method Name + Input Parameter (type & no. of parameter)
    public static int sum(double x, double y) {
        return (int) (x + y); // double value + double value -> double value
    }

    public static double sum(int x, double y) {
        return x + y; // double value + double value -> double value
    }

    public static int sum(String x, String y) {
        // Integer z = Integer.valueOf(x).intValue() + Integer.valueOf(y).intValue(); // convert String to Integer
        // Integer Object -> int value
        return Integer.valueOf(x) + Integer.valueOf(y); // Integer + Integer -> int + int -> int
    }

    public static double area(double radius) {
        return radius * radius + Math.PI; // bug
    }

    public static double area(String s, double x) {
        // if (...) return deifferent formula
        // double area = -1.0;
        if ("Circle".equals(s)) {
            return x * x * Math.PI;
        } else if ("Square".equals(s)) {
            return x * x;
        }
        return -1.0;
    }

    public static double calculate(String shape, String string, double x) {
        if ("area".equals(string)) {
            if ("Circle".equals(shape)) {
                return Math.pow(x, 2.0d) * Math.PI;
            } else if ("Square".equals(shape)) {
                return Math.pow(x, 2);
            }
        } else if ("perimeter".equals(string)) {
            if ("Circle".equals(shape)) {
                return x * 2 * Math.PI;
            } else if ("Square".equals(string)) {
                return x * 2;
            }
        }
        return -1.0d;
    }

    public static boolean isAdult(int age) {
        // Approach 1:
        // if (age >= 18)
        // return true;
        // return false;

        // Approach 2:
        // return age >= 18 ? true : false;

        // Approach 3:
        return age >= 18;
    }

}
