package Account;

public enum Currency {
 HKD(1.0d), //
 USD(7.8), //
 CNY(0.923d), //
 JPY(19.5535), //
 ;

 private double value;

 private Currency(double value) {
  this.value = value;
 }

 public static double foreignAC(Currency currency) {
  switch (currency) {
   case USD:
    return Currency.USD.value;
   case CNY:
    return Currency.CNY.value;
   case JPY:
    return Currency.JPY.value;
   case HKD:
    return Currency.HKD.value;
  }
  return -1.0;
 }

}
