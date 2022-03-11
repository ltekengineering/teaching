/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondProjectB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;

/**
 *
 * @author lkhan
 */
public class TradingAnalysis {
    public static void main(String[] args){
        int i = 0;
        String line;
        int shortMovingAvg = 5;
        int longMovingAvg = 10;
        
        double sumOfShortPrices=0;
        double sumOfLongPrices=0;
        try {
            String[] lineArray;
            BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\lkhan\\Downloads\\msft.csv"));
            while((line=buffRead.readLine())!=null){
                lineArray = line.split(",");
                System.out.println(lineArray[0]+":"+lineArray[1]);
                i++;
                sumOfShortPrices += Double.parseDouble(lineArray[5]);
                sumOfLongPrices += Double.parseDouble(lineArray[5]);
                if(i%shortMovingAvg==0){
                    sumOfShortPrices/=shortMovingAvg;
                }
                
            }
        } catch (Exception e) {
        }
        
    }
}
