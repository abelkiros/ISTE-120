import java.io.*;

/**
 * ISTE-120 Lab 13 Circle.java
 * 
 * @author T.J. Borrelli Updated by JKang & JLeone
 */
public class Circle { // Student Starter code
   private double radius; // circle radius

   /**
    * Constructor - Create a new circle
    * 
    * @param inRadius radius of the circle
    */

   public Circle(double inRadius) {
      // implement body here
      if (radius > 0.0) {
         FileReader fileReader = new FileReader(inFile);
         Scanner scanner = new Scanner(fileReader);

         while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
         }
         scanner.close();
      } else {
         System.out.println("Radius is not greater than 0.0");
      }
   }

   /**
    * Return the radius of the circle
    * 
    * @return radius of the circle
    */
   public double getRadius() {
      return radius;
   }

   /**
    * set the radius
    * 
    * @param newRadius new radius of the circle
    */
   public void setRadius(double newRadius) {
      // implement body here
      if (newRadius <= 0.0) {

      }
   }

   /**
    * Compute and return the area of the circle
    * 
    * @return the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * Stretches circle size by multiplying the radius by the factor provided.
    * 
    * @param factor stretch factor
    */
   public void stretchBy(double factor) {
      // implement body here
   }

   /**
    * Return a string representation of a circle.
    * 
    * @return a string representing this circle
    */
   public String toString() {
      // implement body here
   }
}