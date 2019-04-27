import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//https://www.englishclub.com/vocabulary/adjectives-personality-positive.html was used to get the adjectives
public class ListMaker {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner filereader = new Scanner(new File("words.txt"));
        String x = "";
        String holder = "";
        while(filereader.hasNextLine()){
            holder = filereader.nextLine();
            if(!holder.equals("")) // checks to see if it is an empty line
            x = x+"\""+holder+"\","  ;
        }
        x= x.substring(0,x.length()-1); //drops the last comment
        System.out.println(x);
    }
}
