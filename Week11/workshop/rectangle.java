package Week11.workshop;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle extends Shape
{
    private int length;
    private int breadth;
    
    public rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    int calculateArea()
    {
        int Area = length * breadth;
        return Area;
    }
    
    @Override
    int calculatePerimeter()
    {
        int Perimeter = 2 * (length + breadth);
        return Perimeter;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Drawing rectangle!!");
    }
}