package Week8.workshop;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[] Args)
    {
        BankAccount b1 = new BankAccount(1,1000, "Prajwal");
        b1.deposit();
        b1.withdraw();
        double balance = b1.getBalance();
        System.out.println(balance);
    }
}