/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class22;

/**
 *
 * @author lakhan
 */

public class Class22 {
    
       /**
     * @param args the command line arguments
     */
    public static Thread t1 = new Thread(new Runnable(){
            
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
    });
    
    public static Thread t2 = new Thread(new Runnable(){
            
        @Override
        public void run(){
            long timer = System.currentTimeMillis();
            long myFirstGuess  = Math.round(Math.random()*500000000);
            long mySecondGuess = 0;
            int counter=0;
            do{
                mySecondGuess = Math.round(Math.random()*500000000);
                counter++;
//                System.out.println("Thread 2. My first guess "+myFirstGuess+". My "+counter+"th guess "+mySecondGuess);
            }while(mySecondGuess!=myFirstGuess);
            
            System.out.println("It took Thread 2 "+(System.currentTimeMillis()-timer)/1000+" seconds and "+counter+" tries");            
        }
    });
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        t1.start();
        t2.start();
                        
//        System.out.printf("%,d",Math.round(Math.random()*1000000000));
        
    }
}
