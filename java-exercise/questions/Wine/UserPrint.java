package Wine;
public class UserPrint {
  public static void main(String[] args) {
   WineMaker wine1 = new WineMaker("White Wine", "Chardonnay", 89, 1100, 1);
   WineMaker wine2 = new WineMaker("White Wine", "Sauvignon Blanc", 93, 1300, 1);
   WineMaker wine3 = new WineMaker("Red Wine", "Shiraz", 90, 1300, 1);
   WineMaker wine4 = new WineMaker("Red Wine", "Carménère", 96, 1500, 1);

   System.out.println(wine1);
   System.out.println(wine2);
   System.out.println(wine3);
   System.out.println(wine4);

   CustomerOrder A = new CustomerOrder("American Club");
   A.add(wine1);
   System.out.println(A);
   A.add(wine4);
   System.err.println(A);

   CustomerOrder J = new CustomerOrder("Hong Kong Jockey Club");
   J.add(wine2);
   System.out.println(A);
   J.add(wine3);
   System.err.println(A);
   

  }
}
