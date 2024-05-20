public class InterfaceRule {
 // Interfaces in Java follow a set of rules that define how they can be declared and used.
 // Here are the key rules for interface classes in Java:

 // 1. Declaration:
 // > An interface is declared using the interface keyword followed by the interface name.
 // > It can contain method signatures, default methods, static methods,
 // > constants, and nested types (interfaces or classes).
 //
 // **Example:
 // public interface MyInterface {
 // void method1(); // Method signature
 // default void method2() {
 // // Default method implementation
 // }
 // static void method3() {
 // // Static method implementation
 // }
 // int CONSTANT = 10; // Constant declaration
 // }

 // 2. Access Modifiers:
 // > Interface methods are implicitly public and abstract.
 // > Interface fields (constants) are implicitly public, static, and final.
 // > You can explicitly use these modifiers, but it's redundant because they are already implied.

 // 3. Inheritance:
 // > Interfaces can extend one or more other interfaces using the extends keyword.
 //
 // Example:
 // public interface MySubInterface extends MyInterface {
 // // Additional methods or constants
 // }

 // 4. Implementation:
 // > Classes implement interfaces using the implements keyword.
 // > A class can implement multiple interfaces, separated by commas.
 //
 // Example:
 // public class MyClass implements MyInterface, AnotherInterface {
 // // Implementation of interface methods
 // }

 // 5 Multiple Inheritance:
 // > Java supports multiple inheritance through interfaces, meaning a class can inherit behavior from multiple interfaces.
 // > However, a class can only inherit from one superclass due to the single inheritance rule for classes.
 //
 // Example:
 // public interface InterfaceA {
 // void methodA();
 // }
 //
 // public interface InterfaceB {
 // void methodB();
 // }
 //
 // public class MyClass implements InterfaceA, InterfaceB {
 // // Implementation of InterfaceA and InterfaceB methods
 // }

 // 6. Default and Static Methods:
 // > Interfaces can have default and static methods with implementations.
 // > Default methods allow you to add new methods to an interface without breaking existing implementations.
 // > Static methods provide utility methods that are associated with the interface itself.
 //
 // Example:
 // public interface MyInterface {
 // default void defaultMethod() {
 // // Default method implementation
 // }
 // static void staticMethod() {
 // // Static method implementation
 // }
 // }
 
 // These rules collectively define how interfaces are structured, inherited, implemented, and used in Java.
}
