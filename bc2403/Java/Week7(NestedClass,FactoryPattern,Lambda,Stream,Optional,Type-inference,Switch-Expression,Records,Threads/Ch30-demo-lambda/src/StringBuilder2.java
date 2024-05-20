import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@FunctionalInterface
public interface StringBuilder2 {
 String concat(List<String> strings);

 public static void main(String[] args) {

  List<String> strings = new ArrayList<>(List.of("abc", "def", "g", "hijk"));
  StringBuilder sb1 = new StringBuilder();
  for (String s : strings) {
   sb1.append(s);
  }
  System.out.println(sb1);

  // lambda
  StringBuilder2 sb2 = strings2 -> {
   StringBuilder sb = new StringBuilder();
   for (String s : strings2) {
    sb.append(s);
   }
   return sb.toString();
  };

  String result2 =
    sb2.concat(new ArrayList<>(List.of("abc", "def", "g", "hijk")));
  System.out.println(result2);

  String result3 = sb2.concat(new LinkedList<>(List.of("xxx", "yyy", "zzz")));
  System.out.println(result3);


 }
}
