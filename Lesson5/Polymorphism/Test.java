public class Test {
  public static void main(String[] args) {
     Animal a = new Animal();
     Bird b = new Bird();
     Animal c = new Bird();
     a.eat();
     b.eat();
     b.fly();
     b.fly (2);
     b.fly ("Max", 2);
     c.eat();
  }
}
class Animal {
  public void eat() {
    System.out.println(" This animal eats insects.");
  }
  public Animal() {
    System.out.println("I am an animal!");
  }
}
class Bird extends Animal{
  public void eat() {
    System.out.println("This bird eats seeds.");
  }
  super();
  public void fly() {
    System.out.println ("Bird is flying.");
  }

  public void fly (int height) {
    System.out.println ("Flying at" + height);
  }

  public void fly (String name, int height) {
    System.out.println (name + " is flying at " + height);
  }
}
