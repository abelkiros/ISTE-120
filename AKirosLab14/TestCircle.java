/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
public class TestCircle {
   public static void main(String [] args) {
     // read a radius of the circle from command line
      double radius = Double.parseDouble(args[0]);
   
     // Instantiate a Circle object
      Circle aCircle = new Circle(radius);
   
      // Print current status of the circle
      System.out.println(aCircle);
   }
}