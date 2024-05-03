/**
 * Start Machine: MachineA //
 * Stop Machine: MachineA //
 * Start Computer: ComputerB //
 * Start Computer: ComputerB
 */
class Machine {
    String name;

    public Machine(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Start Machine: " + this.name);
    }

    public void stop() {
        System.out.println("Stop Machine: " + this.name);
    }
}


class Computer extends Machine {

    // Implement Constructor
    public Computer(String name) {
        super(name);
    }

    // Implement start() method
    @Override
    public void start() {
        System.out.println("Start Computer: " + this.name);
    }

    // Implement stop() method
    @Override
    public void stop() {
        System.out.println("Stop Computer: " + this.name);
    }

    // Implement restart()
    public void restart() {
        System.out.println("restart");
    }
}


class Exercise23 {
    public static void main(String[] args) {
        Machine myMachine = new Machine("MachineA");
        myMachine.start();
        myMachine.stop();

        // During the runtime, JVM know which start() method will be called
        // Why it takes advantages using Machine for type declaration
        Machine computer = new Computer("ComputerB");
        computer.start();
        computer.stop();
        // computer.restart(); // why this method call will cause compile error?

        Computer computer2 = new Computer("ComputerC");
        computer2.restart(); // this is fine, why?
        // Child class allows to have new methods.
    }
}
