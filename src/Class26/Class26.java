/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class26;

/**
 *
 * @author lakhan
 */
public class Class26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //This program relies on a file from data.gov
       //Download the file from here https://catalog.data.gov/dataset/baby-names-from-social-security-card-applications-national-level-data
       
        Thread t1 = new Thread(new RemoteZip("C:\\Users\\lakhan\\Downloads\\names.zip", false));
        t1.start();
        
    }
}
