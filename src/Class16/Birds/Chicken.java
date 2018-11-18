/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Birds;

/**
 *
 * @author lkhan
 */
public class Chicken extends Birds{
    
    public Chicken(){
        
    }
    public Chicken(int eyes, int nose, int mouth, int legs, int hands, int ears, int tail, String size) {
        this.eyes = eyes;
        this.nose = nose;
        this.mouth = mouth;
        this.legs = legs;
        this.hands = hands;
        this.ears = ears;
        this.tail = tail;
        this.size = size;
    }
    
    
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I make a pok pok pok sound");
    }
}
