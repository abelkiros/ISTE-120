/**
 * Simplest Program Ever
 * @author Pete Lutz
 * @version 1.0
 */

//Start of main class
public class Lab01Ex2{
  
   //Start of main method 
   public static void main(String[] args) {
      
      //objects 
      Account account1 = new Account();
      Account account2 = new Account();
      Account account3 = new Account();
      
      account1.initialize("Jane");
      account1.deposit(100);
      account1.withdraw(40);
      
      System.out.print("Account1:");
      account1.print();
      
      account2.initialize("Fred");
      account2.deposit(200);
      account2.withdraw(125);
      
      System.out.print("Account2:");
      account2.print();
      
      account3.initialize("George");
      account3.deposit(50);
      System.out.print("Account3:");
      account3.print();
      
      account2.deposit(60);
      System.out.print("Account2:");
      account2.print();
      
      
      account1.withdraw(20);
      System.out.print("Account1:");
      account1.print();
   
   }// end of main method
   
}// end of main class