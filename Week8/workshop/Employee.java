package Week8.workshop;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    
    public Employee(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    
    double calculateGrossSalary()
    {
        double grossSalary = (basicSalary*0.2) + basicSalary;
        return grossSalary;
    }
    
    public void displayInfo()
    {
        System.out.println("Basic Salary: " + this.basicSalary);
    }
}