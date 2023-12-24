/**
* 
*@author Abel Mengesha
*
*/

public class Calculator
{
   //attribute 
   private double accumulator = 0;
   
   //constructor 
   public Calculator()
   {
      this.accumulator = accumulator; 
   }
   
   //accessor method
   public double getAccumulator()
   { 
      return accumulator;
   }
   
   //method to add a number to the accumulator
   public void add(double num)
   {
      accumulator = num + getAccumulator();
   }
   
   //method to subtract num from the accumulator
   public void subtract(double num)
   {
      accumulator = getAccumulator() - num;
   }
   
   //method to multiply the accumulator by a number 
   public void multiply(double num)
   {
      accumulator = getAccumulator() * num;
   }
   
   //method to divide a num into the accumulator
   public void divide(double num)
   {
      if (num == 0)
      {
         System.out.println("ATTEMPT TO DIVIDE BY ZERO - IGNORED");  
      } 
      else
      {  
          accumulator = getAccumulator() / num;  
      }
   }
   
   //method to clear the calculator
   public void clearCalculator()
   {
      accumulator = 0;
   }
   
   //a toString method that returns the accumulator as a string
   public String toString() {
	   return String.format("%6.2f", getAccumulator());
   } 
}   