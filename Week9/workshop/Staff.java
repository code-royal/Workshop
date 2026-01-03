package Week9.workshop;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    private int workingHours;
    private double ratePerHour;
    
    public Staff(int ID, String Name, double basicSalary, int workingHours, double ratePerHour)
    {
        super(ID, Name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    
    double calculateSalary()
    {
        double salary = workingHours * ratePerHour;
        return salary;
    }
}