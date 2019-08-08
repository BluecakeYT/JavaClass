import java.util.*;
import java.io.*;

public class cowsignal {

  public static void main(String[] args) throws IOException, FileNotFoundException{
     //readLines
     //string tokenize the first line
     //loop through the next few lines M times
     //for every character, print it out k times
     //success!!!!!!!!!!!!!!!!
     BufferedReader f = new BufferedReader(new FileReader("cowsignal.in"));                                                  // input file name goes above
     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
     StringTokenizer st = new StringTokenizer(f.readLine());
     int m = Integer.parseInt(st.nextToken());
     int n = Integer.parseInt(st.nextToken());
     int k = Integer.parseInt(st.nextToken());
     for (int i = 0; i < m; i++) {
         String s = f.readLine();
         String newRow = "";
         for (int j = 0; j < s.length(); j++) {
             String t =  "" + s.charAt(j);
             for (int l = 0; l < k - 1; l++) {
                 t += s.charAt(j);
             }
             newRow += t;

         }
         for (int j = 0; j < k; j++) {
             out.println(newRow);
         }
     }
     out.close();
  }

}
