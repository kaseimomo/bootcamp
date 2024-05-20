public class Definition {

 // **Checked Exceptions:**

 // 1. `FileNotFoundException`: Thrown when attempting to access a file that does not exist or cannot be found at the specified path.

 // 2. `IOException`: Represents a general input/output exception during file, stream, or other I/O operations.

 // 3. `ClassNotFoundException`: Thrown when trying to load a class at runtime but the specified class cannot be found in the classpath.



 // **Unchecked Exceptions (Runtime Exceptions):**

 // 1. `NullPointerException`: Occurs when attempting to access or invoke a method on an object reference that is `null`.

 // 2. `NumberFormatException`: Thrown when trying to convert a string to a numeric type, but the string does not have the appropriate format for the conversion.

 // 3. `ArrayIndexOutOfBoundsException`: Thrown when accessing an array element with an index outside the bounds of the array.

 // 4. `IndexOutOfBoundsException`: Similar to `ArrayIndexOutOfBoundsException`, this exception occurs when accessing a collection or sequence with an index out of range.

 // 5. `ArithmeticException`: Occurs when an invalid arithmetic operation is attempted, such as division by zero.

 // 6. `NoSuchElementException`: Typically thrown by collection classes when trying to access an element that does not exist.

 // 7. `UnsupportedOperationException`: Thrown to indicate that an operation is not supported, such as modifying an unmodifiable collection or calling an unsupported method.

 // Checked exceptions are those that the compiler requires you to handle explicitly in your code, either by using a `try-catch` block or by declaring that your method may throw them (`throws` clause).

 // Unchecked exceptions, also known as runtime exceptions, do not require explicit handling and can propagate up the call stack if not caught, although it's still good practice to handle them where
 // appropriate.
}
