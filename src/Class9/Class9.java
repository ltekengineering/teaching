/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class9;
import java.util.ArrayList;
/**
 *
 * @author lkhan
 */
public class Class9 {
    
    public static void main(String[] args){
        int []a = new int[5];
        ArrayList<Integer> var = new ArrayList<Integer>();
        a[0] = 10;
        a[1] = 15;
        a[2] = 16;
        
        var.add(10);
        var.add(15);
        var.add(20);
        var.set(1, 13);
        
        
        
        
        System.out.println("The length of a: "+a.length);
        System.out.println("THe length of var: "+var.size());
        
        for(int i = 0;i<var.size();i++){
            System.out.println("Value at "+i+" "+var.get(i));
        }
        for(int b : var){
            System.out.println("Value is "+b);
        }
    }
    
}
