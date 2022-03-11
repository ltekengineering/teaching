/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondProjectB;

/**
 *
 * @author lkhan
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;


public class ReadTradeData {
    
    String[] tradeData = {"afadf","asdfaf","asdfa"};
    
    public void readFiles(){
        int i = 0;
        String line;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\lkhan\\Downloads\\msft.csv"));
            while((line=buffRead.readLine())!=null){
                System.out.println(line);
//                tradeData[i] = line;
                i++;
            }
        } catch (Exception e) {
        }
        System.out.println("Blah Blah");
    }
}
