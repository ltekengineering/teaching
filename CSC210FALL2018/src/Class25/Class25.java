/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class25;

/**
 *
 * @author lakhan
 */
public class Class25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread xml = new Thread(new RemoteXML("https://data.lacity.org/api/views/nxs9-385f/rows.xml?accessType=DOWNLOAD", true));
        xml.start();
    }
}
