import java.util.*;
import java.io.*;

public class cowtip {
  /*
  ~start from the nth row and go up (bottom up)
  ~use getFarthest() to return the farthest 1 in the row
  ~
  */
    public static void untip (int[][] cows, int x, int y) {
      for (int i = 0; i <= x; i++) {
          for (int j = 0; j <= y; j++) {
              if (cows[i][j] == 1) {
                 cows[i][j] = 0;
              } else
              if (cows[i][j] == 0) {
                cows[i][j] = 1;
              }
          }
      }
    }

    public static int getFarthest(int[] arr) {
      int farthest = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 1) {
             farthest = i;
          }
      }
      return farthest;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
      System.out.println("start");
      BufferedReader f = new BufferedReader(new FileReader("cowtip.in"));                                                  // input file name goes above
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));
      int n = Integer.parseInt(f.readLine());
      int[][] cows = new int[n][n];
      for (int i = 0; i < n; i++) {
      String s = f.readLine();
          for (int j = 0; j < n; j++) {
              cows[i][j] = Character.getNumericValue(s.charAt(j));
          }
      }
      int numMoves = 0;
      boolean isUntipped = false;
      for (int i = n - 1; i >= 0; i--) {
          while (isUntipped == false) {
            int addTest = 0;
            for (int j = 0; j < n; j++) {
                addTest += cows[i][j];
            }

            if (addTest == 0) {
                isUntipped = true;
            } else {
              untip (cows, i, getFarthest(cows[i]));
              
              numMoves++;

            }
          }

         isUntipped = false;
      }

    out.print(numMoves);
    out.close();
    System.out.println("endlol");
    }

}
