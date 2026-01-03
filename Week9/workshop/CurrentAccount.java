package Week9.workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;
    
    public CurrentAccount(int accNumber, String accHolderName, double balance, double overdraftLimit)
    {
        super(accNumber, accHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    void withdraw(double amount)
    {
        if(amount <= balance && amount <= overdraftLimit)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Unable to withdraw.");
        }
    }
    
    double getBalanceAW()
    {
        return(balance);
    }
}