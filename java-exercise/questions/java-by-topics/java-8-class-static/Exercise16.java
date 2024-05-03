// Please complete ClassA.java
class ClassA {
    // 1
    public static final int SOME_NUMBER = initSomeNum();
    public static int someOtherNumber = 99;
    // 2
    public final String someString = initSomeString();
  
    // 1.2
    // one static initialization block to print Something here
    static {
        System.out.println("[Class A] Calling static initialization block");
    }
    // 2.2
    // initialization block to print Something here
    {
        System.out.println("[Class A] Calling initialization block");
    }

    // 1.1
    // one static Method initSomeNum() return int 0, print Something here
    public static int initSomeNum() {
        System.out.println("[Class A] Calling private static method");
        return 0;
    }
    
    // 2.1
    // Instance Method initSomeString() return String and print something here
    private String initSomeString() {
        System.out.println("[Class A] Calling initialization block");
        return someString;
    }
    // A Constructor for ClassA to print something here
    public ClassA()
  
  }
  
/*
 * ------ Output ------
 * [Class A] Beginning of object creation
 * [Class A] Calling private static method
 * [Class A] Calling static initialization block
 * [Class A] Calling private method
 * [Class A] Calling initialization block
 * [Class A] Calling constructor
 * [Class A] End of object creation
 */
public class Exercise16 {
    public static void main(String[] args) {
        System.out.println("[Class A] Beginning of object creation");
        ClassA objectA = new ClassA();
        System.out.println("[Class A] End of object creation");
    }
}