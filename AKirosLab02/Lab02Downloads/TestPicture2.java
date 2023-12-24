import java.util.*;

public class TestPicture2{

   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      
      Picture2 picture2 = new Picture2();
      picture2.draw();
      
    
      System.out.println("Press Enter to continue:");
      in.nextLine();
     
      picture2.setNewColors();
      
      System.out.println("Press Enter to continue:");
      in.nextLine();
     
      picture2.setOrigColors(); 
   }

}