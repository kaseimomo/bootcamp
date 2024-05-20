

public class BCList<T, U> {
 private T data1;
 private U data2;

 public BCList(T data1, U date2) {
  this.data1 = data1;
  this.data2 = date2;
 }


 public T getData1() {
  return this.data1;
 }

 public U getData2() {
  return this.data2;
 }


 public static <T extends Number> double sum(T number1, T number2) {
  // Is "T" here related to line 1?
  // -> No. Becasue <T> here is extending Number
  // you can set other name T, U, V like <V extends Number> double sum(V number1, V number2)
  // Below here, we can use sysout .getClass() to print out what class is the object
  System.out.println(number1.getClass()); // class java.lang.Integer
  System.out.println(number2.getClass()); // class java.lang.Long
  return number1.doubleValue() + number2.doubleValue();
 }

 public static <U extends Object> String concat(U word1, U word2) {
  return word1.toString() + word2.toString();
 }


 public static void main(String[] args) {
  // If T and U are different type
  BCList<String, Integer> bclist = new BCList<>("hello", 12);
  System.out.println(bclist.getData1()); // hello
  System.out.println(bclist.getData2()); // 12

  // If T and U are same type
  BCList<String, String> bcList2 = new BCList<>("HELLO", "Charles");
  System.out.println(bcList2.getData1()); // HELLO
  System.out.println(bcList2.getData2()); // CHARLES
  // Thus, T and U can be same type and different type
  // If "public class BCList<T, T>" -> two attributes must be same types

  // This is the static methoed of <T extends Number>
  System.out.println(sum(Integer.valueOf(13), Long.valueOf(20)));
  // int -> Integer (Autobox)
  // Integer -> int (Unbox)
  // int -> long (up-cast)
  // long -> int (down-cast -> overflow)
  // BUT
  // Integer !-> Long
  // Between Wrapper Class has no conversion: Integer -> Long (No auto or direct relation)

  System.out.println(concat('h', 'i'));

 }


}
