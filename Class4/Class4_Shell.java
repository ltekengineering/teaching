package Class4;

/**
 *
 * @author lkhan
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Class4 {

    public static void main(String[] args) {
        //First you need to instantiate an object of type File by passing in the location of the file path to the constructor. 
        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");      
        try {
            //Second you need to instantiate an object of type FileReader by passing in the file object to the FileReader constructor.
            FileReader filereader = new FileReader(file);
            //Third instantiate an object of type BufferedReader by passing in the filereader object to the BufferedReader constructor.
            BufferedReader buffread = new BufferedReader(filereader);
            
            //Finally to read a file line by line.
            String line = "";
            //The logic here is in one line. You are saying that while you set buffread.readLine() equal to line, check if it not null.
            //If it isn't null then print the line else do nothing.
            while ((line = buffread.readLine()) != null) {
                System.out.println(line);                
            }
        } 
        catch (IOException io) {
            io.printStackTrace();
        }
    }
}
