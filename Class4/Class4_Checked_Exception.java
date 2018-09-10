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

        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");
        //Example of checked exception handling
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            String line = "";
            while ((line = buffread.readLine()) != null) {
//                System.out.println(line); 
//                System.out.println(line.substring(11, 19));
                int locationOfFirstComma = line.indexOf(",");
                int locationOfSecondComma = line.indexOf(",", locationOfFirstComma + 1);
//                System.out.println("First Comma: "+locationOfFirstComma + " Second Comma: "+locationOfSecondComma);

                //store the substring in to a variable. 
                String open = line.substring(locationOfFirstComma + 1, locationOfSecondComma);
                double openValue;
                try {
                    openValue = Double.parseDouble(open);
                } catch (NumberFormatException nb) {
//                    nb.printStackTrace();
                    System.out.println(nb.getLocalizedMessage());
                    openValue = 0;
                }
                System.out.println(openValue * 2);
            }

        } //       catch(FileNotFoundException fn){
        ////           fn.printStackTrace();
        //            System.out.println(fn.getLocalizedMessage());
        //            
        //        }
        catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }

    }
}
