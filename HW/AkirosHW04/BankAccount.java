/**
 *  A bank account has a balance that can be changed by 
 *  deposits and withdrawals.
 *
 * @author Abel Mengesha
 * @version 03/01/2020
 */
import java.math.*;

public class BankAccount   //Student Starter File
{
    private double balance;
	 private double transFee;
	 private double transactionCount;
	 private double freeTransactions;

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
        transFee = amount;
    }
   
    public void setNumFreeTrans(double amount)
    {
        freeTransactions = amount;
    }

   public void deductMonthlyCharge() 
   {
		transactionCount = Math.max(transactionCount, freeTransactions);
		double calcTransFee = (transactionCount - freeTransactions) * transFee;
		balance = balance - calcTransFee;
		transactionCount = 0;
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