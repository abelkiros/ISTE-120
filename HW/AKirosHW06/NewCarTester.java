/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #6
 * Description: A class to test the NewCar class
*/
import java.util.*;


public class NewCarTester
{
   public static void main(String[] args)
   {    
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the car's Year, Make and Model: ");
       String year = in.next();
       String make = in.next();
       String model = in.next();
       
       System.out.print("Enter the Sticker Price: ");
       double stickerPrice = in.nextDouble();
       
       System.out.print("Enter the Discount: ");
       double discount = in.nextDouble();
       
       System.out.print("Enter the Sales Tax Rate: ");
       double salesTax = in.nextDouble();
       
       System.out.print("Enter the Number of Months at Zero Percent Interest: ");
       int numberOfmonths = in.nextInt();
       
       //object
       NewCar newcar = new NewCar(year, make, model);
       System.out.print(newcar.toString());

       
       System.out.printf("\nFinal Price: %2.2f\n", newcar.calcFinalPrice(stickerPrice, salesTax, discount));
       System.out.printf("Monthly Payment at zero percent: %2.2f\n", newcar.calcZeroPctMonPayt(numberOfmonths));
   }
}