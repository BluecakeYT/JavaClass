import java.util.*;

public class parenthesis {
  public boolean checkParen (String n){
      boolean bool = true;
      Stack<Character> st = new Stack<Character>();
      for (int i = 0; i < n.length(); i++) {
         char c = n.charAt(i);
         if (c == '(') {
            st.push(c);
         } else
         if(c == ')') {
            if (st.isEmpty()) {
              bool = false;
               break;
            } else {
              st.pop();
            }
         }
      }
      if (bool && !st.isEmpty()) {
         bool = false;
      }
      return bool;
   }
   public static void main(String[] args) {
      parenthesis p = new parenthesis();
      System.out.println(p.checkParen(args[0]));
   }
}
