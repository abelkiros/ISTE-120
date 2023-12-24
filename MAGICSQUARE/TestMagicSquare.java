import java.*;

public class TestMagicSquare{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
    
        do{
    
          System.out.print("Enter an integer(x to exit):");
    
          if(input.hasNextInt()){
    
           square.add(input.nextInt());
    
          }
    
          else{
    
            if(input.next().equals("x")){
    
              break;
    
            }
    
            else{
    
              System.out.println("Invalid data entry");
    
            }
    
          } 
    
        }while(true);
    
         
        Square square = new Square();
    
        if(square.isSquare()){
    
          System.out.println("Numbers make square. ");
    
          if(square.isUnique()){
    
            System.out.println("Numbers are unique. ");  
    
            if(square.isMagic()){
    
            System.out.println("Yes. It is a magic square! ");
    
          }
    
          else{
    
            System.out.println("No. It is not a magic square ");
    
          }
    
          }
    
          else{
    
            System.out.println("Numbers are not unique. Stopped. ");
    
          }
    
           
    
           
    
        }
    
        else{
    
          System.out.println("Numbers does not make square. Stopped. ");
    
        } 
    
      }
    
  }

}//end of class
