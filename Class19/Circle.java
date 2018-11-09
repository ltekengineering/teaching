/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class19;
import java.util.Scanner;
/**
 *
 * @author lakhan
 */
public class Circle implements Area, Perimeter,Diagonal{
    
    private short radius;
    private String shapeType;
    Scanner kb;
    public Circle(String shapeType){
      this.shapeType = shapeType;
      this.kb = new Scanner(System.in);
    }
    
    @Override
    public void calcArea(){
        if(this.radius > 0){
            System.out.println("The area of the "+ this.shapeType+": " + (Math.PI*this.radius*this.radius));
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + (Math.PI*this.radius*this.radius));
        }
    }
    @Override
    public void calcPerimeter(){
        if(this.radius > 0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + (2*Math.PI*this.radius));
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + (2*Math.PI*this.radius));
        }
    }
    @Override
    public void calcDiagonal(){
        if(this.radius > 0){
            System.out.println("The diagonal of the "+ this.shapeType+": " + 2*this.radius);
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            
            
            System.out.println("The diameter of the "+ this.shapeType+": " + 2*this.radius);
        }
    }
    
    protected void getShapeType(){
        System.out.println("The type of shape: "+this.shapeType);
    }
    
    
}
