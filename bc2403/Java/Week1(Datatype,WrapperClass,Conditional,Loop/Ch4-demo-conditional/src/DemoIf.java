public class DemoIf {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World! " + y); // Hello, World! 10
        } else { // x <= 3
            // y = 100;
            System.out.println("Charles! " + y);
        }

        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) { // && -> AND events: 2 conditions
            System.out.println("x >= 0 and x <= 2");
        } else {
            System.out.println("x < 0");
        }

        // Example 1
        int a = 12;
        int b = 10;
        int max = a;

        if (b > a) {
            max = b;
        }
        System.out.println("The max number is " + max + ".");
        // Print out: The max number is 12.

        // Example 2: equals()
        String day = "Sunday"; // Monday, Tuesday...
        if (day.equals("Sunday")) {
            System.out.println(day + " is weekend.");
        } else if (day.equals("Saturday")) {
            System.out.println(day + " is weekend.");
        } else if (day.equals("Monday")) {
            System.out.println(day + " is weekday.");
        } else if (day.equals("Tuesday")) {
            System.out.println(day + " is weekday.");
        } else if (day.equals("Wednesday")) {
            System.out.println(day + " is weekday.");
        } else if (day.equals("Thursday")) {
            System.out.println(day + " is weekday.");
        } else if (day.equals("Friday")) {
            System.out.println(day + " is weekday.");
        } // Print out: Sunday is a weekend.

        /* 2nd mothod */
        String target = "weekend";
        // || = or
        /* Remember to use right hand String first -> "xxxx".equals() */
        if ("Monday".equals(day) || "Tuesday".equals(day)
                || "Wednesday".equals(day) || "Thursday".equals(day)
                || "Friday".equals(day)) {
            target = "weekday";
        }
        System.out.println(day + " is " + target);

        // Compare Strings
        // 1. String value compares with String variable ("Monday".equals(day))
        // 2. String variable compares with String variable

        // Example 3
        int score = 85;
        char grade = ' ';
        // score > 90 -> A
        // 80 - 90 -> B
        // 70 - 79 -> C
        // < 70 -> F (Fail)
        // Print out: "The grade is B and passed."
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score < 70) {
            grade = 'F';
        }
        String examResult = "passed";
        if (grade == 'F') {
            examResult = "Failed";
        }
        System.out
                .println("The grade is " + grade + " and " + examResult + ".");

        // String
        String s1 = "hello";
        // check if the length of s1 > 5
        if (s1.length() > 5) {
            System.out.println("sl.length() > 5");
        }
        // Another approach: (! means NOT)
        if (!(s1.length() <= 5)) {
            System.out.println();
        }


        // char (==, !=)
        char gender = 'F';
        if (gender == 'M') {

        } else if (gender == 'F')
            if (gender != 'M') {
                System.out.println("gender is not equals to M");
            }

        /* int, long, short, byte, float, double (==, !=, >=, <=, >, <) */
        int j = 10;
        if (j > 10.2) { /* j -> double */
            System.out.println("j > 10.2");
        } else {
            System.out.println("j <= 10.2"); // print
        }

        double u = 10.4;
        if (u > 10) { // 10 -> double: 10.4 > 10.0
            System.out.println("u > 10");
        }

        /* boolean( ==, !=) */
        int v = 4;
        boolean b1 = v > 10; // false
        if (b1 == true) {

        }
        if (b1 != false) {

        }
        if (!(b1 == true)) {

        }


        // String.charAt(int index) -> return char
        String s2 = "abcdefg";
        // Check if s2 start with 'a' and end with 'g', print out "yes", otherwise "no"
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(6));

        if (s2.charAt(0) == 'a' && s2.charAt(6) == 'g') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // Vincent vers.
        if (s2.charAt(0) == 'a' && s2.charAt(s2.length() - 1) == 'g') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        int age = 18;
        String LastName = "Chan";

        /* if the left condition pass, the right one will be skipped. */
        if (age == 18 || "Chan".equals(LastName)) {

        }
        if (age == 18 || "Chan".equals(LastName) && x == 3) { // &&會行先

        }
        if ((age == 18 || "Chan".equals(LastName)) && x == 3) { // age == 18 || "Chan".equals(LastName)

        }

        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println(true && true); // true

        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false
        System.out.println(true || true); // true
    }
}


