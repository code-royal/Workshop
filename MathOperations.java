import java.util.*;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fisrt number: ");  //input of first number
        int firstNum = input.nextInt();
        System.out.println("Enter second number: ");  //input of second number
        int secondNum = input.nextInt();
        
        int Sum, Difference, Product, Quotient;  //variable declaration
        
        //Using Arithmetic Operators
        Sum = firstNum + secondNum;
        Difference = firstNum - secondNum;
        Product = firstNum * secondNum;
        Quotient = firstNum / secondNum;
        
        System.out.println("The sum is: " + Sum );
        System.out.println("The difference is: " + Difference );
        System.out.println("The product is: " + Product );
        System.out.println("The quotient is: " + Quotient );
        
        
        //Using Unary Operators
        int a = ++firstNum;  //pre increment
        int b = firstNum++;  //post increment
        int c = --secondNum;  //pre decrement
        int d = secondNum--;  //post decrement
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
        //Using Assignment Operators
        System.out.println(firstNum+=3);
        System.out.println(firstNum-=3);
        System.out.println(secondNum*=3);
        System.out.println(secondNum/=3);
        
        //Using Relational Operators
        System.out.println(firstNum > secondNum);
        System.out.println(firstNum < secondNum);
        System.out.println(firstNum <= secondNum);
        System.out.println(firstNum >= secondNum);
        
        //Using ternary operators
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        String canDrive = (age>18) ? "You are eligible to drive." : "You are not eligible to drive.";
        System.out.println(canDrive);
    }
}