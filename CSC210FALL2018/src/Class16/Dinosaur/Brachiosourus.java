/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Dinosaur;

/**
 *
 * @author lkhan
 */
public class Brachiosourus extends Dinosaur{
    
    public Brachiosourus(String size){
        this.size = size;
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I am a herbivores");
    }
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I growl");
    }
}
