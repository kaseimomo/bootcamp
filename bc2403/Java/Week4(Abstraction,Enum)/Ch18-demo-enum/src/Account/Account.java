package Account;

public class Account {

  // ...one to many
  private Transaction[] transactions;

  // what is this? Constructor
  public Account() {
    this.transactions = new Transaction[0];
  }

  //
  public void add(Transaction transaction) {
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[copyArr.length + 1];
    int idx = 0;
    for (Transaction t : copyArr) {
      this.transactions[idx++] = t;
    }
    this.transactions[idx] = transaction;
  }

  // Credit method
  public void credit(Currency currency, double amount) {
    Transaction creditTransaction =
        new Transaction(Sign.CREDIT, currency, amount);
    add(creditTransaction);
  }

  // Debit method
  public void debit(Currency currency, double amount) {
    Transaction debitTransaction =
        new Transaction(Sign.DEBIT, currency, amount);
    add(debitTransaction);
  }

  // balance method
  public double balance(Currency currency) {
    double balance = 0.0d;
    for (Transaction t : this.transactions) {
      if (t.getSign() == Sign.CREDIT) {
        balance += t.getAmount() * Currency.foreignAC(currency);
      } else if (t.getSign() == Sign.DEBIT) {
        balance -= t.getAmount() * Currency.foreignAC(currency);
      }
    }
    return balance;

  }

public static void main(String[] args) {
  
}

}
