public class LList {
   Node start;
   Node end;
   int length;
   public LList() {

   }
   public boolean add(Integer value) {
       Node node1 = new Node(value);

       if (start == null) {
           start = node1;
           end = node1;
           }
           else {
           end.next = node1;
           node1.prev = end;
           end = node1;
           }
           length++;
           return true;
   }
   public int size() {
   return length;
   }
   public String toString() {
     return "Start: " + start + " End: " + end + " Length: " + length;
   }
   public Integer get(int index) {
       if (index < 0 || index > size()) {
            return null;
       }

       Node tempFirst = start;
       for (int i = 0; i < index - 1; i++) {
            tempFirst = tempFirst.next();
       }
       return tempFirst.getData();
   }
   public Integer set(int index, Integer value) {
       if (index < 0 || index > size()) {
           return null;
       }
       Node n = start;
       for (int i = 0; i < index - 1; i++) {
           n = n.next();
       }
       n.setData(value);
       return n.getData();
   }
   public boolean contains(Integer value) {
       boolean bool = false;
       Node r = start;
       while (r != null) {
            if (r.getData() == value) {
                bool = true;
                break;
            }
            r = r.next;
       }
       return bool;

   }
   public int indexOf(Integer value) {
       int index = 0;
       Node r = start;
       while (r != null) {
            index++;
            if (r.getData() == value) {
                break;
            }

            r = r.next;

       }
       if (index == length && end.getData() != value) {
         index = -1;
       }

       return index;
   }
   public void add(int index, Integer value) {
     if (index > 0 && index <= size()) {
     Node n = new Node(value);
     Node p = start;
     for (int i = 0; i < index - 1; i++) {
        p = p.next();
     }
     if (p != start) {
     p.prev().setNext(n);
     n.setPrev(p.prev());
   } else {
     start = n;
   }
     n.setNext(p);
     p.setPrev(n);
     length++;
     }
     }

   public Integer remove(int index) {
     if (index < 0 || index > size()) {
         return null;
     }
      Node n = start;
      for (int i = 0; i < index - 1; i++) {

          n = n.next();
      }
      Integer g = n.getData();


      if (n != start) {
        n.prev().setNext(n.next());
      } else {
        start = n.next();
      }
      if (n != end) {
        n.next().setPrev(n.prev());
      } else {
        end = n.prev();
      }
      if (n == start && n == end) {
        n.setData(null);
        n.setPrev(null);
        n.setNext(null);
      }
      length--;
      return g;
    }
   public boolean remove(Integer value) {
     Node n = start;
     for (int i = 0; i < indexOf(value) - 1; i++) {
       n = n.next();

     }
     if (n != start) {
       n.prev().setNext(n.next());
     } else {
       start = n.next();
     }
     if (n != end) {
       n.next().setPrev(n.prev());
     } else {
       end = n.prev();
     }
     if (n == start && n == end) {
       n.setData(null);
       n.setPrev(null);
       n.setNext(null);
     }
     length--;
     return true;
  }
  public static void main(String[] args) {
    Integer rem = 2;
    LList list = new LList();
    list.add(2);
    list.add(3);
    list.add(23);
    list.add(3, 7);
    list.remove(rem);
    Node s = list.start;
    for (int i = 0; i < list.size(); i++) {
      Integer g = s.getData();
      System.out.println(g);
      s = s.next();
    }
    list.set(1, 9);
    System.out.println(list.get(1));
    System.out.println(list.indexOf(23));

  }

}

class Node {
   Node next;
   Node prev;
   Integer data;
   public Node(int d) {
     data = d;
     next = null;
     prev = null;
   }
   public Node next() {
     return next;
   }
   public Node prev() {
     return prev;
   }
   public void setNext(Node other) {
     next = other;
   }
   public void setPrev(Node other) {
     prev = other;
   }
   public Integer getData() {
     return data;
   }
   public Integer setData(Integer i) {
     data = i;
     return data;
   }
   public String toString() {
     //what do you do here
     return "Next: " + next + " Prev: " + prev + " Data: " + data;
   }
}
