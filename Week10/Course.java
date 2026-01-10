package Week10;


/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private int courseID;
    private String courseName;
    private double baseFee;
    
    public Course(int courseID, String courseName, double baseFee)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.baseFee = baseFee;
    }
    
    // getters and setters
    public void setCourseID(int courseID)
    {
        this.courseID = courseID;
    }
    
    public int getCourseID()
    {
        return this.courseID;
    }
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public void setBaseFee(double baseFee)
    {
        this.baseFee = baseFee;
    }
    
    public double getBaseFee()
    {
        return this.baseFee;
    }
    
    public double calculateFee()
    {
        return this.baseFee;
    }
    
    public void displayCourse()
    {
        System.out.println("CourseID: " + this.courseID);
        System.out.println("Course Name: " + this.courseName);
    }
}