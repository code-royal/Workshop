package Week10.workshop;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderID;
    private String customerName;
    private double amount;
    
    public Order(int orderID, String customerName, double amount)
    {
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }
    
    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }
    
    public int getOrderID()
    {
        return this.orderID;
    }
    
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    
    public String getCustomerName()
    {
        return this.customerName;
    }
    
    public void setAmount(double Amount)
    {
        this.amount = amount;
    }
    
    public double getAmount()
    {
        return this.amount;
    }
    
    public double calculateFinalAmount()
    {
        return getAmount();
    }
    
    @Override
    public String toString()
    {
        return "Order ID: " + getOrderID() + "\n" + "Customer Name: " + getCustomerName() +"\n" + "Amount: " + getAmount();
    }
}