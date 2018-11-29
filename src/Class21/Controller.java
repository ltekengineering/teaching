/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class21;

/**
 *
 * @author lakhan
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMW bmw = new BMW("7Series");
        System.out.println(bmw.getModelType());
        bmw.laneKeepingMechanism();
        bmw.collisionPrevention();
        bmw.autoParking();
        
        Toyota toyota = new Toyota("Camry");
        System.out.println(toyota.getModelType());
        toyota.laneKeepingMechanism();
        toyota.collisionPrevention();
        toyota.autoParking();
        
        MercedezBenz mbs = new MercedezBenz("SClass");
        System.out.println(mbs.getModelType());
        mbs.laneKeepingMechanism();
        mbs.collisionPrevention();
        mbs.autoParking();
    }
}
