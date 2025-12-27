package Week8.workshop;


/**
 * Write a description of class patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class patient
{
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    
    public patient(String patientName, int age, int daysAdmitted, double dailyCharge)
    {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    
    public void setDaysAdmitted(int daysAdmitted)
    {
        this.daysAdmitted = daysAdmitted;
    }
    
    public int getDaysAdmitted()
    {
        return this.daysAdmitted;
    }
    
    double calculateTotalBill()
    {
        if(daysAdmitted <= 7)
        {
            double total = daysAdmitted * dailyCharge;
            return total;
        }
        else
        {
            double total = (daysAdmitted * dailyCharge) - (0.1 * daysAdmitted * dailyCharge);
            return total;
        }
    }
    
    void viewDetails()
    {
        System.out.println("Name of Patient: " + this.patientName);
        System.out.println("Age of Patient: " + this.age);
        System.out.println("Total days admitted: " + this.daysAdmitted);
        System.out.println("Daily Charge: " + this.dailyCharge);
    }
}