/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class17;

/**
 *
 * @author lkhan
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File dummy = new File("C:\\feed_archive\\DATA\\NONTBA\\MBSPRICEHISTORY.csv");
        int i=0;
//        try {
//            Scanner reader = new Scanner(dummy);
//            while(reader.hasNext()){
//                i++;
////                System.out.println(reader.nextLine());
//            }
//            System.out.println(i);
//        } catch (Exception e) {
//        }
        try {
            int j=0;
            String myline="";
            FileReader dummyReader = new FileReader(dummy);
            BufferedReader dummyBuffRead = new BufferedReader(dummyReader);
            
            while((myline = dummyBuffRead.readLine())!= null){
                i++;
            }
            System.out.println(i);
        } catch (Exception e) {
        }
    }
    
}
