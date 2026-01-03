package Week9.workshop;


/**
 * Write a description of class schoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class schoolApp
{
    public static void main(String[] Args)
    {
        Teacher t1 = new Teacher(1, "Prajwal", 10000, "Maths", 1200);
        t1.collegeName = "Nobel Academy";
        t1.displayInfo();
        double annualSalary = t1.calculateAnnualSalary();
        System.out.println("Annual Salary: " + annualSalary);
        
        Staff s1 = new Staff(101, "Krishna", 0, 4, 125);
        s1.collegeName = "Islington";
        s1.displayInfo();
        double Salary = s1.calculateSalary();
        System.out.println("Total Salary: " + Salary);
    }
}