/**
 * Name:    Abel Kiros 
 * Course:  ISTE-120
 * HW:      #2-1
 * Description: A class to test the CashRegister class
*/
 
public class RunCashRegister {
   
   public static void main(String[] args) {
      
      //Create two customer objects
      CashRegister customer1 = new CashRegister();
      CashRegister customer2 = new CashRegister();
      
      //print customer1 transaction data 
      customer1.recordPurchase(49.95);
      customer1.recordPurchase(20.40);
      customer1.enterPayment(80);
      customer1.printReceipt();
      
      //print customer2 transaction data 
      customer2.recordPurchase(99.95);
      customer2.recordPurchase(35.15);
      customer2.recordPurchase(50.00);
      customer2.enterPayment(180);
      customer2.printReceipt();
      
      
   }
}
