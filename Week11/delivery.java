package Week11;


/**
 * Write a description of class delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class delivery
{
    private int orderID;
    private double distanceInKM;
    private String pickUpLocation;
    private String dropOffLocation;
    
    public delivery(int orderID, double distanceInKM, String pickUpLocation, String dropOffLocation)
    {
        this.orderID = orderID;
        this.distanceInKM = distanceInKM;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
    }
    
    public int getOrderID()
    {
        return this.orderID;
    }
    
    public double getDistanceInKM()
    {
        return this.distanceInKM;
    }
    
    public String getPickUpLocation()
    {
        return this.pickUpLocation;
    }
    
    public String getDropOffLocation()
    {
        return this.dropOffLocation;
    }
    
    // charge + time
    //abstract methods
    public abstract double calculateCharge();
    public abstract double estimateTime();
}