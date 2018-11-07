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
        Shape rectangle = new Rectangle("Rectangle"); //polymorphism
        
        rectangle.getShapeType();
        rectangle.calcArea();
        rectangle.calcPerimeter();
        rectangle.calcDiagonal();
        
        Shape square = new Square("Square");
        square.getShapeType();
        square.calcArea();
        square.calcPerimeter();
        square.calcDiagonal();
        
        Shape circle = new Circle("Circle");
        circle.getShapeType();
        circle.calcArea();
        circle.calcPerimeter();
        circle.calcDiagonal();
        
    }
}
