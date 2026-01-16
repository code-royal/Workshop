package Week11;


/**
 * Write a description of class bikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bikeDelivery extends delivery
{
    private static final double PER_KM_CHARGE = 40;
    private static final double MIN_PER_KM = 3;
    
    public bikeDelivery(int orderID, double distanceInKM, String pickUpLocation, String dropOffLocation)
    {
        super(orderID, distanceInKM, pickUpLocation, dropOffLocation);
    }
    
    @Override
    public double calculateCharge()
    {
        return super.getDistanceInKM() * PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistanceInKM() * MIN_PER_KM;
    }
    
}