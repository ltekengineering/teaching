/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class21;

/**
 *
 * @author lakhan
 */
public abstract class Car {
    protected String model;
    public Car(String model){
        this.model = model;
    }    
    protected abstract void laneKeepingMechanism();
    protected abstract void collisionPrevention();
    protected abstract void autoParking();
    
    protected String getModelType(){
        return this.model;
    }
}
