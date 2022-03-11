/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class24;

/**
 *
 * @author lkhan
 */
public class Fruits {
    private String fruit1  = "Apples";
    private String fruit2 = "Oranges";
    private String fruit3 = "Peaches";
    
    public void setFruit1(String name){
        this.fruit1 = name;
    }
    public String getFruit1(){
        return this.fruit1;
    }
    
    public void doFruitMath(int apples , int oranges){
        System.out.println("I have "+ apples +" apples and "+oranges+
                " oranges, therefore, I have "+(apples+oranges)+ " fruits in my basket");
        
    }
    
}
