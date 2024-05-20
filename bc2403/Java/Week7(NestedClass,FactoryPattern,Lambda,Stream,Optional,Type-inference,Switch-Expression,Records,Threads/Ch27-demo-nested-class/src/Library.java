import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Library {
 private List<Book> books; // What is the different here -> private List<Book> books = new LinkedList<>();

 public Library() {
  this.books = new LinkedList<>(); // What is the different here -> private List<Book> books = new LinkedList<>();
 }

 public void add(Book book) {
  this.books.add(book);
 }

 public class BookIterator implements Iterator<Book> { // Inner Class
  private int currentIdx = 0;

  @Override
  public boolean hasNext() {
   return this.currentIdx < books.size();// But not this.books
  }

  @Override
  public Book next() {
   if (!hasNext())
    throw new IllegalStateException("No more elements in the list");
   return books.get(currentIdx++);
  }

  public void reset() {
   
  }
 }

 public static class Book {
  private String isbn;
  private String author;

  public Book(String isbn, String author) {
   this.isbn = isbn;
   this.author = author;
  }

  public String getIsbn() {
   return this.isbn;
  }

  public String getAuthor() {
   return this.author;
  }
 }


 public static void main(String[] args) {
  Library library = new Library();
  library.add(new Library.Book("1234", "John Smith"));
  library.add(new Library.Book("5678", "Alan Walker"));
  library.add(new Library.Book("9898", "Ryan Hopers"));

  Library.BookIterator lb = library.new BookIterator();
  while (lb.hasNext()) {
   Library.Book book = lb.next();
   System.out.println(book.getIsbn() + " " + book.getAuthor());
  }
 }
}
