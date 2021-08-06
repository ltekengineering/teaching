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

public class Class4_Unchecked_Exception {
 
    public static void main(String[] args) throws IOException{
        
        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");        
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            String line="";
            
            while((line=buffread.readLine())!=null){
//                System.out.println(line); 
//                System.out.println(line.substring(11, 19));
                int locationOfFirstComma = line.indexOf(",");
                int locationOfSecondComma = line.indexOf(",", locationOfFirstComma+1);
//                System.out.println("First Comma: "+locationOfFirstComma + " Second Comma: "+locationOfSecondComma);
                
                //store the substring in to a variable. 
                String open = line.substring(locationOfFirstComma+1, locationOfSecondComma);
                double openValue;
                try{
                    openValue = Double.parseDouble(open);
                }catch(NumberFormatException nb){
//                    nb.printStackTrace();
                    System.out.println(nb.getLocalizedMessage());
                    openValue = 0;
                }
                System.out.println(openValue*2);
            }            
    }
}
