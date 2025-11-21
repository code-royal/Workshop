
/**
 * TUTORIAL3
 *
 * @author Prajwal
 * @version 18 NOV
 */
public class TUTORIAL3
{
    int qty; //instance variable
    static int rrt; // static variable
    public static void main(String[]args)
    {
        int age = 18; //local variable
        System.out.println(age);
        System.out.println(TUTORIAL3.rrt);
        
        //Implicit Typecasting
        double dtr = age;
        System.out.println(dtr);
        
        //Explicit Typecasting
        double db = 10.09;
        int ftr = (int)db;
        System.out.println(ftr);
        
        //Exception in arithmetic
        byte b1 = 10;
        byte b2 = 11;
        byte sum = (byte)(b1+b2);
        System.out.println(sum);
        
        //short, char
        
        
        //min, max, size, bytes
        System.out.println(Byte.MAX_VALUE); //max value
        System.out.println(Byte.MIN_VALUE); //min value
        System.out.println(Byte.SIZE);  //size
        System.out.println(Byte.BYTES);  //bytes
        
        //Escape Sequence
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("She said \" Hi \" ");
        
        //Unicode Escape Sequence
        System.out.println("\u2764");
    }
}