package Week9.workshop;
import java.util.*;


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
        Scanner sc = new Scanner(System.in);
        
        SavingAccount S1 = new SavingAccount(1, "Prajwal", 1000, 8);
        S1.displayInfo();
        System.out.println("Enter how much money do you want to deposit: ");
        double deposit = sc.nextDouble();
        S1.deposit(deposit);
        double newBalance = S1.getBalance();
        System.out.println("Current Balance: " + newBalance);
        
        CurrentAccount C1 = new CurrentAccount(202, "Pranaya", 2000, 1000);
        C1.displayInfo();
        System.out.println("Enter how much money do you want to withdraw: ");
        double withdraw = sc.nextDouble();
        C1.withdraw(withdraw);
        double BalanceAfterWithdraw = C1.getBalanceAW();
        System.out.println("Current Balance: " + BalanceAfterWithdraw);
    }
}