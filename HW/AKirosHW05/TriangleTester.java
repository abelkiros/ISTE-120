/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #5
 * Description: A class to test the Triangle class
*/
class TriangeTester{
   
   public static void main(String[] args){
      
      //hard coded variabies 
      double x1 = 0.0;
      double y1 = 0.0;
      double x2 = 4.0;
      double y2 = 0.0; // y1 must always equal y2
      double x3 = 3.0;
      double y3 = 3.0;
      
      //triangle object 
      Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
      
      //objects stored in variables 
      double perimeter = triangle.getPerimeter();
      double height = triangle.getHeight();
      double sideA = triangle.getlengthA();
      double sideB = triangle.getlengthB();
      double sideC = triangle.getlengthC();
      double area = triangle.getArea();
      double angleA = triangle.getAngleA();
      double angleB = triangle.getAngleB();
      double angleC = triangle.getAngleC();
      
      //print statements
      System.out.println("Triangle with coordinates: A (0.0,0.0), B(4.0,0.0), C\n(3.0,3.0)"); 
      System.out.printf("Area:      %2.2f\n", area);
      System.out.printf("Perimeter: %2.2f\n", perimeter);
      System.out.printf("Length side a: %2.2f\n", sideA);
      System.out.printf("Length side b: %2.2f\n", sideB);
      System.out.printf("Length side c: %2.2f\n", sideC);
      System.out.printf("Height:        %2.2f\n", height);
      System.out.printf("Angle A: %2.2f\n", angleA);
      System.out.printf("Angle B: %2.2f\n", angleB);
      System.out.printf("Angle C: %2.2f\n", angleC);
   }
}

