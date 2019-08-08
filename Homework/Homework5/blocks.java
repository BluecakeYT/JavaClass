import java.util.*;
import java.io.*;

public class blocks {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      BufferedReader f = new BufferedReader(new FileReader("blocks.in"));                                                  // input file name goes above
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      //main hashbrown map
      HashMap<Character, Integer> finalMap = new HashMap<>();
      //put stuff in the main hashbrown map
      for (int i = 0; i < alphabet.length(); i++) {
        finalMap.put(alphabet.charAt(i), 0);
      }
      //number of cards lul
      int numCards = Integer.parseInt(f.readLine());
      //the part where the cards are analyzed and sorted
      for (int i = 1; i <= numCards; i++) {
        String card = f.readLine();
        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();
        /*
        String[] words = card.split(' ');
        String word1 = words[0];
        String word2 = words[1];
        for (int i=0; i<word1.length(); i++) {
           char c = word1[i];

        }
        */
        for (int j = 0; j < card.length(); j++) {
            if (j < card.indexOf(' ')) {

               if (word1.containsKey(card.charAt(j))) {

                 word1.put(card.charAt(j),word1.get(card.charAt(j)) + 1);
               } else
               if (!(word1.containsKey(card.charAt(j)))) {
                 word1.put(card.charAt(j),1);
               }
            } else
            if (j > card.indexOf(' ')) {
               if (word2.containsKey(card.charAt(j))) {
                 word2.put(card.charAt(j),word2.get(card.charAt(j)) + 1);
               } else
               if (!(word2.containsKey(card.charAt(j)))) {
                 word2.put(card.charAt(j),1);
               }
            }
        }

        for (int j = 0; j < alphabet.length(); j++) {

          if (word2.containsKey(alphabet.charAt(j)) && word1.containsKey(alphabet.charAt(j))) {
             System.out.println("multiple:" + alphabet.charAt(j));
             if (word2.get(alphabet.charAt(j)) > word1.get(alphabet.charAt(j))) {
               System.out.println("word2 more:" + alphabet.charAt(j));
                finalMap.put(alphabet.charAt(j), finalMap.get(alphabet.charAt(j)) + word2.get(alphabet.charAt(j)));
             } else {
               System.out.println("word1 more/equal:" + alphabet.charAt(j));
                finalMap.put(alphabet.charAt(j), finalMap.get(alphabet.charAt(j)) + word1.get(alphabet.charAt(j)));
             }
          } else
            if (word1.containsKey(alphabet.charAt(j))) {
               finalMap.put(alphabet.charAt(j), finalMap.get(alphabet.charAt(j)) + word1.get(alphabet.charAt(j)));

            } else
            if (word2.containsKey(alphabet.charAt(j)) && !(word1.containsKey(alphabet.charAt(j)))) {


               finalMap.put(alphabet.charAt(j), finalMap.get(alphabet.charAt(j)) + word2.get(alphabet.charAt(j)));
            }


        }
      }

      for (int i = 0; i < alphabet.length(); i++) {

          out.println(finalMap.get(alphabet.charAt(i)));
      }
      out.close();
    }
}
