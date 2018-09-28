/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;
import java.util.Arrays;
/**
 *
 * @author lkhan
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //7.1
        //a
        int[] employeeNumbers = new int[100];
        //b
        double payRates[] = new double[25];
        //c
        float miles[] = new float[14];
        //d
        char letters[] = new char[1000];
        
        //7.2
        //int readings[] = new int[-1]; // can not be a negetive value
        //double[] measurements = new double[4.5];//has to be a whole number
        //7.3
        double[] var1 = new double[4]; //0,1,2,3
        //7.4
        // The subscripts are 0 to declarator-1
        //7.5
        //when the subscript is out of the range of the array's valid subscripts.
        //7.6
        //You get an out of bounds error.
        //7.7
        //1 to 5
        //7.8
        double[] var2 = {1.7,6.4,8.9,3.1,9.2};
        
        //Question1
        int [] question1 = {3,4,6,7,2,5,8,4};
        //1
        System.out.println("There are "+question1.length+" elements");
        //2
        System.out.println(Arrays.toString(question1));
        question1[0] = question1[1]+question1[2]+question1[7];
        System.out.println(Arrays.toString(question1));
        
        //3
        question1[6] = question1[2]-(question1[1]*question1[2]);
        System.out.println(Arrays.toString(question1));
        
        //4
        question1[5] = (int)( Math.sqrt(question1[1]) + Math.pow(question1[4], 2) );
        System.out.println(Arrays.toString(question1));
        //5
        question1[2] = (int)(Math.sqrt(question1[4] + question1[1] * question1[2] + Math.pow(3*question1[5]+question1[3], 3)));
        System.out.println(Arrays.toString(question1));
    
        //question #2
        int question2[][] = {{3,4,6},{7,2,5},{8,4,5},{3,2,5}};        
        //1
        System.out.println("There are "+question2.length+" elements");
        
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //2
        question2[2][0] = question2[2][2]+question2[1][1]+question2[0][0];
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //3
        question2[3][1] = question2[0][1] - (question2[3][1]*question2[0][2]);
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //4
        question2[1][2] = (int)(Math.sqrt(question2[0][1])+ Math.pow(question2[1][2], 2));
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //5
        question2[0][1] = (int)(Math.sqrt(question2[0][0] + question2[1][1]*question2[1][0] + Math.pow(3*question2[2][2]+question2[3][2], 3)));
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        
        //Split text over pipes.
        String info = "Lawrence|Khan|100 Church Street";
        String infoArray[] = info.split("\\|");
        System.out.println(Arrays.toString(infoArray));
    }
    
    
}
