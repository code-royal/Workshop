package Week8.workshop;


/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public static void main(String[] Args)
    {
        Employee e1 = new Employee(12000.00);
        double gross = e1.calculateGrossSalary();
        e1.displayInfo();
        System.out.println("Gross Salary: " + gross);
    }
}