package builtin;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class Test {
 public static void main(String[] args) {



  BiFunction<String, String, Integer> stringLength = (s1, s2) -> {
   return s1.length() + s2.length();
  };
  System.out.println(stringLength.apply("Charles", "Chan")); // 11

  List<String> name = new ArrayList<>();
  name.add("Charles");
  name.add("Eric");
  name.add("Sunny");
  name.add("Indi");
  name.forEach(n -> {
   System.out.println(n);
  });
  List<String> boysGroup = new LinkedList<>();
  for (String collect : name) {
   boysGroup.add(collect);
  }
  System.out.println(name.size());
  System.out.println(boysGroup.size());
  List<String> boysBand = new ArrayList<>();
  boysGroup.forEach(b -> {
   boysBand.add(b);
  });
  System.out.println(boysBand.size());
  
  


 }
}
