/**
 *  A bank account has a balance that can be changed by 
 *  deposits and withdrawals.
 *
 * @author Abel Mengesha
 * @version 03/01/2020
 */
public class BankAccount   //Student Starter File
{
    private double balance;
    private double freeTransactions;
    private double transFee;
    private double transactionCount;

    /**
     * Constructs a bank account with a zero balance
     */
    public BankAccount()
    {
        balance = 0.0;
        transactionCount = 0.0;
    }

    /**
     * Constructs a bank account with a given balance
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
        transactionCount = 0;
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
        transactionCount++;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
        transactionCount++;
    }

    /**
     * Applies a fe for every deposit and withdraw
     * @param amount that is applied per transaction
     */

    public void setTransFee(double amount)
    {
        balance = amount+(balance-transFee);
    }

    public void setNumFreeTrans(int i)
    {
        double amount = freeTransactions;
    }

    public double deductMonthlyCharge()
    {
        return Math.max(transactionCount, freeTransactions);
    }

    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
}