public class T1SuperLong extends Number implements T1Swim {

 @Override
  public double doubleValue() {
    return super.shortValue(); // super by Number, which not much methods ...
  }

  @Override
  public int intValue() {
    return super.shortValue();
  }

  @Override
  public float floatValue() {
    return super.shortValue();
  }

  @Override
  public long longValue() {
    return super.shortValue();
  }


  @Override
  public void swim() {
    System.out.println("I'm swimming ...");
  }
 
}
