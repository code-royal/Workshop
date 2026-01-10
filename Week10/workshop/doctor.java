package Week10.workshop;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
    private String specialization;
    private double consultationFee;
    public doctor(int id, String name, String specialization, double consultationFee)
    {
        super(id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
    
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    public void setConsultationFee(double consultationFeEe)
    {
        this.consultationFee = consultationFee;
    }
    
    public double getConsultationFee()
    {
        return this.consultationFee;
    }
    
    @Override
    public double calculateSalary()
    {
        double basePay = super.calculateSalary();
        return basePay + this.consultationFee * 30;
    }
    
    public double calculateSalary(double emergencyCases)
    {
        double basePay = super.calculateSalary();
        return this.calculateSalary() + emergencyCases * 1000;
    }
    
    @Override
    public String toString()
    {
        return "Doctor details--->" + super.toString() + "Specialization: " + getSpecialization() + "Consulation Fee: " + getConsultationFee();
    }
}