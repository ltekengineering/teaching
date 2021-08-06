/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class23;

/**
 *
 * @author lakhan
 */
public class WhileThread1 implements Runnable{
    @Override
    public void run(){
        long timer = System.currentTimeMillis();
            long myFirstGuess  = Math.round(Math.random()*500000000);
            long mySecondGuess = 0;
            int counter=0;
            do{
                mySecondGuess = Math.round(Math.random()*500000000);
                counter++;
//                System.out.println("Thread 1. My first guess "+myFirstGuess+". My "+counter+"th guess "+mySecondGuess);
            }while(mySecondGuess!=myFirstGuess);
            
            System.out.println("It took Thread 1 "+(System.currentTimeMillis()-timer)/1000+" seconds and "+counter+" tries");            
    }
}
