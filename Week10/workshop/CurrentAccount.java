package Week10.workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends CreateAccount
{
    public CurrentAccount(int accNo, String holderName, double balance)
    {
        super(accNo, holderName, balance);
    }
    
    @Override
    public double calculateInterest()
    { 
        return 7;
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