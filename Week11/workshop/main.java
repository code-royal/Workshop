package Week11.workshop;


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
        Shape[] shape1 = new Shape[2];
        
        shape1[0] = new rectangle(10,2);
        shape1[1] = new circle(4);
        
        for(int i = 0; i < shape1.length; i++)
        {
            shape1[i].displayShapeInfo();
            shape1[i].draw();
        }
    }
}