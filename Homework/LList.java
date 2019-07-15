public class LList {
   Node start;
   Node end;
   int length;
   public LList() {

   }
   public boolean add(Integer value) {
       Node node1 = new Node(value);
            node1.next = null;

            if (start == null) {
               start = node1;
            }
            else {
                Node last = new Node (end.getData());
                while (last.next != null) {
                     last = last.next;
                }
                last.next = node1;
            }
            return true;
   }
   public int size() {
   return length;
   }
   public String toString() {
     //what do you do here
     return "what do I do lmao";
   }
   public Integer get(int index) {
       if (index < 0 || index > size()) {
            return -1;
       }
       Node n = new Node(0);
       for (int i = 0; i < index; i++) {
            n = n.next();
       }
       return n.getData();
   }
   public Integer set(int index, Integer value) {
       if (index < 0 || index > size()) {
           return -1;
       }
       Node n = new Node(0);
       for (int i = 0; i < index - 1; i++) {
           n = n.next();
       }
       n.setData(value);
       return n.getData();
   }
   public boolean contains(Integer value) {
       boolean bool = false;
       Node r = new Node (0);
       while (r.next != null) {
            if (r.getData() == value) {
                bool = true;
                break;
            }
            r = r.next;
       }
       return bool;

   }
   public int indexOf(Integer value) {
       int index = -1;
       Node r = new Node (0);
       while (r.next != null) {
            index++;
            if (r.getData() == value) {
                break;
            }
            r = r.next;
       }
       return index;
   }
   public void add(int index,Integer value) {
     Node n = new Node(0);
     for (int i = 0; i < index - 1; i++) {
         n = n.next();
     }
     n.setData(value);

     }

   public Integer remove(int index) {
     if (index < 0 || index > size()) {
         return -1;
     }
      Node n = new Node(0);
      for (int i = 0; i < index - 1; i++) {
          n = n.next();
      }
      n.setData(null);
      return n.getData();
    }
   public boolean remove(Integer value) {
     Node node1 = new Node(value);
          node1.next = null;

          if (start == null) {
              start = null;
          }
          else {
              Node last = new Node (end.getData());
              while (last.next != null) {
                   last = last.next;
              }
              last.next = null;
          }
          return true;
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
     return "what do I do lmao";
   }
}
