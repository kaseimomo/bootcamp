package maths;

@FunctionalInterface
public interface Ex_MO {
 double element(int a, int b);

 static double casting(int a, int b, Ex_MO spell) {
  return spell.element(a, b);
 }

 public static void main(String[] args) {

  Ex_MO fireBall = (level, hit) -> level * 100 * (hit / level);
  System.out.println(Ex_MO.casting(12, 100, fireBall));

  Ex_MO windBlast = (level, slash) -> level * 100 * (slash / level);
  System.out.println(Ex_MO.casting(15, 50, windBlast) );
 }
}
