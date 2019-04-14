public class Tester{
  public static void main(String[] args) {
    Audi audi = new Audi();
    audi.changeGear(3);
    System.out.println(audi.getGear());
    audi.speedUp(2);
    System.out.println(audi.getSpeed());
  }
}
