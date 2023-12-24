

public class BankTransactions {
   public static void main(String[] args) {
      
      //Create an instance of BankAccount Savings 
      BankAccount savingsAccount1 = new BankAccount("Jims's Savings");
      
      //Create an instance of BankAccount Checking 
      BankAccount checkingAccount1 = new BankAccount("Jims's Checking", 0);
      BankAccount checkingAccount2 = new BankAccount("Jens's Checking", 500);
      
      
      
      //Print Jim's savings account
      savingsAccount1.deposit(3000);
      savingsAccount1.printBalance();
      savingsAccount1.printLineA(); 
      
      //print Jim's checking account
      checkingAccount1.printBalance();
      savingsAccount1.getBalance();
      checkingAccount1.transfer(savingsAccount1, 500);
      checkingAccount1.printBalance();
      checkingAccount1.withdraw(500);
      checkingAccount1.printBalance();
      savingsAccount1.printBalance();
      checkingAccount1.printLineA();
      
      //print Jen's checking account
      checkingAccount2.printBalance();
      savingsAccount1.getBalance();
      checkingAccount2.transfer(savingsAccount1, 500);
      checkingAccount2.printBalance();
      checkingAccount2.withdraw(50);
      checkingAccount2.printBalance();
      checkingAccount2.printLineA();
      
      //print jims savings after transactions
      savingsAccount1.printBalance();
   }
}
