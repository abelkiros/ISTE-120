
public class TestCalc1
{
   public static void main(String[] args) 
   {
 
      //create object test code 1
      Calculator myCalc = new Calculator();
      
      double myWeight = 220; 
      myCalc.add(myWeight);
      myCalc.multiply(0.453952);
      System.out.println("My weight is " + myWeight + "lb = " +
         myCalc + "kg"); 

     
     //object for test code 2
     Calculator myCalc1 = new Calculator();
     
     //test code pi = 22/7 
     double numerator = 22; 
     myCalc1.add(numerator);
     myCalc1.divide(7);//denominator is 7
     System.out.println("Pi = " + myCalc1);
     
     //object for test code 3
     Calculator myCalc2 = new Calculator();
     
     //test code using deniminator of 0 
     double numerator1 = 22; 
     myCalc2.add(numerator1);
     myCalc2.divide(0);//denominator is 0
 
     //object for test code 4
     Calculator myCalc3 = new Calculator();
     
     //test code population per area for NYS (pop density = # of people / area )
     double population = 19453561;
     myCalc3.add(population);
     myCalc3.divide(54555); //area of nys is 54555
     System.out.println("pop density = " + myCalc3);
   }
}