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
            long myFirstGuess  = Math.round(Math.random()*1000000000);
            
            for (int i = 0; i < 100000; i++) {
                System.out.println("I am in for loop i and my number is " + i);
            }
        }
    });
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        t1.start();
//        t2.start();
        
        System.out.printf("%,d",Math.round(Math.random()*1000000000));
        
    }
}
