/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

import Class9.Stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lkhan
 */
public class Class11A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");
        //Example of checked exception handling
        try {
            //Step1
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            buffread.readLine();//header and we are reading off so we don't have to deal with it.
            String line = "";

            ArrayList<String[]> msft = new ArrayList();

            while ((line = buffread.readLine()) != null) {
                msft.add(line.trim().split(","));
            }
            //Step3 A for lop to do analytics
            float[] dailyPrices = new float[5];
            int volume;
            String date;
            int lookBack = 7;
            float shortMemory[] = new float[lookBack];
            /*
            for(String[] i: msft){
              //with a for each loop/advanced for loop you can not 
              // do a lookback
            }
             */
            //with a traditional for loop you can perform a lookback task.
            for (int i = 0; i < msft.size(); i++) {
                String lineArray[] = msft.get(i);
                date = lineArray[0]; //date
                //prices
                for (int j = 0; j < dailyPrices.length; j++) {
                    dailyPrices[j] = Float.parseFloat(lineArray[j + 1]);
                }
                volume = Integer.parseInt(lineArray[6]);//volume
                if (i > (lookBack - 1)) {
                    for (int k = 0; k < shortMemory.length; k++) {
                        //Elaborated method

                        //String temp[] = msft.get(i-k-1);
                        //shortMemory[k] = Float.parseFloat(temp[4]);
                        //short hand method
                        //shortMemory[k] = Float.parseFloat(msft[i-k-1][4]);
                        shortMemory[k] = Float.parseFloat(msft.get(i - k - 1)[4]);
                    }
                   System.out.printf("Date:%s,Open:%f,High:%f,Low:%f,Close:%f,"
                            + "AdjClose:%f,Volume:%,d,Dollar Volume:%,f,Daily Average:%f,Daily STDEV:%f,MA7:%f\n",
                            msft.get(i).getDate(), msft.get(i).getOpen(), msft.get(i).getHigh(),
                            msft.get(i).getLow(), msft.get(i).getClose(), msft.get(i).getAdjClose(),
                            msft.get(i).getVolume(), msft.get(i).getDollarVolume(),
                            msft.get(i).getDailyAverage() ,
                            msft.get(i).getDailySTDEV(),
                            Stats.averageOfElements(shortMemory));
                }

            }
        } catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }
    }

}
