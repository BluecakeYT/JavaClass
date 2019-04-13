public class Example {
  public static void main (String[] args) {
     Circle spherix = new Circle (2, "Blue");
    spherix.setRadius (3);
    System.out.println(spherix.getRadius());
    System.out.println (spherix.getCircum());
    System.out.println (spherix.getArea());
    System.out.println (spherix.getColor());
    System.out.println (spherix);
  }
}

class Circle {
  int radius;
  String color;
    public Circle (int r, String c) {
    radius = r;
    color = c;

  }
  public String toString() {
    return "radius: " + radius + " color: " + color;
  }
  public int getRadius () {
    return radius;
  }

  public String getColor () {
    return color;
  }

  public double getCircum () {
    return 2 * radius * Math.PI;
  }

  public double getArea () {
    return radius * radius * Math.PI;
  }
  public void setRadius (int r) {
    radius = r;
  }
}
