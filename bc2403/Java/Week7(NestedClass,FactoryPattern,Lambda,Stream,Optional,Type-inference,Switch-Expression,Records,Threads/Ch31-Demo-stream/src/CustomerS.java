import java.util.Objects;

public class CustomerS {
 private int age;
 private String name;

 public CustomerS(int age, String name) {
  this.age = age;
  this.name = name;
 }

 public int getAge() {
  return this.age;
 }

 public String getName() {
  return this.name;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public void setName(String name) {
  this.name = name;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (!(obj instanceof CustomerS))
   return false;
  CustomerS customer = (CustomerS) obj;
  return Objects.equals(this.age, customer.getAge()) //
    && Objects.equals(this.name, customer.getName());
 }

 @Override
 public String toString() {
  return "Customer(" + this.age + " " + this.name + ")";
 }
}
