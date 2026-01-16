package Week11.workshop;


/**
 * Write a description of class maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maize extends crop
{
    private static final int WATERREQUIREMENT = 1000;
    private static final int YIELDINKG = 100;
    public maize(String cropName, String season, int landArea)
    {
        super(cropName, season, landArea);
    }
    
    @Override
    int calculateYield()
    {
        return YIELDINKG * getLandArea();
    }
    
    @Override
    int calculateWaterRequirement()
    {
        return WATERREQUIREMENT * getLandArea();
    }
    
    @Override
    public int calculateTransportCost()
    {
        int distanceInKM = 20;
        int perKMRate = 400;
        int Cost = distanceInKM * perKMRate;
        return Cost;
    }
    
    @Override
    public String getTransportMethod()
    {
        return "Truck";
    }
}