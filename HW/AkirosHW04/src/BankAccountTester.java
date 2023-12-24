public class BankAccountTester
{
    public static void main(String [] args)
    {

        //create transaction object
        BankAccount bankAccount = new BankAccount(1000);

        System.out.println("Set up new account with $1000, 5 free transactions, and $2 per transaction above 5");
        System.out.println("Starting Balance: " + bankAccount.getBalance());

        bankAccount.setTransFee(2.00); //Fee
        bankAccount.setNumFreeTrans(5); //Free Transaction

        System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 - 4 transactions");
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(400);
        bankAccount.deposit(200);

        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Excepted: 1300.0");
        System.out.println("Apply Monthly charge");
        System.out.println("Ending Balance Month 1: " + bankAccount.deductMonthlyCharge());
        System.out.println("Excepted: 1300.0\n");
        System.out.println("Starting Balance: " + bankAccount.getBalance());
        System.out.println("Deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - 5 transactions");
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(400);
        bankAccount.deposit(200);
        bankAccount.deposit(500);

        System.out.println("Balance: " + bankAccount.getBalance()); System.out.println("Excepted: 2100.0");
        System.out.println("Apply Monthly Charge");
        System.out.println("Ending Balance Month 2: " + bankAccount.deductMonthlyCharge());
    }

}
