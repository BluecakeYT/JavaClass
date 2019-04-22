public class X {
  public static void main(String[] args) {
    Dog d = new Dog("Bill");
    System.out.println (d.getName());
    d.speak();
  }
}

abstract class Pet {
  private String myName;
  public Pet (String name) {
    myName = name;
  }
  public String getName() {
    return myName;
  }
  public abstract String speak();
}

class Dog extends Pet {
  public Dog (String name) {

  }
  public String speak() {
    return "Woof Woof";
  }
}
