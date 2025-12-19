package Week7.workshop;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    int price;
    
    public Mobile(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }
    
    void ifAffordable()
    {
        if(price<20000)
        {
            System.out.println("Brand name: " + brand);
            System.out.println("Price: " + price);
        }
    }
}