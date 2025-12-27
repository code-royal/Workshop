package Week8.workshop;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    public static void main(String[] Args)
    {
        patient P1 = new patient("Ram", 19, 3, 1200.09);
        double totalFee1 = P1.calculateTotalBill();
        P1.viewDetails();
        System.out.println("Total fee: " + totalFee1);
        System.out.println();
        patient P2 = new patient("Hari", 31, 10, 1199.01);
        double totalFee2 = P2.calculateTotalBill();
        P2.viewDetails();
        System.out.println("Total fee: " + totalFee2);
    }
}