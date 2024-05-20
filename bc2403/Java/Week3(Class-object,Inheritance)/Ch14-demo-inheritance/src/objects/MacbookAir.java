package objects;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {
  private double inch;
  private double cpu;
  private double ram;
  private double disk;
  private Color color;

  public MacbookAir(double inch, double cpu, //
      double ram, double disk, Color color) {
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.disk = disk;
    this.color = color;
  }

  public double getInch() {
    return this.inch;
  }

  public double getCpu() {
    return this.cpu;
  }

  public double getRam() {
    return this.ram;
  }

  public double getDisk() {
    return this.disk;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir ma = (MacbookAir) obj;
    // return this.inch == ma.getInch() //
    // && this.cpu == ma.getCpu() //
    // && this.ram == ma.getRam() //
    // && this.disk == ma.getDisk() //
    // && this.color == ma.getColor();
    return Objects.equals(this.inch, ma.getInch()) //
        && Objects.equals(this.cpu, ma.getCpu()) //
        && Objects.equals(this.ram, ma.getRam()) //
        && Objects.equals(this.disk, ma.getDisk()) //
        && Objects.equals(this.color, ma.getColor());
  }

  @Override // 記得要打override,幫自己check hashCode() 有冇打錯字
  public int hashCode() {
    return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
  }


  public static void main(String[] args) {
    MacbookAir m = new MacbookAir(13d, 3d, 8d, 256d, Color.BLACK);
    MacbookAir m2 = new MacbookAir(13d, 3d, 8d, 256d, Color.BLACK);
    System.out.println(m == m2);
    System.out.println(m.equals(m2));

    System.out.println(m.hashCode()); // 112810359, Object.class hashCode() 有機會重複 overflow
    System.out.println(m2.hashCode()); // 2124308362
    // after override
    System.out.println(m.hashCode()); // 205533718
    System.out.println(m2.hashCode()); // 205533718

    System.out.println(System.identityHashCode(m)); // 112810359
    System.out.println(System.identityHashCode(m2)); // 2124308362

    // Sorting
    int[] arr = new int[] {10, 5, 2, 4};
    Arrays.sort(arr); // merge sort, ascending sorting
    System.out.println(Arrays.toString(arr));

    MacbookAir[] arr2 = new MacbookAir[] {new MacbookAir(0, 0, 0, 0, null),
        new MacbookAir(0, 0, 0, 0, null)};

    Class<?> c = m.getClass();
    System.out.println(c.getName()); // objects.MacbookAir

  }
}
