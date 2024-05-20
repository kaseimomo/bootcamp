package Ch15_TopmostClassObj;

public class UserPrint {
 public static void main(String[] args) {
  ParentClass oa = new SubClassA();
  ParentClass ob = new SubClassB();

  oa.run(); // Class A are running.
  ob.run(); // Class B are running.

  // oa.swim();
  /* HERE the swim() method is compile error because ParentClass has no swim() method. */
  /* We can downcast the swim method, which is RISKY */
  // Solution:
  SubClassA oa2 = null; 
  if (oa instanceof SubClassA) {
   oa2 = (SubClassA) oa;
   oa2.swim();
  }
  SubClassA oa3 = new SubClassA();
  oa3.swim();

  
  

 }
}
