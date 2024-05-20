package Exeption_Video;

public class V_Exception_print {
 public static void main(String[] args) {
  /* Checked exception (compile-time exception) */
  // Cannot compile if no "try {} catch()"
  // e.g.: It maybe failed to reach / login database, maybe the database / server is down.
  // In this case, Java will result as a checked exception.
  // 逼你去run之前就要處理好啲件事



  /* unchecked exception(run-time exception) */
  // 一個method如果參數有問題, 就應該要終止.
  // Run-time exception係講緊個compiler比你繼續run落去, 但你可以繼續try

  /* 1. Treat tatol amont = 0 if salary array conatin negative value */
  // int total = totalSalary(new int[] {100, -10, 45}); // int[1] is negative No.
  /* java.lang.IllegalArgumentException */
  // 在method內不應該 return -1 或者 其他用value來表示錯誤. (-1可以有其他意思, 不能夠亂用.)
  // 所以同user溝通時候, 如果入面value放錯咗的話,我哋就要reject user, 直到輸入正確先會sum total
  // 假設溝通完後, user話有負數就將total歸零處理就可以...
  // 我們可以使用 try {} catch() <- 意思是萬一有事發生, 就可以對應處理.
  int total;
  try {
   total = V_Exception.totalSalary(new int[] {100, -10, 45});
  } catch (IllegalArgumentException e) { // Catch an error event
   // and then respond a result or other actions to do so -> send email / msg
   total = 0;
  }
  System.out.println("total=" + total);

  /* 2. Run-time error if divided by 0 */
  /* java.lang.ArithmeticException: / by zero */
  int x = 0; // e.g.: We expect x should be > 0, but user input 0...
  // int r = 8 / x; // java.lang.ArithmeticException: / by zero
  // Well... ofcouse we can use if() to fix
  int r = x == 0 ? 0 : 8 / x;
  // How about using try {} catch()
  int r2;
  try {
   r2 = 8 / x; // java.lang.ArithmeticException: / by zero
  } catch (ArithmeticException e) {
   r2 = 0; // Not suppose to return 0
   // some actions like send email / msg to remind them which is okay
  }

  /* 3. Run-time error if input index is not in range of char[] */
  // java.lang.ArrayIndexOutOfBoundsException
  try {
   V_Exception.geString(new char[] {'c', 'a', 't'}, -2, 2);
  } catch (ArrayIndexOutOfBoundsException e) {
   // ...
  }

  // 4. NullPointerException 打錯logjc...空指針...冇嘢睇
  // Solution 1 (Not Recommend)
  String s = "hello";
  s = null;
  try {
   System.out.println(s.charAt(0));
   // java.lang.NullPointerException
  } catch (NullPointerException e) {
   // ... what to do??? 簡單logic又不是複雜問題
  }
  // Solution 2 (It's better to use if() to fix 簡單的解釋是可以自行解決)
  if (s != null) 
   System.out.println(s.charAt(0));

  // 5. StringIndexOutOfBoundsException 入錯野... 冇嘢睇
  String s2 = "world";
  try {
   System.out.println(s2.charAt(5));
   // java.lang.StringIndexOutOfBoundsException
  } catch (StringIndexOutOfBoundsException e) {
   // 入錯野再入過唔該 (救你唔到)
  }

  // 6. IllegalStateException
  int n1 = 7;
  int n2 = -8;
  try {
   V_Exception.checkParameters(n1, n2);
  } catch (IllegalStateException e) {
   System.out.println("Handle the IllegalStateException");
  }

  // 7. NumberFormatException
  try {
   int num = Integer.parseInt("10s");
  } catch (NumberFormatException e) {
   System.out.println("Handle the NumberFormatExeption");
  }

 }
  


 }




