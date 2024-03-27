public class Operator {
  public static void main(String[] args) {
    int x = 1;
    x = x + 1; // 2
    x = x + 1; // 3

    int y =1;
    y++; // 2
    y++; // 3
    ++y; // 4
    y = y + 1; // 5
    y += 1; // 6
    System.out.println(y);

    int e = 10;
    e--;
    --e;
    e -= 2; //6
    System.out.println(e);

    int predecrement = --e; // predecrement = 6 - 1 = 5
    System.out.println(predecrement); // = 5 (run pre- first)

    int postdecrement = e--; // postdecrement = 5 - 1 = 4
    System.out.println(postdecrement); // = 5 (run post first)

    int postdecrement1 = --e; // 4 - 1 = 3
    System.out.println(postdecrement1); // = 3 (run pre- first)


  }
}
