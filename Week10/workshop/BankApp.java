package Week10.workshop;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] Args)
    {
        SavingsAccount S1 = new SavingsAccount(1,"Aabash",2000);
        System.out.println(S1);
        double amount = S1.calculateInterest(8);
        System.out.println("Interest: " + amount);
        
        CurrentAccount C1 = new CurrentAccount(8,"Bardan",5000);
        System.out.println(C1);
        double Amount = C1.calculateInterest(10);
        System.out.println("Interest: " + Amount);
    }
}