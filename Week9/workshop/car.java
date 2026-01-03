package Week9.workshop;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends vehicle
{
    int numberOfDoors;
    String fuelType;
    
    public car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType)
    {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    
    double basePriceAfterTax = basePrice + calculateTax();
    
    double calculateFinalPrice()
    {
        double FinalPrice = basePriceAfterTax + (basePriceAfterTax * 0.05);
        return FinalPrice;
    }
}