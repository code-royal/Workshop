package Week10.workshop;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
    private String shift;
    private double extraAllowance;
    
    public nurse(int id, String name, String shift, double extraAllowance)
    {
        super(id, name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    
    public void setShift(String shift)
    {
        this.shift = shift;
    }
    
    public String getShift()
    {
        return this.shift;
    }
    
    public void setExtraAllowance(double extraAllowance)
    {
        this.extraAllowance = extraAllowance;
    }
    
    public double getExtraAllowance()
    {
        return this.extraAllowance;
    }
    
    @Override
    public String toString()
    {
        return "Nurse details--->" + super.toString() + "Shift: " + getShift() + "Extra Allowance: " + getExtraAllowance();
    }
    
    @Override
    public double calculateSalary()
    {
        double basePay = super.calculateSalary(); 
        return basePay + extraAllowance;
    }
    
}