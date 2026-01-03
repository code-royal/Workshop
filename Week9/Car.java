package Week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int doors;
    
    public Car(String brandName, int maxSpeed, int doors)
    {
        super(brandName, maxSpeed);
        this.doors = doors;
    }
    
    public void displayCarDetails()
    {
        System.out.println("Brand Name: " + super.brandName);
        System.out.println("Max. Speed: " + super.maxSpeed);
        System.out.println("No. of doors: " + this.doors);
    }
}