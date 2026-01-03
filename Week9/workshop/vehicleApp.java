package Week9.workshop;


/**
 * Write a description of class vehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicleApp
{
    public static void main(String[] Args)
    {
        car c1 = new car(1, "Toyota", 3600000.00, 4, "Petrol");
        c1.displayVehicleInfo();
        double tax = c1.calculateTax();
        double FinalPrice = c1.calculateFinalPrice();
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + FinalPrice);
        
        bike b1 = new bike(2, "BMW", 1700000.37, 400.29);
        b1.displayVehicleInfo();
        double finalPrice = b1.CalculateFinalPrice();
        System.out.println("Final Price: " + finalPrice);
    }
}