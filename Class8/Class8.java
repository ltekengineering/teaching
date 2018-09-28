/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lkhan
 */
public class Class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");
        //Example of checked exception handling
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            String line = "";
            String lineArray[];
            while ((line = buffread.readLine()) != null) {
//                System.out.println(line); 
//                System.out.println(line.substring(11, 19));
                lineArray = line.split(",");                                
                String date = lineArray[0];//date
                //instantiate an array
                double dailyPrices[] = new double[5];                              
                int volume;                
                try {
                    //set the values here. 
                    //open
                    dailyPrices[0] = Double.parseDouble(lineArray[1]);
                    //high
                    dailyPrices[1] = Double.parseDouble(lineArray[2]);                    
                    //low
                    dailyPrices[2] = Double.parseDouble(lineArray[3]);
                    //close
                    dailyPrices[3] = Double.parseDouble(lineArray[4]);
                    //adjusted close
                    dailyPrices[4] = Double.parseDouble(lineArray[5]);
                    
                    volume = Integer.parseInt(lineArray[6]);
                } catch (NumberFormatException nb) {
//                    nb.printStackTrace();
                    System.out.println(nb.getLocalizedMessage());
                    dailyPrices[0]=1;                    
                    dailyPrices[1]=1;
                    dailyPrices[2]=1;
                    dailyPrices[3]=1;
                    dailyPrices[4]=1;
                    volume=1;                   
                }
                double avgPrice = (dailyPrices[0]+dailyPrices[3]+dailyPrices[1]+dailyPrices[2])/4;
                
                System.out.printf("Date:%s,Open:%f,High:%f,Low:%f,Close:%f,AdjClose:%f,Volume:%,d,Dollar Volume:%,f,Average Price:%f\n",
                        date,dailyPrices[0],dailyPrices[1],dailyPrices[2],dailyPrices[3],dailyPrices[4],volume,volume*dailyPrices[3],avgPrice);
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
