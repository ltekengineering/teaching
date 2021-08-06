/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class22;

/**
 *
 * @author lkhan
 */
public class Class22 {
    public static void main(String[] args){
        Box a = new Box();
        a.setLength(5);
        a.setWidth(20);
        
        Box b = new Box(10,15);
        System.out.println("The area of box b" +b.area());
        System.out.println("The area of box a" +(a.getLength()*a.getWidth()));
        
        //a for loop 1-120
        //if a car does not stop then count how many it has traveled.
        //public Cars(String make, String model, int year, int mileage, String fuelType)
        
        Cars honda = new Cars("Honda", "Accord", 2015, 23785,"Gas");
        System.out.println("The make of the car: "+honda.getMake());
        System.out.println("The model of the car: "+honda.getModel());
        System.out.println("The year of the car: "+honda.getYear());
        System.out.println("The mileage of the car: "+honda.getMilage());
        honda.setMilage(24785);
        System.out.println("The type of fuel used in the car: "+honda.getFuelType());
        
        AnonStaticClass a1 = new AnonStaticClass();
        AnonStaticClass a2 = new AnonStaticClass();
        a1.seta(10);
        a2.seta(15);
        
        AStaticClass b1 = new AStaticClass(10,15);
        AStaticClass b2 = new AStaticClass();
        b2.setA(5);
        b2.setB(6);
        
        
        
        
    }
    
    
}
