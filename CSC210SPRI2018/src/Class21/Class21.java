/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class21;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author lkhan
 */
public class Class21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock s = new Stock();
        Stock s2 = new Stock(15.5, 13.5, 12.5, 15.1,1500);
//        s.getClose();
//        s2.getClose();
//        s.getOpen();
        stockPerformance();
        
    }
    public static void stockPerformance(){
        Stock s;
        try {
            FileReader fileReader = new FileReader("C:\\feed_archive\\TEMP_UNZIP\\GOOG.csv");
            BufferedReader buffRead  =new BufferedReader(fileReader);
            String line = "";
            //using a while loop
            
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
                
                //public Stock(double open, double close, double high, double low, int volume)
                
                s = new Stock(Float.parseFloat(line.substring(firstComma+1, secondComma)),
                        Float.parseFloat(line.substring(fourthComma+1, fifthComma)),
                        Float.parseFloat(line.substring(secondComma+1, thirdComma)),
                        Float.parseFloat(line.substring(thirdComma+1, fourthComma)),
                        Integer.parseInt(line.substring(sixthComma+1)));
                s.setDate(line.substring(0,firstComma));
                
                
                //now we print our data that we were able to parse
                System.out.printf("%s %15f %15f %15f %15f %15d %15f %15f\n",s.getDate(),s.getOpen(),s.getHigh(),s.getLow(),s.getClose(),s.getVolume(),s.getAverage(),s.getMid());
                
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
