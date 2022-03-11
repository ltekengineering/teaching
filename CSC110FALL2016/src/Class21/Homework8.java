/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class21;
import java.util.Scanner;
/**
 *
 * @author lkhan
 */
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Question1();
        Question2();
        Question5();
        Question10();
        Question12();
    }
    public static void Question1(){
        System.out.println("Please enter a positive integer");
        int temp = keyboard.nextInt();
        int sum=0;
        for (int i = 1; i <=temp; i++) {
            sum+=i;
        }
        System.out.println("You entered: "+ temp +"The of all the values from 1 to "+ temp + ": "+sum);
    }
    public static void Question2(){
        System.out.println("What is the car's speed?");
        int speed = keyboard.nextInt();
        System.out.println("How long did the car drive?");
        int timeTravelled = keyboard.nextInt();
        int distance=0;
        for (int i = 1; i <= timeTravelled; i++) {
            distance += speed;
            System.out.println("Hour: " + i+" - Distance Travelled: "+distance);
        }
    }
    public static void Question5(){
        System.out.println("Please enter a sentence");
        String temp = keyboard.nextLine();
        System.out.println("Please enter a chanracter");
        char charTemp = keyboard.next().charAt(0);
        int counter=0;
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i)== charTemp){
                counter++;
            }
        }
        System.out.println(charTemp+" appeared "+ counter+" times.");
    }
    public static void Question10(){
        int largest = 0 ;
        int smallest=0;
        int temp=0;
        int counter=0;
        do{
            counter++;
            System.out.println("Please enter an integer");
            temp = keyboard.nextInt();
            if (temp >= largest) {
                largest = temp;
            }
            if (temp<=smallest) {
                smallest = temp;
            }
            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);
          }while(temp!=-99 || (temp == -99 && counter < 3));
        }
    public static void Question12(){
        System.out.println("Please enter sales for store 1"); 
        int store1 = keyboard.nextInt();
        System.out.println("Please enter sales for store 2"); 
        int store2 = keyboard.nextInt();
        System.out.println("Please enter sales for store 3"); 
        int store3 = keyboard.nextInt();
        System.out.println("Please enter sales for store 4"); 
        int store4 = keyboard.nextInt();
        System.out.println("Please enter sales for store 5"); 
        int store5 = keyboard.nextInt();
        
        
        for (int j = 0; j < store1; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        for (int j = 0; j < store2; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        for (int j = 0; j < store3; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        for (int j = 0; j < store4; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        for (int j = 0; j < store5; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        
       
        
    }
    
}
