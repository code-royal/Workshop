package Week10.workshop;


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
        bikeDelivery b1 = new bikeDelivery(1, "Bardan", 8000);
        System.out.println(b1);
        double b1_payment = b1.calculatePayment();
        System.out.println("Payment: " + b1_payment);
        
        bikeDelivery b2 = new bikeDelivery(2, "Aabash", 8000);
        System.out.println(b2);
        double b2_payment = b2.calculatePayment(4);
        System.out.println("Payment: " + b2_payment);
        
        carDelivery c1 = new carDelivery(7, "Ashimesh", 12000);
        System.out.println(c1);
        double c1_Payment = c1.calculatePayment();
        System.out.println("Payment: " + c1_Payment);
        
        carDelivery c2 = new carDelivery(4, "Prajwal", 12000);
        System.out.println(c2);
        double c2_Payment = c2.calculatePayment(5);
        System.out.println("Payment: " + c2_Payment);
    }
}