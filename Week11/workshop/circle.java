package Week11.workshop;


/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle extends Shape
{
    private int radius;
    
    public circle(int radius)
    {
        this.radius = radius;
    }
    
    @Override
    int calculateArea()
    {
        int Area = (22/7) * radius * radius;
        return Area;
    }
    
    @Override
    int calculatePerimeter()
    {
        int Perimeter = 2 * (22/7) * radius;
        return Perimeter;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Drawing circle!!");
    }
}