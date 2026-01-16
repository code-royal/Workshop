package Week11;


/**
 * Write a description of class carDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carDelivery extends delivery
{
    private static final double PER_KM_CHARGE = 60;
    private static final double MIN_PER_KM = 5;
    
    public carDelivery(int orderID, double distanceInKM, String pickUpLocation, String dropOffLocation)
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