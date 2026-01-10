package Week10.workshop;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order
{
    public NormalOrder(int OrderID, String customerName, double amount)
    {
        super(OrderID, customerName, amount);
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }
    
    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}