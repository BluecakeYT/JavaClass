import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lesson{
  public static void main(String[]args){
    String fileName = "file.txt";
    try{
      File f = new File(fileName);//can combine
      Scanner in = new Scanner(f);//into one line
      // reading line by line
      /*
      while(in.hasNext()){
        String line = in.nextLine();
        //do something with line
        System.out.println(line);
      }
      */
      // reading word by word
      while(in.hasNext()){
        String word = in.next();
        //do something with word
        System.out.println(word);
      }
    }catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
      //e.printStackTrace();
      System.exit(1);
    }
  }
  public void mergeSort () {
    
  }
}
