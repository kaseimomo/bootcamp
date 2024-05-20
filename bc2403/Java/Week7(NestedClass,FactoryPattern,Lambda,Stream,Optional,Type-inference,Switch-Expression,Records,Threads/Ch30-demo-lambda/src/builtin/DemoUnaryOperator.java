package builtin;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
 public static void main(String[] args) {
  Function<String, String> f1 = s -> s;
  // Function<T, T>
  UnaryOperator<String> addHello = s -> s.concat("hello");

  BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
  // BiFunction<T, T, T>
  BinaryOperator<Integer> sum = (x, y) -> x + y;

  // toUpperCase (String). e.g.: "hello".toUpperCase() -> "HELLO"
  UnaryOperator<String> upperCase = s -> s.toUpperCase();
  System.out.println(upperCase.apply("hello")); // "HELLO"

  // toUpperCase and replace
  // 3 in, 1 out -> string1, replace form string2 to string3 -> string4
  StringFormula formula =
    (str, from, to) -> str.toUpperCase().replace(from, to);
  System.out.println(formula.uppercaseNreplace("Hello", "LL", "PP")); // HEPPO


 }
}
