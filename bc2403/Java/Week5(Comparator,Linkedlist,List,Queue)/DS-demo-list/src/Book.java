import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

 private double price;
 private String author;

 public Book(double price, String author) {
  this.price = price;
  this.author = author;
 }

 public double getPrice() {
  return this.price;
 }

 public String getAuthor() {
  return this.author;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (!(obj instanceof Book))
   return false;
  Book books = (Book) obj;
  return Objects.equals(this.author, books.getAuthor()) //
    && Objects.equals(this.price, books.getPrice());
 }

 @Override
 public int hashCode() {
  return Objects.hash(this.price, this.author);
 }

 @Override
 public String toString() {
  return "Book (" + "Author: " + this.author //
    + ", price:" + this.price + ")";
 }

 public static void main(String[] args) {
  // Book array
  Book[] books = new Book[2];
  books[0] = new Book(1.2d, "Charles");
  books[1] = new Book(8.4d, "Moon");

  // Charles??
  System.out.println(books[0].getAuthor());

  // ArrayList
  ArrayList<Book> books2 = new ArrayList<>(); //
  books2.add(new Book(3.4d, "Jenson")); // constructor(this.price & this.author)
  books2.add(new Book(3.6d, "Jeffery"));
  books2.add(new Book(10.2d, "Jack"));

  System.out.println(books2.size()); // 3 -> size() is a presentation
  books2.add(new Book(100.2d, "Jason"));
  System.out.println(books2.size()); // 4
  books2.add(new Book(113.5, "Ray"));

  System.out.println(books2.contains(new Book(100.6d, "Jeffery")));
  System.out.println(books2.contains(new Book(3.6d, "Jeffery")));

  // remove()
  books2.remove(new Book(3.6d, "Jeffery"));
  System.out.println(books2.size());
  System.out.println(books2);
  System.out.println(books);

  // ArrayList has ordering
  books2.remove(0);
  System.out.println(books2.size());
  System.out.println(books2);

  books2.set(0, new Book(20.3, "Oscar"));
  System.out.println(books2.size());
  System.out.println(books2);

  System.out.println(books2.isEmpty());

  System.out.println(books2.subList(0, 2));

  System.out.println(books2.get(0));

  books2.clear();
  // books2 = new ArrayList<>(); // <- no relation
  System.out.println(books2);
  System.out.println(books[0].toString());

  // Initialize with objects
  List<Book> books3 = new ArrayList<>( // 要背左佢... new ArrayList and new HashSet 先可以用.add
    List.of(new Book(10.3, "Katie"), new Book(20.1, "Vincent")));
  List<Book> books4 = //
    List.of(new Book(10.3, "Katie"), new Book(20.1, "Vincent"));

  System.out.println(books3.size());
  System.out.println(books4.size());

  books3.add(new Book(10.9, "Cherry"));
  //books4.add(new Book(10.9, "Oscar")); // java.lang.UnsupportedOperationException

  for (Book b : books4) {
   System.out.println(b.getPrice() + " " + b.getAuthor());
  }
 }
}
