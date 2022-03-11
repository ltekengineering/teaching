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
public class Class24 {
    public static void main(String[] args){
        Fruits FruitObject1 = new Fruits();
        
        //This is when you variables are public
//        System.out.println("Initial variable when instantiated: "+FruitObject1.fruit1);
//        FruitObject1.fruit1 = "Bananas";
//        System.out.println("Variable after change: "+FruitObject1.fruit1);

//Use getters and setters when your variables are private
        System.out.println("Initial variable when instantiated: "+FruitObject1.getFruit1());
        FruitObject1.setFruit1("Bananas");
        System.out.println("Variable after change: "+FruitObject1.getFruit1());  
        
        FruitObject1.doFruitMath(30, 20);
        
        Vegetables conorsVegetables = new Vegetables("Onions", "Carrots", "Potatoes");
        System.out.println(conorsVegetables.getvege1());
    }
}
