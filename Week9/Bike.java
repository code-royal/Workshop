package Week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private boolean hasGears;
    
    public Bike(String brandName, int maxSpeed, boolean hasGears)
    {
        super(brandName, maxSpeed);
        this.hasGears = hasGears;
    }
    
    public void displayBikeDetails()
    {
        System.out.println("Brand Name: " + super.brandName);
        System.out.println("Max. Speed: " + super.maxSpeed);
        System.out.println("Has Gears: " + this.hasGears);
    }
}