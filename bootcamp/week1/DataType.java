public class DataType {
  public static void main(String[] args) {
    // variable 變量
    // integer 整數
    int x = 3; // 3 is into x, which x is like a house that store 3.
    int age = 18;
    System.out.println(x); // 3

    x = 200; // int x = 3 is already delare(Imagein a baby is born). x is able to change without declear again.
    System.out.println("x"); // x
    System.out.println(x); // 200

    int y = -20;
    y = 100;

    int sum = x + y + age;
    System.out.println(sum); // 318

    int price = 8;
    int quantity = 10;
    int total = price * quantity; // 80

    int price2 = 10;
    int quantity2 = 4;
    double total2 = price2 * quantity2; // 40

    // camlCase
    double averagePrice = (total + total2) / (quantity + quantity2);
    System.out.println(averagePrice);

    int a = 1;
    int b = 4;
    int c = a / b; // 0.25 -> 0
    System.out.println(c);

    double k = 1.3;
    double k2 = 1.32;
    double k3 = 1;
    double k4 = -100;
    double k5 = 1.45678987654387498743124092834098723409872342134;
    System.out.println(k5);

    double k6 = 0.1 + 0.2; // 0.3
    System.out.println(k6);

    double k7 = 0.2 + 0.3;
    System.out.println(k7);

    int u = 10 % 3;
    System.out.println(u); // 1

    int h; // declaration
    //System.out.println(h); // error
    h = 10; //initialization

    // byte value is between -128 to 127
    byte b1 = 10;
    byte b2 = 127;
    // byte b3 = 128; compile time error
    byte b4 = -128;
    // byte b5 = -129; compile time error

    int i1 = 100;

    long l1 = i1; // 100; // i1 + 100 -> int value -> long variable
    System.out.println(l1);

    // Java ensures type security
    // int to short is not okay
    // short s4 = i1;
    short s5 = 10;
    // byte b10 = s5; //from short to byte
    byte b11 = 1;
    s5 = b11; //ok

    double d3 = i1; // int -> double(OK)
    double d4 = 10.2;
    // i1 = d4; // double -> int (NOT OK)

    float f3 = i1; // int -> float (OK)
    float f4 = 10.2f; // 10.2 is a double value by default
    // i1 = f4; // float -> int (NOT OK)

    double d5 = 10.4; // 10.4 is a double value by default
    double d6 = 10.4d; // you explicitly assign a double value

    int r1 = 10; // 10 is a int value by default
    byte b10 = 4; // for integer, java will help check the value, if it is in range. int -> byte
    // byte b12 = r1; // security problem -> error

    long l4 = i1; // int -> long
    long l5 = 5; // 5 is an int value by default
    
    long l6 = 100_000; // 1000000 is an int value
    long l7 = 1000000L; // 1000000is a long value

    // long l8 = 220000000000; // out of range
    long l9 = 2200000000000000L;

    // char
    char c1 = 'a';
    char c2 = '0';
    char c3 = '$';
    char c4 = ' ';
    // char c5 = ''; // ''no value will compile time error
    // char c6 = 'aa'; // allow single character only

    // boolean
    boolean b9 = true;
    boolean b12 = false;
    // boolean b13 = 'a';
    // boolean b14 = 10;

    // int h1 = 10 + 300L; // int value + long value -> 310 long value. long -> int (error)
    long h2 = 10 + 300L; // int value + long value -> 310 long value. long -> long
    

  }

}
