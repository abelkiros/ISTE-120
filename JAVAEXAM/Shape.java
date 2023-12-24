public class Shape {
   public void what() { System.out.print("Shape ");}

   public static void main(String[] args){

      Shape[] shapes = {new Shape(), new Rectangle(), new Square(),
                        new Circle()};
      for (Shape s : shapes)
      {
         s.what();
      }

   }
   
}

