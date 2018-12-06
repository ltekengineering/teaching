/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class24;

/**
 *
 * @author lakhan
 */
public class Class24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Thread t1 = new Thread(new RemoteCSV("https://finances.worldbank.org/resource/cvjk-iddq.csv"));
        } catch (Exception e) {
        }
    }
}
