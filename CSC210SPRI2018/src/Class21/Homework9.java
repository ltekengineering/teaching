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
public class Homework9 {

    /**
     * @param args the command line arguments
     */
    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//          question7();
//          question8();
//          question9();
question10();
    }

    public static void question1() {
        System.out.println("Please enter a value");
        int product = 10 * kb.nextInt();
        while (product < 100) {
            System.out.println("Please enter a value");
            product = 10 * kb.nextInt();
        }
    }

    public static void question2() {
        int variable1 = 0;
        int variable2 = 0;
        String yesNo = "";
        do {
            System.out.println("Please enter firsrt value");
            variable1 = kb.nextInt();
            System.out.println("Please enter second value");
            variable2 = kb.nextInt();
            System.out.printf("Your first input: %d and your second input: %d. The sum: %d\n", variable1, variable2, (variable1 + variable2));
            System.out.println("Would you like to continue? Press y/Y to continue or N/n to terminate");
            kb.nextLine();//read off the next line.
            yesNo = kb.nextLine();
        } while (!yesNo.equalsIgnoreCase("n"));

    }

    public static void question3() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i * 10);
        }
    }

    public static void question4() {
        int runninTotal = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a value for number " + i);
//            runninTotal = runninTotal+kb.nextInt();
            runninTotal += kb.nextInt();
        }
        System.out.println("Your running total: " + runninTotal);
    }

    public static void question5() {
        double runningTotal = 0;
        for (int i = 1; i <= 30; i++) {
            runningTotal += ((double) i) / (30 - i + 1);
            System.out.println(i + "/" + (30 - i + 1) + "value: " + runningTotal);
        }
    }

    public static void question6() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 15; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    public static void question7(){
        int x;
        do {
            System.out.println("Please enter value");
            x = kb.nextInt();
        } while (x>0);
        
    }
    public static void question8(){
        String input="";
        char sure='N';
        while(sure!='Y'){
            System.out.println("Are you sure, you want to quit?");
            input = kb.next();
            sure = input.charAt(0);
        }
        
    }
    public static void question9(){
        for(int i=0;i<50;i++){
            System.out.println("count is "+i);
        }
    }
    public static void question10(){
        int i=50;
        while(i>0){
            System.out.println(i+" seconds to go.");
            i--;
        }
    }
}
