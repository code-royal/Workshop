package Week11.workshop;


/**
 * Write a description of class wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wheat extends crop
{
    private static final int WATERREQUIREMENT = 1000;
    private static final int YIELDINKG = 100;
    public wheat(String cropName, String season, int landArea)
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
        int distanceInKM = 40;
        int perKMRate = 600;
        int Cost = distanceInKM * perKMRate;
        return Cost;
    }
    
    @Override
    public String getTransportMethod()
    {
        return "Tractor";
    }
}