import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DemoDSforOB {
 public static void main(String[] args) {
  Map<String, L1_StringPrinter> map = new HashMap<>();
  L1_StringPrinter sp = new L1_StringPrinter("hello");
  L1_StringPrinter sp2 = new L1_StringPrinter("world");
  map.put("a", sp);
  map.put("b", sp2);

  Queue<L1_StringPrinter> qs = new LinkedList<>();
  qs.add(sp);
  qs.add(sp2);

  sp2.setData("xxx"); // 
  map.get("b").setData("zzz"); // use map key to change map value
  System.out.println(map.size()); // 2
  System.out.println("qs=" + qs); // qs=[StringPrinter(data=hello), StringPrinter(data=zzz)]


  // L1_StringPrinter sp3 = new StringPrinter("xxx");
  // map.put("b", sp3); // key exists, replace value
 }
}
