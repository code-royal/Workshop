package Week11.workshop;


/**
 * Write a description of class rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rice extends crop
{
    private static final int WATERREQUIREMENT = 3000;
    private static final int YIELDINKG = 100;
    public rice(String cropName, String season, int landArea)
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
        int distanceInKM = 30;
        int perKMRate = 500;
        int Cost = distanceInKM * perKMRate;
        return Cost;
    }
    
    @Override
    public String getTransportMethod()
    {
        return "Truck";
    }
}