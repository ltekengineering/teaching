/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;
import Class11.DailyPrices;
import java.util.ArrayList;
/**
 *
 * @author lkhan
 */
public class Class13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lizards = new ArrayList();
        ArrayList<DailyPrices> dailyPrices = new ArrayList<>();
        dailyPrices.add(new DailyPrices());
        dailyPrices.add(new DailyPrices());
        dailyPrices.add(new DailyPrices());
        
        dailyPrices.remove(1);
        lizards.add("Legs");
        lizards.add("eggs");
        lizards.add("eyes");
        
//        lizards.remove("eggs");
        ArrayList<String> bodyParts = new ArrayList<>();
        bodyParts.add("eggs");
        bodyParts.add("Legs");
        
        lizards.removeAll(bodyParts);
        bodyParts.clear();
        System.out.println("asdfaf");
        
        
        
        
        
        String[] words  = {"Hello","Goodbye!"};
        System.out.println(words[0].toUpperCase());
        //random generator between 1 and 100;
        System.out.println(Math.round(Math.random()*100));
        
        //Algo workbench #10
        int temp[][] = {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(temp.length);
        System.out.println(temp[3].length);
        
        for (int i = 0; i < temp.length; i++) {
            int sum=0;
            for (int j = 0; j < temp[i].length; j++) {
                sum+=temp[i][j];
                //for question 7 you would insert a randomly generated value here
            }
            System.out.println(i + " row sum = "+sum);
        }
    }
    
}
