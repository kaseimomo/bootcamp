import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) throws Exception {
        // Queue is contract / interface
        List<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.remove(0);
        strings.add("def");

        Queue<String> strings2 = (Queue<String>) strings; // risk
        // strings2.remove(1); // queue does not have index concept
        strings2.add("abc");
        System.out.println(strings2.size()); // 2

        System.out.println(strings2); // [def, abc]
        System.out.println(strings2.poll()); // def // (poll() means remove and return the head object)
        System.out.println(strings2); // [abc]
        System.out.println(strings2.poll()); // abc
        System.out.println(strings2.poll()); // null
        System.out.println(strings2);// []
        strings2.add("xyz");
        strings2.add("ijk");
        System.out.println(strings2);// [xyz, ijk]
        System.out.println(strings2.peek()); // xyz //return the head object (without removal)
        System.out.println(strings2);// [xyz, ijk]

        // while loop (loop -> remove object and read object)
        while (!strings2.isEmpty()) { // size() is not stable
            System.out.println(strings2.poll());
        }
        System.out.println(strings2.size()); // 0

        strings2.add("Vincent");
        strings2.add("Oscar");

        // Remove even number
        Queue<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(101);
        integers.add(2);
        integers.add(99);
        integers.add(-8);

        // ??
        Queue<Integer> integers2 = integers; // backup ? No
        // This should be pass by reference!!

        int size = integers.size();
        int val = -1;
        while (size-- > 0) {
            val = integers.poll();
            if (val % 2 == 1) {
                integers.add(val);
            }
            System.out.println(integers);
        }
        // [101, 2, 99, -8, 1]
        // [2, 99, -8, 1, 101]
        // [99, -8, 1, 101]
        // [-8, 1, 101, 99]
        // [1, 101, 99]
        System.out.println(integers); // [1, 101, 99]
        System.out.println(integers.size()); // 3

        System.out.println(integers.remove()); // 1, what is the difference between remove() and poll()?
        System.out.println(integers); // [101, 99]
        System.out.println(integers.remove()); // 101
        System.out.println(integers.remove()); // 99
        System.out.println(integers.size()); // 0
        // System.out.println(integers.remove()); java.util.NoSuchElementException

        integers.add(2000);
        integers.add(1000);
        System.out.println(integers.remove(1000)); // true, because Integer.class has overrided equals()
        System.out.println(integers.remove(1500)); // false, because Integer.class has overrided equals()

        int[] arr = new int[] {2, 1, 3};
        int[] backup = Arrays.copyOf(arr, arr.length);
        arr[1] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(backup));
    }
}
