/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Canine;

/**
 *
 * @author lkhan
 */
public class Dog extends Canine{
    public Dog(String size){
        this.size = size;
    }
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I bark all the time but howl sometimes");
    }
}
