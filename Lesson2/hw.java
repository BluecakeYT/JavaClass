import java.util.Arrays;
public class hw {
    public static void main (String[] args) {
        problem1();
        problem2();
        problem3(29);
        problem4(args);
        problem5();
    }

    public static void problem1() {
        System.out.println ("--------------------Q1--------------------");
        int[] array1 = new int[] {9, 8, 7, 6, 5, 4, 3 ,2, 1};
        reverseArray(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println (array1[i]);
        }
    }

    private static void reverseArray(int[] array1) {
         for (int i = 0; i < array1.length/2; i++) {
         int x = array1[i];
         array1[i] = array1[array1.length-i-1];
         array1[array1.length-i-1] = x;
         }
    }
    public static void problem2 () {
        System.out.println ("--------------------Q2--------------------");
        int [][] array2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.printf("%4d ", array2[i][j]);
            }
            System.out.println ();
        }
    }

    public static void problem3 (int input) {

        System.out.println ("--------------------Q3--------------------");
        System.out.println(input + " in binary is " + Integer.toBinaryString(input));

    }

    public static void problem4 (String[] args) {

        System.out.println ("--------------------Q4--------------------");

        int[] array3 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array3[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(array3);


          System.out.println("The median is: " + array3[array3.length/2]);


    }
    public static void problem5 () {
        System.out.println ("\n--------------------Q5--------------------");
        int lockerSize = 100;
        boolean[] lockers = new boolean[lockerSize];
        //initialize lockers true
        for (int i = 0; i < lockerSize; i++) {
            lockers[i] = true;
        }
        for (int i = 1; i < lockerSize; i++) {
             for (int j = i + 1; j < lockerSize; j += i + 1) {
                 lockers[j-1] = !lockers[j-1];
             }
        }

        for (int i = 0; i < lockerSize; i++) {
             if (lockers[i]) {
                 System.out.println("Locker " + (i + 1) + " is open.");
             }
        }
    }
}
