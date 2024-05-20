package Customer;

public class print {
 public static void main(String[] args) {
  Item item1 = new Item("リンゴ", 4.5, 2);
  System.out.println(item1.subtotal()); // 9
  Item item2 = new Item("ミカン", 5.3, 3);
  System.out.println(item2.subtotal());
  // Item[] items = new Item[2];
  // items[0] = item1;
  // items[1] = item2;

  Order order1 = new Order("V00001");  // ????
  //Order[] orders = new Order[2];
  //orders[0] = order1;
  order1.add(item1);
  System.out.println(order1); // Order(orderNo=V00001, items=[Item(description=APPLE, price=4.5, quantity=2)])
  order1.add(item2);
  System.out.println(order1);// Order(orderNo=V00001, items=[Item(description=APPLE, price=4.5, quantity=2), Item(description=ORANGE, price=4.5, quantity=2)])

  //System.out.println(order1.total());

  Customer c = new Customer("sallychan");
  c.add(order1);
  System.out.println(c);


 }
}
