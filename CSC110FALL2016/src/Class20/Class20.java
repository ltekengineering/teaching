/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class20;

import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author lkhan
 */
public class Class20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = null;
        try {
            // TODO code application logic here
            FileReader readFile = new FileReader("C:\\Users\\lkhan\\Downloads\\Dummy.txt");
            BufferedReader buffRead = new BufferedReader(readFile);
            
            int iniPosition;
            int currentPosition;
            int temp;
            int counter;

            while ((line=buffRead.readLine())!= null) {
                iniPosition = 0;
                currentPosition = 0;
                temp = 0;
                counter=1;
                System.out.println("#)"+line);            
                while (currentPosition > -1 && currentPosition <= line.length()) {
                    currentPosition = line.indexOf(" ", temp);
                    if (counter % 12 == 0) {
                        if (currentPosition != -1) {
                            System.out.println(line.substring(iniPosition, currentPosition));
                            temp = currentPosition + 1;
                            iniPosition = currentPosition + 1;
                            counter++;                            
                        }else{
                            System.out.println(line.substring(iniPosition, line.length()));
                        }
                        
                    } else {
                        counter++;
                        temp = currentPosition + 1;
                        if (currentPosition == -1) {
                            System.out.println(line.substring(iniPosition, line.length()));
                        }
                    }                    
                }
            }
            buffRead.close();
            readFile.close();
        } catch (Exception ex) {
        }
        
    }
}
