public class one {
  public static void main (String[] args) {
    Account creeper = new Account (20, 36.5);
    System.out.println (creeper.getAccountNumber());
    creeper.setBalance (30.6);
    System.out.println (creeper.getBalance());
    creeper.addCredit (30.7);
    System.out.println (creeper.getBalance());
    creeper.checkDebit (99.8);
    System.out.println (creeper.toString());
  }
}
