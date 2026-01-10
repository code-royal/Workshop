package Week10.workshop;


/**
 * Write a description of class scienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scienceStudent extends Student
{
    public scienceStudent(int rollNo, String name, float marks)
    {
        super(rollNo, name, marks);
    }
    
    @Override 
    public String calculateResult()
    {
        if(getMarks() >= 45)
        {
            return "Passed!";
        }
        else
        return "Failed!";
    }
    
    public String calculateResult(int graceMarks)
    {
        if((getMarks() + graceMarks) >= 45)
        {
            return "Passed!";
        }
        else
        return "Failed!";
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}