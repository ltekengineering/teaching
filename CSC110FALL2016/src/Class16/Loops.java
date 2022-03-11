/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

import java.util.Scanner;

/**
 *
 * @author lkhan
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("For loop demonstration");
        for (int i = 1; i <=10; i++) {
            long myRandom = Math.round(Math.random()*10);
            String myStars = "";
            System.out.println(myRandom);
            for (int j = 1; j <=10; j++) {
                if(j <= myRandom) {
                    myStars += "*";
                    System.out.println(myStars);
                    
                }else {
                    break;
                }
            }
        }
        System.out.println("this is the for loop");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
        
        System.out.println("this is the while loop");
        
        int i=0;
        while(i<10){
            System.out.println(i+1);
            i++;
        }
        System.out.println("********************************************");
        //Differnce between postfix and prefix.
        i=0;
        int j;
        j = i++; //postfix same as saying j=i; i++;

        System.out.println("j:" + j);
        System.out.println("i:" + i);

        int a = 0;
        int b;
        b = ++a; //prefix

        System.out.println("b:" + b);
        System.out.println("a:" + a);
        
        System.out.println("********************************************");
        System.out.println("Algorithmic workbench");
        System.out.println("Question 1");
        int product = 0;
        Scanner keyboard = new Scanner(System.in);

        while (product < 100) {
            System.out.println("Please enter a integer value");
            product = keyboard.nextInt() * 10;
            System.out.println("The product is " + product);
        }
        System.out.println("Question 2");
        byte temp;
        do {
            System.out.println("Please enter your first value");
            int firstValue = keyboard.nextInt();
            System.out.println("Please enter your first value");
            int secondValue = keyboard.nextInt();
            System.out.println("Your sum: " + (firstValue + secondValue));

            System.out.println("Press 1 to continue or 0 to end");
            temp = keyboard.nextByte();
        } while (temp == 1);
        
        System.out.println("Question #5");
        int sumFraction=0;
        for (int k = 1; k <= 30; k++) {
            sumFraction += k/(30-k+1);
            System.out.print("("+k+"/"+(30-k+1)+")+");
        }
        System.out.println("=\n");
        System.out.println(sumFraction);

    }
    
}
