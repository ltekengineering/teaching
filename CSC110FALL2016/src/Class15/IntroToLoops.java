/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
/**
 *
 * @author lkhan
 */
public class IntroToLoops {

    /**
     * @param args the command line arguments
     */
    static String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        long timeKeeper = System.currentTimeMillis();
        File MBS = new File("C:\\feed_archive\\Models\\Dummy.txt");
        int characters = 0;
        
//        try {
//            BufferedReader buffReader = new BufferedReader(new FileReader("C:/feed_archive/DATA/NONTBA/MBSPRICEHISTORY.csv"));
////            BufferedReader buffReader = new BufferedReader(new FileReader(MBS));
//            String line;
//            while((line = buffReader.readLine())!= null){
////                System.out.println(line);
//                characters++;
//            }
//        } catch (Exception e) {
//        }
        
//        try {
//            
//            Scanner inputFile = new Scanner(new FileReader("C:/feed_archive/DATA/NONTBA/MBSPRICEHISTORY.csv"));
//            while(inputFile.hasNextLine()){
//                characters++;
////                System.out.println(inputFile.nextLine());
//            }
//        } catch (Exception e) {
//        }
        
        try {
            FileReader reader = new FileReader(new File("C:/feed_archive/DATA/NONTBA/MBSPRICEHISTORY.csv"));
            int l;
            while((l = reader.read())!=-1){           
//                System.out.println((char)l);
//                characters++;
                
            }

        } catch (Exception e) {
        }
        System.out.printf("%d characters read. It took %d seconds",characters,(System.currentTimeMillis()-timeKeeper)/1000);
        writeToOutput();
    }
    public static void writeToOutput(){
        System.out.println(name);
    }
}
