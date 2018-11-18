/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author lakhan
 */
public class Class18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shape circle = new Circle("Circle");
//        circle.getShapeType();
//        circle.calcArea();
//        circle.calcPerimeter();
//        circle.calcDiagonal();
//        
//        System.out.println("*************************");
//        
//        Shape triangle = new Triangle("Triangle");
//        triangle.getShapeType();
//        triangle.calcPerimeter();
//        triangle.calcArea();        
//        triangle.calcDiagonal();
//        
//        System.out.println("*************************");
//        
//        Shape rectangle = new Rectangle("Rectangle"); //polymorphism        
//        rectangle.getShapeType();
//        rectangle.calcArea();
//        rectangle.calcPerimeter();
//        rectangle.calcDiagonal();
//        
//        System.out.println("*************************");
//        
//        Shape square = new Square("Square");
//        square.getShapeType();
//        square.calcArea();
//        square.calcPerimeter();
//        square.calcDiagonal();
//        
//        System.out.println("*************************");
//        
//        Shape pentagon = new Pentagon("Pentagon");
//        pentagon.getShapeType();
//        pentagon.calcPerimeter();
//        pentagon.calcArea();        
//        pentagon.calcDiagonal();
//        
//        System.out.println("*************************");
//        
        Shape hexagon = new Hexagon("Hexagon");
        hexagon.getShapeType();
        hexagon.calcPerimeter();
        hexagon.calcArea();        
        hexagon.calcDiagonal();
        
        Hexagon hexagon2 = new Hexagon("Hexagon");
        
        if(hexagon2 instanceof Hexagon){
            System.out.println("Yes, hexagon is an instance of Hexagon");
        }else {
            System.out.println("No, hexagon is not an instance of Hexagon");
        }
        if(hexagon2 instanceof Shape){
            System.out.println("Yes, it also an instance of Shape");
        }else{
            System.out.println("No, it is not an instance of Shape");
        }
        
        
        
    }
}
