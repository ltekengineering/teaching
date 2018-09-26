/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class7;

import java.util.Arrays;
/**
 *
 * @author lkhan
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The sum of all the element in a: "+sumOfElements(a));
        System.out.println("The average of all the element in a: "+averageOfElements(a));
        System.out.println("The standard deviation of a: "+stdevOfElements(a,"p"));
        System.out.println("The variance of a: "+ Math.pow(stdevOfElements(a, "p"), 2));
        //Copying arrays using the Arrays class.
        int b[] = new int[a.length];
        b = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(b));
        
        int c[][] = new int[10][10];
        
        int f[][] = {{1,2,4},{4,3,2},{5,8,4}};
        
        System.out.println("The outer dimention of d: "+f.length);
        System.out.println(Arrays.toString(f[0]));
        System.out.println(Arrays.toString(f[1]));
        System.out.println(Arrays.toString(f[2]));
        
        f[0][2] = f[1][1]+5;
        System.out.println("**********");
        System.out.println(Arrays.toString(f[0]));
        System.out.println(Arrays.toString(f[1]));
        System.out.println(Arrays.toString(f[2]));
        
        //to access each of the elements in the two dimentional array.
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j]+",");
            }
            System.out.println("");
        }
        
        
        
    }
    
    public static double sumOfElements(int a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){            
            sum+=a[i];
//            sum = sum+a[i];//this is the same as the line above
        }
        return sum;
    }
    
    public static double averageOfElements(int a[]){
        /*
        double sum = 0;
        for(int i=0;i<a.length;i++){            
            sum+=(double)a[i];
        }*/
        //the above code is the same in sumOfElements method so we can call that here.
        double sum = sumOfElements(a);
        return sum/a.length;
    }
    
    public static double stdevOfElements(int a[],String type){
        double sum = 0;
        double average = averageOfElements(a);
        for (int i = 0; i < a.length; i++) {
            sum = sum + Math.pow((a[i]-average), 2);
        }
        double variance = 0;
        if(type.equalsIgnoreCase("s")){
            variance = sum/(a.length-1);
        }else{
            variance = sum/a.length;
        }
        
        return Math.sqrt(variance);
    }
}
