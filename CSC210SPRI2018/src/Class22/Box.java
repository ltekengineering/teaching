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
public class Box {
    private int length;
    private int width;
    
    public Box(){
        
    }
    public Box(int length, int witdth){
        this.length = length;
        this.width = width;
        
    }
    //Mutators
public void setLength(int length){
    this.length = length;
    
}
public void setWidth(int width){
    this.width = length;
}
//Accessors
public int getLength(){
    return this.length;
    
}
public int getWidth(){
    return this.width;
    
}
public int area(){
    return this.length*this.width;
}
}
