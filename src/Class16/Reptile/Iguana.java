/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Reptile;

/**
 *
 * @author lkhan
 */
public class Iguana extends Reptile{
    
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        if(this.getSize().equals("small")){
            System.out.println("I am a herbivores");
        }else{
            System.out.println("I am a carnivores");
            System.out.println("I peck on my preys cause they are really small");
        }
        
        
    }
}
