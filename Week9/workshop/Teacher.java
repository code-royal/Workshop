package Week9.workshop;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private String subject;
    private double bonus;
    
    public Teacher(int ID, String Name, double basicSalary, String subject, double bonus)
    {
        super(ID, Name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }
    
    double calculateAnnualSalary()
    {
        return (super.calculateAnnualSalary() + bonus);
    }
}