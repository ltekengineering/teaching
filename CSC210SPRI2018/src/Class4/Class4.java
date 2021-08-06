/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4;

/**
 *
 * @author lkhan
 */
public class Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        char aLetter = 'A';
        boolean abooleanValue = true;
        byte abyteValue = 127;
        short aShortValue = 32000;
        int aIntValue = 2000;
        long aLongValue = 50L;
        float afloatValue = 2.718281828f;
        double aDoubleValue = 3.14;
        String aStringValue = "This is a sentence";
        
        System.out.println("This is also a sentence");
        System.out.println("The letter: " + aLetter);
        System.out.println("The Value of Pi: " + aDoubleValue);
        System.out.println("This a arbitary value: " + aIntValue);
        System.out.println("The largest value in a byte: " + abyteValue);
        System.out.println("A random short value " + aShortValue);
        System.out.println("The eulers constant is: " + afloatValue);        
        System.out.println("I am forever " + abooleanValue);
        System.out.println("This is " + aLongValue + " billion");
        System.out.println(aStringValue);
        
        int x = 10;
        /*
        System.out.println("I am going increase 10 by 1 " + x++);
        System.out.println("The value of x after the last sentence " + x);
        */
        System.out.println("I am going increase 10 by 1 " + ++x);
    }

}
