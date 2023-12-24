/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #5
 * Description: A class calculates a triangle using three given coordinate points.
*/
import java.math.*;

class Triangle{
   //attributes
   private double x1;
   private double y1; 
   private double x2;
   private double y2; 
   private double x3;
   private double y3;
      
   //constructor initializes coordinate values 
   public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      this.x3 = x3;
      this.y3 = y3;
   }
   
   //lengthA method 
   public double getlengthA(){
      return Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
   }
   
   
   //lengthB method
   public double getlengthB(){
      return Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
   } 
   
   //lenghtC method
   public double getlengthC(){
      return x2-x1;
   } 
   
   //calcPerimeter
   public double getPerimeter(){
      return getlengthA() + getlengthB() + getlengthC();
   }
   
   //getHeight method
   public double getHeight(){
      return y3-y1;
   }
   
   //calcArea method (area = (height * length)/2 )
   public double getArea(){
      return (getHeight()*getlengthC())/2;
   }
   
   
   //angleA method
   public double getAngleA(){
      return Math.toDegrees(Math.asin(getHeight()/getlengthB()));
   }
    
   
   //angleB method
   public double getAngleB(){
      return Math.toDegrees(Math.asin(getHeight()/getlengthA()));
   } 
   
   //angleC method 
   public double getAngleC(){
     return 180-getAngleA()-getAngleB();
   }
    
}//end of main class