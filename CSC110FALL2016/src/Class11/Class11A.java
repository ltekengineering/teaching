/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class11;

import java.util.Date;

/**
 *
 * @author lkhan
 */
public class Class11A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(new Date(System.currentTimeMillis()).toString());
        System.out.println(System.currentTimeMillis());
        int value1 = 4;
        System.out.printf("This is really an integer but printed in a double %tB %te %tY %tl:%tM:%tS:%tp \n",
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis());
        
    }
             
    
}
