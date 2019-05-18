import java.util.*;

public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startCaps) {
    super(startCaps);
  }

  private int findPos (E e) {
    int position = 0;
    for (int i = 0; i < super.size(); i++) {

      if (e.compareTo(super.get(i)) < 0 ) {

        break;

      }
      position++;
    }
    return position;
  }
  @Override
  public boolean add (E e) {
    int position = findPos(e);
    System.out.println("add element " + e + " to position " + position);
    super.add(position, e);
    return true;
  }
  @Override
  public void add (int index, E e) {
    //makes no sense using index here lol
    this.add (e);
  }
  @Override
  public E set (int index, E e) {
    super.remove(index);
    System.out.println(this);
    this.add(e);
    return e;
  }
//test method
  public static void main (String[] args) {
    OrderedArrayList<String> ordered = new OrderedArrayList<>(10);
    System.out.println(ordered);
  //  ordered.set(0, null);
    ordered.add("aa");
    ordered.add("cb");
    ordered.add("bc");
    System.out.println(ordered);
    ordered.set(1, "deee");
    System.out.println(ordered);
  }
}
