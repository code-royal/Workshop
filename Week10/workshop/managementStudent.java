    package Week10.workshop;


/**
 * Write a description of class managementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class managementStudent extends Student
{
    public managementStudent(int rollNo, String name, float marks)
    {
        super(rollNo, name, marks);
    }
    
    @Override
    public String calculateResult()
    {
        return super.calculateResult();
    }
    
    @Override
    public String calculateResult(int graceMarks)
    {
        return super.calculateResult(graceMarks);
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}