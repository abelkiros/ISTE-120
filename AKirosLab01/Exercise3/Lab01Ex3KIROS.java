import java.awt.*;

public class Lab01Ex3KIROS {
   public static void main(String[] args) {
   
      Canvas canvas = new Canvas("Lab01Ex3 - NAME", 500, 500);
      
      Circle myCircle = new Circle(20, 60, 30, Color.BLUE);
      //myCircle.setXInt(myCircle.getXInt() + 150);
      myCircle.setYInt(myCircle.getYInt() + 200);
      
      System.out.println("My Circle:" + myCircle);
      canvas.draw(myCircle); 
      
   }
}