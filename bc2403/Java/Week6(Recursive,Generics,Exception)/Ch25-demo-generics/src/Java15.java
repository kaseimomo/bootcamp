import java.util.ArrayList;
import java.util.List;

public class Java15 {
    public static void main(String[] args) throws Exception {
        /* Before Java 1.5 (before 2005) */
        List ls = new ArrayList<>(); // <- List is not yet define, just like Object[]
        ls.add("!");
        ls.add(123);
        ls.add(123L);
        ls.add(123.3d);
        System.out.println(ls); // [!, 123, 123, 123.3] /* BUT there's no type check!!! Not Good.... */

        // Object has no concat()
        // So if we want to concat a word "world"...
        // We have to use for-loop and down casting the object to String...
        for (Object o : ls) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s.concat("world"));
            } else if (o instanceof Long) {
            }
        }

        // Or Hard-code....
        System.out.println(((String) ls.get(0)).charAt(0));


        // This was the issue before Java1.5


        /* After Java 1.5 -> Genercis */
        List<Long> ll = new ArrayList<>();
        // Tpye-safty: Long tpye only
        ll.add(3L);
    }
    // Java runtime 應該由java開始計
    // 因為個file compile到就交俾個server
    // 不是一邊寫一邊交俾個server, 那是javascript
    // java 快過 js 係睇咩perspective
    // 係睇個開始run開始計
    // class file放去server, 然後js係將人類睇得明嘅file放上去
    // 而js後面有個engin將js個program轉化為類似class file的狀態
    // 所以轉化個過程俾java慢
    // 後期java可以再快啲係因為可以控制到memory
}
