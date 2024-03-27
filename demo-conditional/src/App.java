public class App {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World! " + y); // Hello, World! 10
        } else { // x <= 3
            // y = 100;
        System.err.println("Charles! " + y);
    }

    if ( x > 2) {
        System.out.println("x > 2");
    } else if (x >= 0 && x <= 2) { // AND events
        System.out.println("x >= 0 and x <= 2");
    } else {
        System.out.println("x < 0");
       }

       // Example 1
       int a = 3;
       int b = 10;
       int max = 0;

       if (b > a) {
        max = b;
       }
       System.out.println("The max number is " + max + ".");
       // Print out: The max number is 10.

       // Example 2: equals()
       String day = "Sunday"; // Monday, Tuesday...
       String target = "weekend";
        // Print out: It is a weekday.
       //   || = or
       if ("Monday".equals(day)|| "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)) {
        target = "weeday";
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
        // 70 - 79 ->C
        // < 70 -> F (Fail)
        // Print out: "The grade is B and passed."

       if (score > 90) {
        grade = 'A';
        if (score >= 80) {
            grade = 'B';
        if (score >= 70) {
            grade = 'C';
        if (score < 70) {
            grade = 'F';
        }
        String examResult = "passed";
        if (grade == 'F') {
            examResult = "failed";
        }
        System.out.println("The grade is" + grade + " and " + examResult + ".");
    }
        
}

}
}
