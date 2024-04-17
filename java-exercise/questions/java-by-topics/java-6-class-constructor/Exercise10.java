/**
 * Expected Output: 8
 */
public class Exercise10 {
    private int x; // Create an instance attribute
    
    // Create a class constructor for the Main class
    public Exercise10() {
         this.x = 8;// Set the value for the instance attribute x to expected output
    }

    public int getX() {
        return this.x;
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
        Exercise10 x = new Exercise10();
        // Print the value of instance attribute
        System.out.println(x.getX());
    }
}
