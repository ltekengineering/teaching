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
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        outputValue("Homework review - Algorithmic workbench-7,9,10,11,12");
        
        
        Question7();
        
        System.out.println("Its nice out today".substring(3, 7));    
        String value4 = giveSubString("Its nice out today", 3, 7);
        System.out.println(value4);
        
        
        double tempValue = computePower(2);
        System.out.println(tempValue);
        
    }
    
    
    
    public static String giveSubString(String message, int beginning, int end){
        String tempValue = "";       
        tempValue = message.substring(beginning, end);
        return tempValue;
        
    }
    
    
    
    
    public static void outputValue(String message){
        System.out.println(message);
    }
    public static double computePower(int baseDigit){
        double temp = 0;
        temp = Math.pow(baseDigit, 10);
        return temp;
    }
    public static void Question7(){
        System.out.println("Answer to 7");
        int x = 1;
        do {
            System.out.print("Enter a number: ");
            x = keyboard.nextInt();
        }while (x > 0);
        Question9(); //it has the answer to Qusetion 9
    }
    public static void Question9(){
        System.out.println("Answer to 9");
        for(int count=0;count<50;count++){
            System.out.println("count is " + count);
        }
        Question10();
    }
    public static void Question10(){
        System.out.println("Answer to 10");
        int y = 50;
        while(y>0){
            System.out.println(y + " seconds to go.");
            y--;
        }
        Question11();
    }
    public static void Question11(){
        System.out.println("Answer to 11");
        System.out.println("Please enter a value between 1 and 4 inclusive");
        double question11INput = keyboard.nextDouble();
        while(question11INput<1 || question11INput>4){
            System.out.println("You entered a value outside the range, please try again");
            question11INput = keyboard.nextDouble();
        }
        Question12();
    }
    public static void Question12(){
        System.out.println("Answer to 12");
        String question12Input;
        do{
            System.out.println("Pleas enter yes to cotinue or no to end!");
            question12Input = keyboard.next();
        }while(question12Input.equalsIgnoreCase("yes"));
    }
}
