package Week8;


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
        Calculator calc = new Calculator();
        
        //invoking a method, method invocation
        calc.displayInfo();
        calc.add(2,5);
        calc.add(60,40);
        
        calc.getFixedNumber();
        int fixNum = calc.getFixedNumber();
        System.out.println("Fixed Number: " + fixNum);
        
        int multi = calc.multiply(2,10);
        int multi1 = calc.multiply(6,43);
        System.out.println("Products: " + multi + "\t" + multi1);
        
        int sq = Calculator.square(20);
        System.out.println("Square of a number: " + sq);
    }
}