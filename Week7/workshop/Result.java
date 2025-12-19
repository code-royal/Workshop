package Week7.workshop;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int subject1;
    int subject2;
    int subject3;
    
    public Result(int subject1, int subject2, int subject3)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    
    void totalMarks()
    {
        System.out.println("Total marks: ");
        System.out.println(subject1+subject2+subject3);
    }
    
    void totalPercentage()
    {
        System.out.println("Total Percentage: ");
        System.out.println((subject1+subject2+subject3)/3);
    }
}