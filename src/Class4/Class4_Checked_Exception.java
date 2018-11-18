/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class Class4_Checked_Exception {

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
                int locationOfThirdComma = line.indexOf(",", locationOfSecondComma + 1);
                int locationOfFourthComma = line.indexOf(",", locationOfThirdComma + 1);
                int locationOfFifthComma = line.indexOf(",", locationOfFourthComma + 1);
                int locationOfSixthComma = line.indexOf(",", locationOfFifthComma + 1);                
                
                String date = line.substring(0, locationOfFirstComma);                
                                
                double open;
                double high;                
                double low;                
                double close;                
                double adjClose;                
                int volume;                
                try {
                    open = Double.parseDouble(line.substring(locationOfFirstComma + 1, locationOfSecondComma));
                    high = Double.parseDouble(line.substring(locationOfSecondComma + 1, locationOfThirdComma));
                    low = Double.parseDouble(line.substring(locationOfThirdComma + 1, locationOfFourthComma));
                    close = Double.parseDouble(line.substring(locationOfFourthComma + 1, locationOfFifthComma));
                    adjClose = Double.parseDouble(line.substring(locationOfFifthComma + 1, locationOfSixthComma));
                    volume = Integer.parseInt(line.substring(locationOfSixthComma+1));
                } catch (NumberFormatException nb) {
//                    nb.printStackTrace();
                    System.out.println(nb.getLocalizedMessage());
                    open = 1;
                    high = 1;
                    low=1;
                    close=1;
                    adjClose=1;
                    volume=1;                   
                }
                double avgPrice = (open+close+high+low)/4;
                System.out.printf("Date:%s,Open:%f,High:%f,Low:%f,Close:%f,AdjClose:%f,Volume:%,d,Dollar Volume:%,f,Average Price:%f\n",
                        date,open,high,low,close,adjClose,volume,volume*close,avgPrice);
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
