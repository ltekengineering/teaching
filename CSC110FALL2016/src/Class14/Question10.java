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

public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double test1 = 0;
        double test2 = 0;
        double test3 = 0;
        
        System.out.println("Please enter first exam result");
        if(scan.hasNextDouble()){
            test1 = scan.nextDouble();
        }
        System.out.println("Please enter second exam result");
        if(scan.hasNextDouble()){
            test2 = scan.nextDouble();
        }
        System.out.println("Please enter thir exam result");
        if(scan.hasNextDouble()){
            test3 = scan.nextDouble();
        }
        if(test1!=0 && test2!=0 && test3!=0){
            System.out.println("Your Test 1 result = " + test1);
            System.out.println("Your Test 1 result = " + test2);
            System.out.println("Your Test 1 result = " + test3);
            
            System.out.println("Your test average is " + ((test1+test1+test1)/3));
        }else{
            System.out.println("You did not enter your grade correctly!");
        }
        
        
        
    }
    
}
