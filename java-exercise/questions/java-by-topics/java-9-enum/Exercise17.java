enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println("This is " + myVar + " level");
        // Write a switch statement to print the expected output.
        System.out.println("enum is " + myVar + ", and its value is " + Level.MEDIUM.getValue());
    }
}