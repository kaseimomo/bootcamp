package builtin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
 public static void main(String[] args) {
  // y = f(x)
  // y = x + 1

  // Function<>
  // 左手入, 右手出
  Function<String, Integer> function = s -> s.length();
  System.out.println(function.apply("Hello")); // 5

  Function<Integer, String> function2 = t -> t.toString();
  System.out.println(function2.apply(6609142));

  

  // BiFunction<>
  // left兩個入, right一個出
  BiFunction<String, String, Integer> totalLength =
    (s1, s2) -> s1.length() + s2.length();
  System.out.println(totalLength.apply("hello", "abc")); // 8

  BiFunction<String, Integer, String> what =
    (s1, i1) -> s1.concat("?") + i1.intValue();
  System.out.println(what.apply("test", 100));



  // Why we need to learn BiFunction<>??
  // Create a HashMap<>() and put somthing in map
  Map<String, Integer> nameLengthMap = new HashMap<>();
  nameLengthMap.put("John", "John".length());
  System.out.println(nameLengthMap); // {John=4}

  // use BiFunction<>
  Function<String, Integer> nameLength = s -> s.length();

  // computeIfAbsent() -> this method is from Map
  nameLengthMap.computeIfAbsent("Chalres", nameLength); // if "Charles" does not exists -> nameLength
  System.out.println(nameLengthMap); // {Chalres=7, John=4}

  // can be different formula " nameLength = s -> s.length() + 1 "
  nameLengthMap.computeIfAbsent("Oscar", s -> s.length() + 1); 
  System.out.println(nameLengthMap); // {Chalres=7, John=4, Oscar=6}

  //
  nameLengthMap.clear();
  nameLengthMap.computeIfAbsent("Moon", nameLength);
  nameLengthMap.computeIfAbsent("Nicole", nameLength);
  nameLengthMap.computeIfAbsent("Fiona", s -> s.length());

  Function<String, Integer> nameChar = c -> c.indexOf('o');
  System.out.println(nameChar.apply("Moon"));

  // merge()
  System.out.println(nameLengthMap.merge("Charles", 3, (o, n) -> o * n)); //
 }
}
