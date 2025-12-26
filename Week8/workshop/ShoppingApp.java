package Week8.workshop;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] Args)
    {
        ShoppingCart s1 = new ShoppingCart("Iphone", 120000.00, 1);
        s1.displayCart();
        double total = s1.calculateTotal();
        double Dtotal = s1.calculateDiscountedTotal(10);
        System.out.println("Total Price: " + total);
        System.out.println("Total Price after discount: " + Dtotal);
    }
}