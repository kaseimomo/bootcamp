public record Person(String name, int age) {

 public static int x = 10;
 public static int getX() {
  return x;
 }
 // You can @Override the default implemented method getter, equals(), hashCode(), toString()
 @Override
 public String name() {
  return "Helo";
 }
 
 public static void main(String[] args) {
 // Only one constructor - all args
 Person p1 = new Person("Charles", 14); 
 Person p2 = new Person("Charles", 14); 
 System.out.println(p1.equals(p2)); // true, already override
 System.out.println(p1.hashCode() == p2.hashCode()); // true, already override
 System.out.println(p1.toString()); // Person[name=Charles, age=14]

 // getter
 System.out.println(p1.name()); // getter, Skip "get"
 System.out.println(p1.age());

 // no setter
 }
}
