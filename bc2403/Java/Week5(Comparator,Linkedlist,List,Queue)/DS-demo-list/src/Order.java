import java.util.ArrayList;
import java.util.Objects;

public class Order {
 private int amount;

 public Order(int amount) {
  this.amount = amount;
 }

 public int getAmount() {
  return this.amount;
 }

 @Override
 public String toString() {
  return this.amount + " ";
 }
 // ArrayList<Order> orders = new ArrayList<>();

 @Override
 public int hashCode() {
  return Objects.hash(this.amount);
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (!(obj instanceof Order))
   return false;
  Order c = (Order) obj;
  return Objects.equals(this.amount, c.getAmount());
 }

}
