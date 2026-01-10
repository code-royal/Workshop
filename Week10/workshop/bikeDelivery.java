package Week10.workshop;


/**
 * Write a description of class bikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bikeDelivery extends deliveryPartner
{
    public bikeDelivery(int partnerID, String name, double basePay)
    {
        super(partnerID, name, basePay);
    }
    
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment() + 2000;
    }
    
    public double calculatePayment(int extraOrders)
    {
        return this.calculatePayment() + extraOrders * 50;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}