public class gd {
  public static void main (String[] args) {
  Eagle e = new Eagle();
  e.flyUp();
  e.flyDown();
  System.out.println(e.reproduction);
  }
}

class Bird {

  String reproduction = "eggs";
  String outerCovering = "feather";
  public void flyUp() {
    System.out.println ("Flying Up");
  }

  public void flyDown() {
    System.out.println ("Flying Down");
  }
}

class Eagle extends Bird {
  String name = "Eagle";
  int life = 15;
  public void chirp() {
    System.out.println ("kaw");
  }
}
