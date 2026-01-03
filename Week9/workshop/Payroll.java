package Week9.workshop;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] Args)
    {
        PermanentEmployee P1 = new PermanentEmployee(1, "Prawjal", 40000, 1200, 1000);
        P1.displayEmployee();
        double bonus = P1.calculateBonus();
        double totalSalary = P1.calculateTotalSalary();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        
        ContractEmployee C1 = new ContractEmployee(2, "Ashimesh", 125, 10);
        C1.displayEmployee();
        double TotalSalary = C1.CalculateTotalSalary();
        System.out.println("Total Salary: " + TotalSalary);
    }
}