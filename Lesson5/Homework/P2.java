public class P2 {
  public static void main(String[] args) {
    Customer c = new Customer("Lele", "123 Bor Street", "xu1234", 9.8);
    Administrator a = new Administrator("Boggle", "boggleboggle@gmail.com");
    c.setCredentials ("bbfb", "1234567");
    System.out.println(c.login());
  }
}

class User {
  String userid;
  String password;
  String email;
  public void setCredentials (String u, String p) {
    userid = u;
    password = p;
  }
  public String login () {
    return "Your ID is: " + userid + " | Your password is: " + password;
  }
}

class Customer extends User {
  String name;
  String address;
  String customerid;
  double accountBalance;
  public Customer(String n, String a, String c, double x) {
    name = n;
    address = a;
    customerid = c;
    accountBalance = x;
  }
  public void register(String c) {
    customerid = c;
  }
  public String purchase() {
    return "Purchase successful!";
  }
}

class Administrator extends User {
  String name;
  String email;
  public Administrator(String n, String e) {
    name = n;
    email = e;
  }
  public String updateProducts() {
    return "Products updated!";
  }
}
