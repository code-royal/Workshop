package Week11.workshop;


/**
 * Write a description of class crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class crop implements transportable
{
    private String cropName;
    private String season;
    private int landArea;
    
    public crop(String cropName, String season, int landArea)
    {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }
    
    public void setLandArea(int landArea)
    {
        this.landArea = landArea;
    }
    
    public int getLandArea()
    {
        return this.landArea;
    }
    
    abstract int calculateYield();
    abstract int calculateWaterRequirement();
    
    void displayCropInfo()
    {
        System.out.println("Crop Name: " + this.cropName);
        System.out.println("Season: " + this.season);
        System.out.println("Land Area: " + this.landArea);
    }
}