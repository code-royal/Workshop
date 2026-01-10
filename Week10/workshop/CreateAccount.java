package Week10.workshop;


/**
 * Write a description of class CreateAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateAccount
{
    private int accNo;
    private String holderName;
    private double balance;
    
    public CreateAccount(int accNo, String holderName, double balance)
    {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public void setAccNo(int accNo)
    {
        this.accNo = accNo;
    }
    
    public int getAccNo()
    {
        return this.accNo;
    }
    
    public void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }
    
    public String getHolderName()
    {
        return this.holderName;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public double calculateInterest()
    {
       return 8; 
    }
    
    public double calculateInterest(double rate)
    {        
        return (this.getBalance() * 3 * rate)/100;
    }
    
    @Override
    public String toString()
    {
        return "Account Number: " + getAccNo() + "Holder Name: " + getHolderName() + "Balance: " + getBalance();
    }
}