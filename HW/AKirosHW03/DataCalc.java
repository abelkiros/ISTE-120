import java.util.*;
/**
 * Name:    Abel Mengesha 
 * Course:  ISTE-120
 * HW:      #3
 * Description: A class that uses the GregorianCalendar class to generate dates.
*/
 
public class DataCalc
{// start of main class

   public static void main(String []args)
   {// start of main method 
   
      //get the current date
      GregorianCalendar today = new GregorianCalendar();
      
      //get methods to query the gregorian calendar obj
      int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
      int month = today.get(Calendar.MONTH) + 1;
      int year = today.get(Calendar.YEAR);
      int weekday = today.get(Calendar.DAY_OF_WEEK);
      
      
      //print the current date
      System.out.println("Today's date is " + month + "/" + dayOfMonth + "/" + year + " which is day " + weekday + " of the week.");
      
      //mutator method that changes the today obj plus 100 days
      today.add(Calendar.DAY_OF_MONTH, 100);
      
      //updated get methods after 100 days
      int dayOfMonth2 = today.get(Calendar.DAY_OF_MONTH);
      int month2 = today.get(Calendar.MONTH) + 1;
      int year2 = today.get(Calendar.YEAR);
      int weekday2 = today.get(Calendar.DAY_OF_WEEK);
      
      
      //print the current date after 100 days 
      System.out.println("In 100 days, it will be " + month2 + "/" + dayOfMonth2 + "/" + year2 + " which is day " + weekday2 + " of the week.");
      
      //date of my birthday
      GregorianCalendar abelBirthday = new GregorianCalendar(1994, Calendar.DECEMBER, 28);
      
      // get methods for my birthday
      int bdayOfMonth = abelBirthday.get(Calendar.DAY_OF_MONTH);
      int bmonth = abelBirthday.get(Calendar.MONTH) + 1;
      int byear = abelBirthday.get(Calendar.YEAR);
      int bweekday = abelBirthday.get(Calendar.DAY_OF_WEEK);
      
      //print my birtday
      System.out.println("My Birthday is " + bmonth + "/" + bdayOfMonth + "/" + byear + " which is day " + bweekday + " of the week.");
        
      //mutator method that changes the today obj plus 10,000 days
      abelBirthday.add(Calendar.DAY_OF_MONTH, 10000);
      
      //updated get methods after 10,000 days
      int bdayOfMonth2 = abelBirthday.get(Calendar.DAY_OF_MONTH);
      int bmonth2 = abelBirthday.get(Calendar.MONTH) + 1;
      int byear2 = abelBirthday.get(Calendar.YEAR);
      int bweekday2 = abelBirthday.get(Calendar.DAY_OF_WEEK);
      
      //print bday after 10,000 days
      System.out.println("The date 10,000 days after my birthday is " + bmonth2 + "/" + bdayOfMonth2 + "/" + byear2 + " which is day " + bweekday2 + " of the week.");
   
   }//end of main method 
   
}// end of main class