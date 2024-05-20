public class DemoWhileLoop {
    public static void main(String[] args) throws Exception {

        // 1. intitial value
        // 2. continue condition
        // 3. incremental / decremental
        for (int i = 0; i < 3; i++) {

        }

        int[] arr = new int[] {2, 10, 3, -1};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // print the value
        }
        // for-each loop
        // If you want to through all element from the beignning, you can use for-each
        for (int i : arr) {
            System.out.println(i); // print the value
        }

        String[] strings = new String[] {"abc", "def"};
        for (String str : strings) {
            System.out.println(str); // print value
        }

        //
        int count = 0;
        while (count < strings.length) {
            System.out.println(strings[count]);
                count++;
        }

        // infinity loop
        // byte b = 0;
        // while (b < 128) {
        //    b++;
        // }

        int a = 1023;
        // Target: int array [1, 0, 2, 3]
        int c = a / 10;
        int d = a % 10;
        int copy = a;
        count = 0;
        while (copy > 0) {
            copy /= 10;
            count++;
        }
        System.out.println("count = " + count); // 4
        int[] result = new int[count];
        // 

        // do-while loop
        count = 0;
        do {
            if (count == 1) {
                break;
            }
            System.out.println("hello");
            count++;
        } while (count < 3);
    }
}
