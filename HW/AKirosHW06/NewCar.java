/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #6
 * Description: A class to calculate a car purchase. 
*/
import java.util.*;

public class NewCar
{
   //attributes 
   private String yearOfcar;
   private String makeOfcar; 
   private String modelOfcar;
   private String abbreviation;
   private double stickerPrice = 0;
   private double salesTax = 0;
   private double discount = 0;
   private int numberOfmonths = 0;
   private int interestRate = 0;
   private double finalPrice = 0;
   private double monthlyPayment = 0;
   
   
   //constructor 
   public NewCar(String yearOfcar, String makeOfcar, String modelOfcar)
   {
      this.yearOfcar = yearOfcar;
      this.makeOfcar = makeOfcar;
      this.modelOfcar = modelOfcar;
      abbreviation = yearOfcar.substring(2,4) + makeOfcar.substring(0,1) + modelOfcar.substring(0,1);
   }
   
   //calcFinalPrice method
   public double calcFinalPrice(double stickerPrice, double salesTax, double discount)
   {
      double newSalesTax = 1 + ((salesTax)/100);
  
      finalPrice = (stickerPrice - discount) * newSalesTax;
      return finalPrice;
   }
    
   //calcZeroPctMonPayt method 
   public double calcZeroPctMonPayt(int numberOfmonths)
   {
      monthlyPayment = finalPrice/numberOfmonths;
      return monthlyPayment;
   }
   
   //toString method 
   public String toString()
   {
      return "\nYou want to purchase a \"" + yearOfcar + " " + makeOfcar + " " + modelOfcar + 
             "\" Abbreviation: \"" + abbreviation + "\"" ;    
   }
   
}