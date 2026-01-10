package Week10.workshop;


/**
 * Write a description of class carDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carDelivery extends deliveryPartner
{
    public carDelivery(int partnerID, String name, double basePay)
    {
        super(partnerID, name, basePay);
    }
    
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment() + 5000;
    }
    
    public double calculatePayment(int extraOrders)
    {
        return this.calculatePayment() + extraOrders * 80;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}