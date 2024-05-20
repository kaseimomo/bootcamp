public class BasicException {
    public static void main(String[] args) {
        // check exception ( exception)


        // unchecked exception(run time exception)
        // 1. IllegalArgumentException
        // If the salary array contain negative value, you treat total as 0.
        int total = 0;
        try {
            total = totalSalary(new int[] {100, -10, 45}); // java.lang.IllegalArgumentException
        } catch (IllegalArgumentException e) {
            total = 0;
        }
        System.out.println("total=" + total);

        // 2. ArithmeticException (/ by zero)
        int x = 0;
        int r = x == 0 ? 0 : 8 / x;

        int r2 = 0;
        try {
            r2 = 8 / 0; // java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException e) { // ArithmeticException e : 運算上不會出現的
            // send sms
            // send email to your boss
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            getString(new char[] {'c', 'a', 't'}, -2, 2);
            // java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 3
        } catch (ArrayIndexOutOfBoundsException e) {
            // ...
        }

        // 4. NullPointerException
        String s = "hello";
        s = null;
        // Solution 1: (not suggested)
        try {
            System.out.println(s.charAt(0));// java.lang.NullPointerException
        } catch (NullPointerException e) {
            // what to do???
        }
        // Solution 2:
        if (s != null)
            System.out.println(s.charAt(0));

        // 5. StringIndexOutOfBoundsException
        String s2 = "hello";
        try {
            System.out.println(s2.charAt(5));// java.lang.StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // ...
        }

        // 6. // IllegalStateException
        int n1 = 7;
        int n2 = -8;

        try {
            checkParameters(n1, n2);
        } catch (IllegalStateException e) {
            System.out.println("Handle the IllegalStateException");
        }

        // 7. NumberFormatException
        try {
            int num = Integer.parseInt("10s");
        } catch (NumberFormatException e) {
            System.out.println("Handled the NumberFormatException");
        }
    }

    // ArrayIndexOutOfBoundsException
    public static String getString(char[] characters, int beginIdx,
            int endIdx) {
        StringBuilder sb = new StringBuilder(); // StringBuilder唔需要return自己
        for (int i = beginIdx; i <= endIdx; i++) {
            sb.append(characters[i]);
        }
        return sb.toString();
    }

    public static int totalSalary(int[] arr) { // e.g. 假設唔可以負數
        int sum = 0;
        for (int x : arr) {
            if (x < 0)
                throw new IllegalArgumentException(); // an error event
            // *exception has no return value.. No one understand if you return -1
            sum += x;
        }
        return sum;
    }

    public static void checkParameters(int n1, int n2) {
        if (n1 + n2 > 0)
            System.out.println("it is correct state");
        if (n1 * n2 > 100)
            System.out.println("it is correct state");
        throw new IllegalStateException();
    }
}
