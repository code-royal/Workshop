package Week10.workshop;


/**
 * Write a description of class deliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryPartner
{
    private int partnerID;
    private String name;
    private double basePay;
    
    public deliveryPartner(int partnerID, String name, double basePay)
    {
        this.partnerID = partnerID;
        this.name = name;
        this.basePay = basePay;
    }
    
    public void setPartnerID(int partnerID)
    {
        this.partnerID = partnerID;
    }
    
    public int getPartnerID()
    {
        return this.partnerID;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setBasePay(double basePay)
    {
        this.basePay = basePay;
    }
    
    public double getBasePay()
    {
        return this.basePay;
    }
    
    public double calculatePayment()
    {
        return this.basePay;
    }
    
    @Override
    public String toString()
    {
        return "Partner ID: " + getPartnerID() + "Name: " + getName() + "Base Pay: " + getBasePay(); 
    }
}