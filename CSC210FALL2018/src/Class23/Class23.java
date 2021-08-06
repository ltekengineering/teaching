/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class23;

/**
 *
 * @author lakhan
 */
public class Class23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1 = new Thread(new WhileThread1());
        Thread t2 = new Thread(new WhileThread2());
        
        t1.start();
        t2.start();
    }
}
