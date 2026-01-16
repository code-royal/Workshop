package Week11.workshop;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape implements drawable
{
    abstract int calculateArea();
    
    abstract int calculatePerimeter();
    
    void displayShapeInfo()
    {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}