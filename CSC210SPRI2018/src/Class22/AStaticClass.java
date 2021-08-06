/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class22;

/**
 *
 * @author lkhan
 */
public class AStaticClass {
    private static int a;
    private static int b;
    
    public AStaticClass(){
        
    }

    public AStaticClass(int a, int b){
        AStaticClass.a = a;
        AStaticClass.b = b;
    }
    
    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static void setA(int a) {
        AStaticClass.a = a;
    }

    public static void setB(int b) {
        AStaticClass.b = b;
    }
    
    
    }
