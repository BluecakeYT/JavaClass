import java.util.*;

public class parenthesis {
  public parenthesis() {

  }

  public boolean checkParen (String n){
  boolean bool = true;
  Stack<Character> st = new Stack<Character>();
  for (int i = 0; i < n.length(); i++) {
    if (n.charAt(i) == '(') {
    st.push(n.charAt(i));
  } else
    if(n.charAt(i) == ')') {
      if (st.isEmpty()) {
        st.push(n.charAt(i));
      }
       if (st.peek() == '(') {

         st.pop();
       }
    }

  }
  if (!st.isEmpty()) {
    bool = false;

  }
  return bool;
  }
  public static void main(String[] args) {
    parenthesis p = new parenthesis();
    System.out.println(p.checkParen(""));
  }
}
