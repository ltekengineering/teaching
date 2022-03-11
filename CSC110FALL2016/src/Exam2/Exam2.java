/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exam2;

/**
 *
 * @author lkhan
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String variable1 = "Yo Prof! I am so000 excited to take EXAM #2";
        String variable2;
        String variable3;
        String variable4;
        
        if(variable1.contains("0")){
            variable2 = variable1.replace('0','o');
        }else {
            variable2 = variable1;
        }

        System.out.println(variable2);
        variable3  = variable2.substring(9, variable2.length());
        System.out.println(variable3);
        variable4 = variable2.replace("Yo", "").replace("Prof", "").replace("!", "");
        System.out.println(variable4);

        System.out.println(variable3.equals(variable4.trim())+" Comparing by equals method");
        System.out.println(variable3.compareTo(variable4.trim())+" Comparing by compareTo method");
        System.out.println(variable3 == variable4.trim()+" Comparing by == method");
        
        System.out.println("Hi Prof, "+variable4.trim());
        
    }
    public static void methodOverloading(int variable){
        Math.pow(variable, 2);
    }
    public static void methodOverloading(double variable){
        Math.pow(variable, 2);
    }
    public static void methodOverloading(long variable){
        Math.pow(variable, 2);
        
    }
    
}
