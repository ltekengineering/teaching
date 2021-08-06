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
public class AnonStaticClass {
    private int a;
    private final int b;
    
    public AnonStaticClass(){
        this.b=5;
    }
    //mutators
    public void seta(int a){
        this.a=a;
        
    }
//    public void setb(int b){
//        this.b=b;
//    }
    //accessor
    public int geta(){
        return this.a;
    }
}
