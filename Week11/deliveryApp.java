package Week11;


/**
 * Write a description of class deliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryApp
{
    public static void main(String[] Args)
    {
        //parent-child reference object --> dynamic method dispatch
        delivery c1 = new carDelivery(001, 12, "Boudha", "Kalanki");
        System.out.println(c1.calculateCharge());
    }
}