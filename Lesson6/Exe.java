public class Exe {

  public static void main(String[] args) {
    try {

    int [] arr = new int [1];
    arr [3] = 2;
  } catch (ArithmeticException e) {
    System.out.println ("Begone error thot.");
  } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println (e.getMessage());
  }
    System.out.println ("Omg we survived the error XD");
  }

}
