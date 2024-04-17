/**
 * Expected Output: Running as fast as it can! Speed: 150 Speed: 120, carModel: ModelX
 */
public class Exercise13 {
    private int speed;
    private String carModel;

    public Exercise13() {

    }


    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("Running as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void printSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed: " + this.speed);
    }

    // Create method with same name, but with different parameters
    public void printSpeed(int speed, String carModel) {
        this.speed = speed;
        this.carModel = carModel;
        System.out.println(
                "Speed: " + this.speed + ", carModel: " + this.carModel);
    }

    @Override
    public String toString() {
        return this.speed + " " + this.carModel;
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Exercise13 myCar = new Exercise13(); // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.printSpeed(150); // Call the speed() method
        myCar.printSpeed(120, "ModelX"); // Overriding
        System.out.println(myCar);
    }
}
