/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class14;

/**
 *
 * @author lkhan
 */
public class Question15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int shares = 600;
    double price = 21.77;
    double commissionRate = .02;
    double commission = shares*price*commissionRate;
    
   
        System.out.println("Cost basis = " + shares*price);
        System.out.println("Comission cost = " + commission);
        System.out.println("Cost basis post commision = " + ((shares*price) + commission));
        System.out.println("Portfolio value = " + ((shares*price) - commission) );
        System.out.println("Your break even price of stock " + ((shares*price) + 2 * commission)/shares);
        
    }
    
}
