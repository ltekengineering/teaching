/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class23;

/**
 *
 * @author lakhan
 */
public class WhileThread2 implements Runnable{
    @Override
    public void run(){
        long timer = System.currentTimeMillis();
        long myFirstGuess  = Math.round(Math.random()*500000000);
        long mySecondGuess = 0;
        int counter=0;
        long upper=0;
        long lower=0;

        do{
            if(upper ==0){
                mySecondGuess = Math.round(Math.random()*500000000);
                if(mySecondGuess > myFirstGuess){
                    upper = mySecondGuess;
                }
            }
            if(lower==0){
                mySecondGuess = Math.round(Math.random()*500000000);
                if(mySecondGuess < myFirstGuess){
                    lower = mySecondGuess;
                }
            }
            if(lower!=0 && upper !=0){
                System.out.println("Upper: "+upper+"Lower: "+lower);
                mySecondGuess = (upper+lower)/2;
                if(mySecondGuess>myFirstGuess){
                    upper = mySecondGuess;
                }
                if(mySecondGuess<myFirstGuess){
                    lower = mySecondGuess;
                }
            }
            counter++;
//                System.out.println("Thread 2. My first guess "+myFirstGuess+". My "+counter+"th guess "+mySecondGuess);
        }while(mySecondGuess!=myFirstGuess);

        System.out.println("It took Thread 2 "+(System.currentTimeMillis()-timer)/1000+" seconds and "+counter+" tries to find "+myFirstGuess);            
    }
}
