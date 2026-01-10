package Week10.workshop;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] Args)
    {
        doctor d1 = new doctor(1,"Prajwal","ENT",1000);
        System.out.println(d1);
        double salary = d1.calculateSalary();
        System.out.println("Salary: " + salary);
        
        nurse n1 = new nurse(2,"Aabash","Day",2000);
        System.out.println(n1);
        double Salary = n1.calculateSalary();
        System.out.println("Salary: " + Salary);
    }
}