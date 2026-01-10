package Week10.workshop;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends CreateAccount
{
    public SavingsAccount(int accNo, String holderName, double balance)
    {
        super(accNo, holderName, balance);
    }
    
    @Override
    public double calculateInterest()
    { 
        return 8;
    }
    
    @Override
    public double calculateInterest(double rate)
    {      
        return super.calculateInterest(rate);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}