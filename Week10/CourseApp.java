package Week10;


/**
 * Write a description of class CourseApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CourseApp
{
    public static void main(String[] Args)
    {
        OnlineCourse O1 = new OnlineCourse(1,"Computing", 1000, 300);
        O1.calculateFee();
        double total = O1.calculateFee(200);
        O1.displayOnlineCourse();
        System.out.println("Discounted Fee: " + total);
        
        OfflineCourse A1 = new OfflineCourse(2,"Networking", 1300, 700);
        A1.calculateFee();
        double fee = A1.calculateFee(250);
        A1.displayOfflineCourse();
        System.out.println("Discounted Fee: " + fee);
    }
}