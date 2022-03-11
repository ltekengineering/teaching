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
import java.util.Scanner;
public class Question13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan  = new Scanner(System.in);
        
        double bill = 0;
        double tax = 0;
        double tip = 0;
        System.out.println("What is your bill?");
        if(scan.hasNextDouble()){
            bill = scan.nextDouble();
        }else{
            System.out.println("Please enter a double value to compute your tax and tip amount");
        }
        tax = bill*.0675;
        tip = (bill+tax) * .2;
        double totalBill = bill + tax + tip;
        
        System.out.println("Your bill = " + bill);
        System.out.println("Your tax = " + tax);
        System.out.println("Your tip = " + tip);
        System.out.println("Your total bill = " + (bill+tax+tip));
    }
    
}
