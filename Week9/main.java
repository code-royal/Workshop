package Week9;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] Args)
    {
        Car c1 = new Car("Toyota", 210, 4);
        c1.displayCarDetails();
        
        Bike b1 = new Bike("Honda", 180, true);
        b1.displayBikeDetails();
    }
}