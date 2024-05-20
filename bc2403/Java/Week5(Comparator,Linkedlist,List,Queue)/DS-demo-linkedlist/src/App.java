import java.util.LinkedList;
import java.util.List;

public class App {
   public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>(); // 唔暗示性
    strings.add("hello");
    strings.add("abc");
    System.out.println(strings.size()); // 2

    strings.remove(1); // remove [abc]
    System.out.println(strings); // [hello]
    System.out.println(strings.contains("hello")); // True. String implements equals(), so it must be true.

    // ArrayList methods = LinkedList methids ?? No. 
    // ArrayList and LinkedList has its own methods.

    List<String> ls = new LinkedList<>();
    ls.add("abc");
    ls.add("def");
    ls.add("Charles");
    for (int i = 0; i < ls.size(); i++) { // for loop
        System.out.println(ls.get(i)); // for loop
    }

    for (String s : ls) { // next
        if("def".equals(s))
        System.out.println("this is def");
    }

   }
}
