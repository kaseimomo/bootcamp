import java.util.Objects;

public class Customer {

 private String name;
 private int age;

 public Customer(String name) {
  this.name = name;
 }

 public String getName() {
  return this.name;
 }

 // equals()
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (!(obj instanceof Customer))
   return false;
  Customer c = (Customer) obj;
  return Objects.equals(this.name, c.getName());
 }

 @Override
 // hashCode()
 public int hashCode() {
  return Objects.hash(this.name);
 }

 @Override
 public String toString() {
  return "Customer(" + "Name: " + this.name + ")";
 }

}
