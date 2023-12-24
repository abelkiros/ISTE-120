import java.util.*;
import java.lang.*;
import java.io.IOException;

public class TestMagicSquare
{
 
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 

    Square sqr = new Square(); // Creating object of Square class.
    String key;
    do{

      System.out.print("Enter an integer(x to exit): ");

      if(input.hasNextInt()){

        sqr.add(input.nextInt());

      }

      else{

        if(input.next().equals("x")){

          break;

        }

        else{

          System.out.println("*** Invalid data entry ***");

        }

      } 

    }while(key.equals(""));

    if(sqr.isSquare()){

      System.out.println("\n Step 1. Numbers make square *** ");

      if(sqr.isUnique()){

        System.out.println("\n Step 2. Numbers are unique *** ");  

        if(sqr.isMagic()){

        System.out.println("\n Step 3. Yes. it is a MAGIC SQUARE! *** ");

      }

      else{

        System.out.println("\n Step 3. But it is NOT a magic square *** ");

      }

      }

      else{

        System.out.println("\n Step 2. Numbers are not unique: Program Stopped ");

      }

    }

    else{

      System.out.println("\n Step 1. Numbers does not make square: Program Stopped ");

    }
  }//end of main 


}//end of class
