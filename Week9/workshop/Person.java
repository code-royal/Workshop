package Week9.workshop;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int ID;
    protected String Name;
    protected double basicSalary;
    static String collegeName;
    
    public Person(int ID, String Name, double basicSalary)
    {
        this.ID = ID;
        this.Name = Name;
        this.basicSalary = basicSalary;
    }
  
    double calculateAnnualSalary()
    {
        double annual = basicSalary * 12;
        return annual;
    }
    
    void displayInfo()
    {
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name);
        System.out.println("College Name: " + collegeName);
    }
}