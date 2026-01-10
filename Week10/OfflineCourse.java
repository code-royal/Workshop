package Week10;


/**
 * Write a description of class OfflineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OfflineCourse extends Course
{
    private double labFee;
    
    public OfflineCourse(int courseID, String courseName, double baseFee, double labFee)
    {
        super(courseID, courseName, baseFee);
        this.labFee = labFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee() + labFee;
    }
    
    public double calculateFee(double discountAmount)
    {
        return calculateFee() - discountAmount;
    }
    
    public void displayOfflineCourse()
    {
        super.displayCourse();
        System.out.println("Fee: " + calculateFee());
    }
}