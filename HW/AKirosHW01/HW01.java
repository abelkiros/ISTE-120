/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120-01
 * HW:      #1
 */
import CanvasDocumentation.*;
import Lab02Downloads.*;
 import java.awt.*;
 
 //start of the main class
 public class HW01 {
   
   //start of main method
   public static void main(String[] args) {
      
      //constructor 
      HW01 tree = new HW01();
      
   }// end of main method
 
   //start of object method
   public HW01(){
    
      Canvas canvas = new Canvas("Tree", 400, 400);
      
      //object of the shapes 
      Rectangle box1 = new Rectangle(175, 250, 50, 50, Color.BLACK,true); 
      System.out.println("Box1:" + box1);
      canvas.draw(box1);
      
      Rectangle box2 = new Rectangle(187, 225, 25, 25, Color.MAGENTA,true);
      System.out.println("Box2:" + box2);
      canvas.draw(box2);
      
      Triangle triangle1 = new Triangle(150, 150, 100, 75, Color.GREEN,true);
      System.out.println("Triangle1:" + triangle1);
      canvas.draw(triangle1); 
      
      Triangle triangle2 = new Triangle(160, 85, 80, 65, Color.GREEN,true);
      System.out.println("Triangle2:" + triangle2);
      canvas.draw(triangle2); 
      
      Triangle triangle3 = new Triangle(170, 50, 60, 35, Color.GREEN,true);
      System.out.println("Triangle3:" + triangle3);
      canvas.draw(triangle3); 
      
      Circle circle = new Circle(185, 20, 15, Color.RED, true); 
      System.out.println("Circle:" + circle);
      canvas.draw(circle); 
      
      
   }//start of object method
   
}// end of main class