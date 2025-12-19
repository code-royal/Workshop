package Week7;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    String brand;
    String model;
    String colour;
    double price;
    
    void drive()
    {
        System.out.println(brand + model + "is being driven.");
    }
    
    void crash()
    {
        System.out.println(brand + model + "is crashed.");
    }
}