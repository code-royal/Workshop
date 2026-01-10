package Week10;


/**
 * Write a description of class OnlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineCourse extends Course
{
    private double platformFee;
    
    public OnlineCourse(int courseID, String courseName, double baseFee, double platformFee)
    {
        super(courseID, courseName, baseFee);
        this.platformFee = platformFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee() + platformFee;
    }
    
    public double calculateFee(double discountAmount)
    {
        return calculateFee() - discountAmount;
    }
    
    public void displayOnlineCourse()
    {
        super.displayCourse();
        System.out.println("Fee: " + calculateFee());
    }
}