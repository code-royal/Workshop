package Week8;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    //instance method - based on obj
    //void return type, no parameters
    public void displayInfo()
    {
        System.out.println("Welcome to Calculator app.");
    }
    
    //void return type, with parameters
    public void add(int a, int b) //formal parameters - value not passed
    {
        System.out.println("Sum: " + (a+b));
    }
    
    //return type + no parameters
    public int getFixedNumber()
    {
        return 10;
    }
    
    //return type + parameters
    public int multiply(int c, int d)
    {
        int mul = c*d;
        return mul;
    }
    
    //static method
    
    public static int square(int i)
    {
        int area = i * i;
        return area;
    }
}