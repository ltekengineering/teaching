/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class17;

import java.util.Scanner;

/**
 *
 * @author lkhan
 */
public class Class17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        String userInput = "y";
        String userSecondInput = "";
        
        //preferred
        do{
            System.out.println("Press 1 for Summation. Press 2 for Multiplication");
            System.out.println("Press n/N to terminate");
            userInput = kb.nextLine();
        }while(!userInput.equalsIgnoreCase("n"));
        
//        while(userInput.equalsIgnoreCase("y")){
//            System.out.println("Press 1 for Summation. Press 2 for Multiplication");
//            System.out.println("Press n/N to terminate");
//            userSecondInput = kb.nextLine();
//            if(userSecondInput.equalsIgnoreCase("n")){
//                userInput = "n";
//            }

        //for loop to a while loop
        for(int i=0;i<=10;i++){
            System.out.println("I am number "+i);
        }
        //the for loop above can be converted to while loop
        int counter=0;
        while(counter<=10){
            System.out.println("I am number "+ counter +"with counter: ");
            counter++;
        }
    
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the "+i+"th within I");
            for (int j = 0; j < 10; j++) {
                System.out.println("This is the "+j+"th within j");
            }
        }
    }
    
}
