public class ABCException extends RuntimeException {
 // "extends RuntimeException" implies "ABCExeption" is a run-time exception

 public static void main(String[] args) {
  String checking = checkName("Maccccc", "Chan");
 
  System.out.println(checking);
  
  Integer.parseInt("10s"); // parseInt() = String入面要入數字
 }

 public static String checkName(String firstName, String lastName) throws ABCException{
  if (firstName == null || lastName == null)
  throw new IllegalArgumentException();
   if(firstName.length() + lastName.length() > 10)
   throw new ABCException();
   return firstName.concat(" ").concat(lastName);
 }


}
