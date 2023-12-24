import java.awt.*;

public class Lab01Ex4Kiros {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex4 - Kiros", 500, 500);
      Rectangle rec1 = new Rectangle(10, 100, 360, 100, Color.BLUE,true);
      System.out.println("rec1:" + rec1);
      canvas.draw(rec1);
      
      Rectangle rec2 = new Rectangle(10, 200, 120, 10, Color.RED,true);
      System.out.println("rec2:" + rec2);
      canvas.draw(rec2);
      
      Rectangle rec3 = new Rectangle(10, 200, 220, 10, Color.RED,true);
      rec3.setXInt(rec3.getXInt() + 260);
      System.out.println("rec3:" + rec3);
      canvas.draw(rec3);
      
      Rectangle rec4 = new Rectangle(10, 110, 80, 90, Color.RED,true);
      rec4.setXInt(rec4.getXInt() + 370);
      System.out.println("rec4:" + rec4);
      canvas.draw(rec4);
      
      Rectangle rec5 = new Rectangle(10, 170, 80, 40, Color.RED,true);
      rec5.setXInt(rec5.getXInt() + 400);
      System.out.println("rec5:" + rec5);
      canvas.draw(rec5);
      
      
      Rectangle window = new Rectangle(20, 120, 60, 40, Color.BLUE,true);
      System.out.println("window:" + window);
      window.setXInt(window.getXInt() + 370);
      canvas.draw(window);
      
      Circle tire1 = new Circle(10, 210, 30, Color.BLACK, true);
      //myCircle.setXInt(myCircle.getXInt() + 150);
      System.out.println("Tire 1:" + tire1);
      canvas.draw(tire1);
      
      Circle tire2 = new Circle(10, 210, 30, Color.BLACK, true);
      tire2.setXInt(tire2.getXInt() + 62);
      System.out.println("Tire 2:" + tire2);
      canvas.draw(tire2); 
      
      Circle tire3 = new Circle(10, 210, 30, Color.BLACK, true);
      tire3.setXInt(tire3.getXInt() + 262);
      System.out.println("My Tire 3:" + tire3);
      canvas.draw(tire3); 
      
      Circle tire4 = new Circle(10, 210, 30, Color.BLACK, true);
      tire4.setXInt(tire4.getXInt() + 324);
      System.out.println("My Tire 4:" + tire4);
      canvas.draw(tire4); 
      
      Circle tire6 = new Circle(10, 210, 30, Color.BLACK, true);
      tire6.setXInt(tire6.getXInt() + 324);
      System.out.println("My Tire 6:" + tire6);
      canvas.draw(tire6);
      
      Circle tire5 = new Circle(10, 210, 30, Color.BLACK, true);
      tire4.setXInt(tire5.getXInt() + 420);
      System.out.println("My Tire 5:" + tire5);
      canvas.draw(tire5); 
      
      
   }
}