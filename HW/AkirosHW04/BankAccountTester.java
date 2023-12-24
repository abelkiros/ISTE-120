/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #4
 * Description: A class to test the BankAccount class
*/

public class BankAccountTester
{
   public static void main (String [] args)
   {
   BankAccount account = new BankAccount(1000);

   System.out.println("Set up new account with $1000, 5 free transactions, and $2 per transaction above 5");
   System.out.println("Starting Balance: " + account.getBalance());
   
   //Set Fee
   account.setTransFee(2.00);
   //Set num of Free Transaction
   account.setNumFreeTrans(5);
   
   //month1
   System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 - 4 transactions");
   account.deposit(1000);
   account.withdraw(500);
   account.withdraw(400);
   account.deposit(200);
   System.out.println("Balance: " + account.getBalance());
   System.out.println("Excepted: 1300.0"); 
   System.out.println("Apply Monthly charge");
   account.deductMonthlyCharge();
   System.out.println("Ending Balance Month 1: " + account.getBalance());
   System.out.println("Excepted: 1300.0\n"); 
   
   //month2
   System.out.println("Starting Balance: " + account.getBalance());
   System.out.println("Deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - 5 transactions");
   account.deposit(1000);
   account.withdraw(500);
   account.withdraw(400);
   account.deposit(200);
   account.deposit(500);
   System.out.println("Balance: " + account.getBalance());
   System.out.println("Excepted: 2100.0"); 
   System.out.println("Apply Monthly Charge");
   account.deductMonthlyCharge();
   System.out.println("Ending Balance Month 2: " + account.getBalance());
   System.out.println("Excepted: 2100.0\n");
   
   
   //month3
   System.out.println("Starting Balance: " + account.getBalance());
   System.out.println("Deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000 - 6 transactions" );
   account.deposit(1000);
   account.withdraw(500);
   account.withdraw(400);
   account.deposit(200);
   account.deposit(500);
   account.withdraw(1000);
   System.out.println("Balance: " + account.getBalance());
   System.out.println("Excepted: 1900.0");
   System.out.println("Apply Monthly charge");
   account.deductMonthlyCharge();
   System.out.println("Ending Balance Month 3: " + account.getBalance());
   System.out.println("Excepted: 1898.0\n"); 
   
   //month4
   System.out.println("Starting Balance: " + account.getBalance());
   System.out.println("Deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000, deposit 100 - 7 transactions");
   account.deposit(1000);
   account.withdraw(500);
   account.withdraw(400);
   account.deposit(200);
   account.deposit(500);
   account.withdraw(1000);
   account.deposit(100);
   System.out.println("Balance: " + account.getBalance());
   System.out.println("Excepted: 1798.0"); 
   System.out.println("Apply Monthly Charge");
   account.deductMonthlyCharge();
   System.out.println("Ending Balance Month 4: " + account.getBalance());
   System.out.println("Excepted: 1794.0");
   }//end of main 
}//end of class 
