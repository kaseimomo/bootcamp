import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {

        // This is Java 10

        String x = "hello";
        // var = variable
        var x2 = "hello"; // compile-time: compiler knows x2 is with type String
        // Behind is -> String x2 = "hello"

        var age = 5;
        var name = "Charles";
        var names = List.of("Chalres", "moon"); // List<String>

        for (var n : names) {
            System.out.println(n);


        }

        var d = new DogVar();



        // Cannot Do in var
        // 1. return type
        // public static var print(int x) {
        // return x;
        // }

        // 2. instance variable
        // refer to DogVar.class // private var age;

        // 3. without initialization
        // var n;

        // 4. Cannot use Lambda exeption
        Predicate<String> isTooLong = s -> s.length() > 10;
        // var isTooLong = s -> s.length() > 10; // Lambda expression needs an explicit target-type
        
        // 5. Array

        // 6. input parameter

    }
}
