package Account;
public class Userprint {
 public static void main(String[] args) {
  Account account = new Account();
  account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
  account.add(new Transaction(Sign.DEBIT, Currency.HKD, 1300));
  System.out.println(account.balance(Currency.USD)); // 1200

  account.credit(Currency.HKD, 1000);
  account.debit(Currency.HKD, 500);
  

 }
}
