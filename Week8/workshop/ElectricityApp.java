package Week8.workshop;


/**
 * Write a description of class ElectricityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityApp
{
    public static void main(String[] Args)
    {
        ElectricityBill E1 = new ElectricityBill("Prajwal",150);
        E1.displayInfo();
        double bill = E1.calculateBill();
        System.out.println("Total Cost: " + bill);
    }
}