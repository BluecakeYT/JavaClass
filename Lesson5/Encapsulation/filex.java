public class filex {
  public static void main (String[] args) {

  Employee pl = new Employee("name");
  System.out.println (pl.name);
  }
}

class Employee {
  private String name;
  public String getName() {
    return name;
  }
  public void setName (String n) {
    this.name = n;
  }
}
