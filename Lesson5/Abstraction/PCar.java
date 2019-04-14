public interface PCar {
  public void changeGear (int u);
  public void speedUp (int increment);
  public void applyBrakes (int decrement);
}

class Audi implements PCar {
  int speed = 0;
  int gear = 1;
  int crement = 1;;

  public void changeGear (int u) {
    gear = u;
  }
  public void speedUp (int increment) {
    speed += increment;
  }
  public void applyBrakes (int decrement) {
     speed -= decrement;
  }
  public int getGear() {
    return gear;
  }
  public int getSpeed() {
    return speed;
  }
}
