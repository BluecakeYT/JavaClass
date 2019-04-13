public class Account {
  public int accountNumber;
  public double balance;

  public Account(int a, double r) {
    accountNumber = a;
    balance = r;
  }

 public Account(int a) {
   accountNumber = a;
 }

  public int getAccountNumber () {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double r) {
    balance = r;
  }

  public void addCredit(double d) {
    balance += d;
  }

  public void checkDebit(double d) {
    if (balance > d) {
      balance -= d;
   } else {
     System.out.println ("You don't have enough money to pay off your debt!");
   }
 }
 public String toString() {
   return "Accout Number: " + accountNumber + " | Balance: $" + balance;
 }
}
