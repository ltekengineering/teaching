/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class22;

/**
 *
 * @author lkhan
 */
public class Class22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Example2 peter = new Example2();
        Example2 enrique = new Example2();
        Example2 connor = new Example2();
        peter.setName("Peter Jude");
        enrique.setName("Enrique Marcano");
        connor.setName("Connor McCourtney");
        
        System.out.println(peter.getName());
        System.out.println(enrique.getName());
        System.out.println(connor.getName());
    }
    
}
