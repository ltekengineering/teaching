/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class20;

/**
 *
 * @author lkhan
 */
import java.io.*;

public class Class20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       stockPerformance();
    }
    public static void stockPerformance(){
        try {
            FileReader fileReader = new FileReader("C:\\feed_archive\\TEMP_UNZIP\\GOOG.csv");
            BufferedReader buffRead  =new BufferedReader(fileReader);
            String line = "";
            //using a while loop
            String date = "";
            float open=0;
            float close=0;
            float high=0;
            float low=0;
            int volume = 0;
            float average = 0;
            float midPrice = 0;
            int firstComma,secondComma,thirdComma,fourthComma,fifthComma,sixthComma;
            //we want to read off the first line as it will create parsing error later on the actual data
            buffRead.readLine();
            //we want to print our version of the header becase we would be modifying it. 
            System.out.printf("%s %15s %15s %15s %15s %15s %15s %15s\n","DATE","OPEN","HIGH","LOW","CLOSE","VOLUME","AVERAGE PRICE","MID PRICE");
            
            
            while((line=buffRead.readLine())!=null){
//                System.out.println(line); //we don't want to print this line instead we want to print our version
                
                firstComma = line.indexOf(",");
                secondComma  = line.indexOf(",", firstComma+1);
                thirdComma  = line.indexOf(",", secondComma+1);
                fourthComma = line.indexOf(",", thirdComma+1);
                fifthComma = line.indexOf(",", fourthComma+1);
                sixthComma = line.indexOf(",", fifthComma+1);
                
                date = line.substring(0,firstComma);
                open = Float.parseFloat(line.substring(firstComma+1, secondComma));
                high = Float.parseFloat(line.substring(secondComma+1, thirdComma));
                low = Float.parseFloat(line.substring(thirdComma+1, fourthComma));
                close = Float.parseFloat(line.substring(fourthComma+1, fifthComma));
                volume = Integer.parseInt(line.substring(sixthComma+1));
                average = (open+high+low+close)/4;//this wouldn't have been possible if we didn't parase the string values in to a numerical format
                midPrice = (high+low)/2; //
                
                //now we print our data that we were able to parse
                System.out.printf("%s %15f %15f %15f %15f %15d %15f %15f\n",date,open,high,low,close,volume,average,midPrice);
                
            }
            //using a do while loop. You can use this method however its my personal preference to use the while loop
//            do{
//                line=buffRead.readLine();
//                if(line!=null){
//                    System.out.println(line);
//                }
//            }while(line!=null);
            
        } catch (Exception e) {
           System.out.println(e.getLocalizedMessage());
        }
    }
    
}
