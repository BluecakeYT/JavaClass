public class Driver {

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
