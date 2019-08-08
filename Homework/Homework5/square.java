/*
ID: orecree1
LANG: JAVA
PROG: square
*/

import java.io.*;
import java.util.*;

public class square {
    public static void main (String[] args) throws FileNotFoundException, IOException {
       BufferedReader f = new BufferedReader(new FileReader("square.in"));                                                  // input file name goes above
       PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
       String s = f.readLine();
       String t = f.readLine();
       String u = s + " " + t;


       int biggestX = 0;
       int smallestX = Integer.parseInt(u.substring(0, 1));
       int smallestY = Integer.parseInt(u.substring(2, 3));
       int biggestY = 0;

       for (int i = 0; i < u.length(); i++) {
           System.out.println(u.substring(i, i+1).trim());
           if (i % 4 == 0) {
             if ((u.length() <= 15 || u.charAt(i+1) == ' ') && Integer.parseInt(u.substring(i, i+1).trim()) > biggestX) {

                biggestX = Integer.parseInt(u.substring(i, i+1).trim());

             } else
             if ((u.length() <= 15 || u.charAt(i+1) == ' ') && Integer.parseInt(u.substring(i, i+1).trim()) < smallestX) {

                smallestX = Integer.parseInt(u.substring(i, i+1).trim());


             }
             if (u.length() > 15) {
             if (u.charAt(i+1) != ' ' && Integer.parseInt(u.substring(i, i+2).trim()) > biggestX) {

                biggestX = Integer.parseInt(u.substring(i, i+2).trim());


             }
             if (u.charAt(i+1) != ' ' && Integer.parseInt(u.substring(i, i+2).trim()) < smallestX)

                smallestX = Integer.parseInt(u.substring(i, i+2).trim());


             }
           } else
           if (i % 2 == 0 && i % 4 != 0) {

             if (u.charAt(i) != ' ' && (u.length() <= 15 || u.charAt(i+1) == ' ') && Integer.parseInt(u.substring(i, i+1).trim()) > biggestY) {

                biggestY = Integer.parseInt(u.substring(i, i+1).trim());


             } else
             if ((u.length() <= 15 || u.charAt(i+1) == ' ') && Integer.parseInt(u.substring(i, i+1).trim()) < smallestY) {

                smallestY = Integer.parseInt(u.substring(i, i+1).trim());
             }

             if (u.length() > 15) {
             if (u.charAt(i+1) != ' ' && Integer.parseInt(u.substring(i, i+2).trim()) > biggestY) {

                biggestY = Integer.parseInt(u.substring(i, i+2).trim());


             }
             if (u.charAt(i+1) != ' ' && Integer.parseInt(u.substring(i, i+2).trim()) < smallestY) {

                smallestY = Integer.parseInt(u.substring(i, i+2).trim());


             }
           }
           }
       }
       System.out.println(biggestX);
       System.out.println(biggestY);
       int xLength = biggestX - smallestX;
       int yLength = biggestY - smallestY;
       if (xLength > yLength) {
         out.print(xLength * xLength);
       } else {
         out.print(yLength * yLength);
       }
       out.close();
    }
}
