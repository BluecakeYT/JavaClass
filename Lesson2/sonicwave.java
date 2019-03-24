public class sonicwave {
    public static void main (String[] args) {

       //System.out.println (printSum(10, 15));

       int[] ninecircles = new int[]{1,2,3,4,5,6,7,8,9};

       String[] defaults = new String[] {"Stereo Madness", "Back On Track", "Polargeist"};

       for (int i = 0; i < ninecircles.length; i++) {
            int tmp = i + (ninecircles.length - i - (i+1));
            System.out.println (ninecircles[tmp]);
       }
       for (int i = 0; i < defaults.length; i++) {
            System.out.println (defaults[i]);
       }

    }
    public static int printSum(int x, int y) {

       int total = 0;
       for (int i = x; i <= y; i++) {

              total += i;
         }

         return total;


    }


}
