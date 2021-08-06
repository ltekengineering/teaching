/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author lkhan
 */
public class Class19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        binarySearch();
//        needleInAHayStack();
//     readFileLikeTheBook();
//readFileLikeAPro();
    }
    public static void readFileLikeAPro(){
       try{
          FileReader fileReader = new FileReader("C:\\feed_archive\\TEMP_UNZIP\\liquidity_source.20180423_20180423190001.csv");
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line="";
           long myTimer = System.currentTimeMillis();
           int counter= 0;
           while((line = bufferedReader.readLine())!=null){
//               System.out.println(line+" ,Anything");
               
               counter++;
           }
           System.out.println("It took me "+(System.currentTimeMillis()-myTimer)/1000+" seconds");
           System.out.println("We read a file with "+counter+" rows");
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    public static void readFileLikeTheBook(){
        
        try{
           FileReader file = new FileReader("C:\\feed_archive\\TEMP_UNZIP\\liquidity_source.20180423_20180423190001.csv");
            Scanner kb = new Scanner(file);
            String line = "";
            long myTimer = System.currentTimeMillis();
            int counter=0;
            while(kb.hasNext()){
                line = kb.nextLine();
//                System.out.println(line);
                counter++;
            }
            System.out.println("It took me "+(System.currentTimeMillis()-myTimer)/1000+" seconds");
            System.out.println("We read a file with "+counter+" rows");
            kb.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
//            System.out.println(e.getLocalizedMessage());
        }
        
        
    }
    public static void binarySearch(){
        long mytimer = System.currentTimeMillis();
        long multiplier = 1000000000;
        long firstGuess = (long) Math.round(Math.random() * multiplier);
        System.out.println("My first guess is "+firstGuess);
        long currentGuess = 0;
        long l = 1;
        long u = 1000000000;
        int counter=0;
        do{
            counter++;
            currentGuess =(u+l)/2;
            System.out.println(counter+": My current guess is "+currentGuess);
            if (currentGuess>firstGuess) {
                u = currentGuess;
            }else if(currentGuess<firstGuess){
                l = currentGuess;
            }else{
                System.out.println("I found the answer. "+currentGuess);
            }
        }while(currentGuess!=firstGuess);
        System.out.println("It took "+(System.currentTimeMillis()-mytimer)+" milliseconds");
    }    
    public static void needleInAHayStack() {
        //needle in a hay stack example
        //brute force attempt.
        long mytimer = System.currentTimeMillis();
        long multiplier = 1000000000;
        long firstGuess = (long) Math.round(Math.random() * multiplier);

        long secondGuess = 0;
        long counter = 0;

        System.out.printf("Our first guess is %,d \n", firstGuess);
        do {
            secondGuess = (long) Math.round(Math.random() * multiplier);
//            System.out.println("My second guess is : "+secondGuess);
            counter++;
        } while (secondGuess != firstGuess);

        System.out.printf("It took us %,d guesses to come up with %,d \n", counter, firstGuess);
        System.out.println("It took java " + (System.currentTimeMillis() - mytimer) / 1000 + " seconds ");

    }
    
}
