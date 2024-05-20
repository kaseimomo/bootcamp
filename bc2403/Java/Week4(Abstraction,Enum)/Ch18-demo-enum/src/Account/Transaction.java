package Account;

public class Transaction {

  private Sign sign;
  private Currency currency;
  private double amount;

  public Transaction(Sign sign, Currency currency, double amount) {
    this.sign = sign;
    this.currency = currency;
    this.amount = amount;
  }

  public Sign getSign() {
    return this.sign;
  }

  public Currency getCurrency() {
    return this.currency;
  }


  public double getAmount() {
    return this.amount;
  }



}
