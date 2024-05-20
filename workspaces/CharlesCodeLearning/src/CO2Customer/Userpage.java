package CO2Customer;

public class Userpage {
 public static void main(String[] args) {

  /* // Item section */
  // Object: Item [] -> contain item1 and item2
  Item item1 = new Item("Banana", 12.5, 2);
  /* Find the subTotal */
  System.out.println("$" + item1.subTotal());
  Item item2 = new Item("Egg", 40.1, 2);
  /* Find the subTotal */
  System.out.println("$" + item2.subTotal());
  // Item[] items = new Item[2]; // User who doesn't know Array
  // items[0] = item1; // User who doesn't know Array
  // items[1] = item2; // User who doesn't know Array
  

  /* // Order section */
  // Object: Order [] -> contain order1
  Order order1 = new Order("ON0001");
  // Order[] orders = new Order[2]; // User who doesn't know Array
  // orders[0] = order1; // User who doesn't know Array
  // what if we don't want to show Item [] to user...
  // User don't have to understand Array...
  // How about we do in this way
  // Open an add method in Order Class
  order1.addItem(item1);
  order1.addItem(item2); // System.out.println(order1);
  /* Find the total */
  System.out.println("Total = $" + order1.total());

  /* // Customer section */
  // Object: Customer;
  Customer c = new Customer("Charle Chan");
  c.addOrder(order1);
  System.out.println(c);
 }
}
