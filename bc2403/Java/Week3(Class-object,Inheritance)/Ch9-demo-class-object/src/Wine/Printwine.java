package Wine;
public class Printwine {
  public static void main(String[] args) {
   Wine wine1 = new Wine("White Wine", "Chardonnay", 89, 1100, 1);
   Wine wine2 = new Wine("White Wine", "Sauvignon Blanc", 93, 1300, 1);
   Wine wine3 = new Wine("Red Wine", "Shiraz", 90, 1300, 1);
   Wine wine4 = new Wine("Red Wine", "Carménère", 96, 1500, 1);

  //  System.out.println(wine1);
  //  System.out.println(wine2);
  //  System.out.println(wine3);
  //  System.out.println(wine4);

   CustomerOrder A = new CustomerOrder("American Club");
   A.add(wine1);
   System.out.println("Sub-total = " + wine1.subTotal());
   // System.out.println(A);
   A.add(wine4);
   System.out.println("Sub-total = " + wine4.subTotal());
   System.out.println(A);
  System.out.println("Total = $" + A.total());

   CustomerOrder J = new CustomerOrder("Hong Kong Jockey Club");
   J.add(wine2);
   J.add(wine3);
   System.out.println(J);
   System.out.println("Total = $" + J.total());
   

  }
}
