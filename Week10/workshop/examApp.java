    package Week10.workshop;


/**
 * Write a description of class examApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class examApp
{
    public static void main(String[] Args)
    {
        scienceStudent s1 = new scienceStudent(1,"Aabash",89);
        System.out.println(s1);
        System.out.println("Result: " + s1.calculateResult());
        
        scienceStudent s2 = new scienceStudent(2,"Ashimesh",44);
        System.out.println(s2);
        System.out.println("Result: " + s2.calculateResult());
        
        managementStudent m1 = new managementStudent(7,"Sanchit",78);
        System.out.println(m1);
        System.out.println("Result: " + m1.calculateResult());
        
        managementStudent m2 = new managementStudent(8,"Ashish",39);
        System.out.println(m2);
        System.out.println("Result: " + m2.calculateResult(3));
    }
}