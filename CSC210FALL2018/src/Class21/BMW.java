/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class21;

/**
 *
 * @author lakhan
 */
public class BMW extends Car{
    public BMW(String model){
        super(model);
    }
    @Override
    protected void laneKeepingMechanism(){
        if(this.model.equals("7Series")){
            System.out.println(this.model + " has lane keeping feature");
        }else{
            System.out.println(this.model + " does not have lane keeping feature");
        }
    }
    @Override
    protected void collisionPrevention(){
        if(this.model.equals("7Series")){
            System.out.println(this.model + " has collision prevention feature");
        }else{
            System.out.println(this.model + " does not have collision prevention feature");
        }
    }
    @Override
    protected void autoParking(){
        if(this.model.equals("7Series")){
            System.out.println(this.model + " has auto parking feature");
        }else{
            System.out.println(this.model + " does not have auto parking feature");
        }
    }
}
