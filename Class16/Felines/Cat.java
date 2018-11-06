/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Feline;

import Class16.Feline.Feline;

/**
 *
 * @author lkhan
 */
public class Cat extends Feline{
    

    public Cat(String size) {
        this.size = size;
    }
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I say meow");
    }    
    
}
