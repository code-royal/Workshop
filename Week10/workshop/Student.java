package Week10.workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private float marks;
    
    public Student(int rollNo, String name, float marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    
    public int getRollNo()
    {
        return this.rollNo;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setMarks(float marks)
    {
        this.marks = marks;
    }
    
    public float getMarks()
    {
        return this.marks;
    }
    
    @Override
    public String toString()
    {
        return "Roll No: " + getRollNo() + "Name: " + getName() + "Marks: " + getMarks();
    }
    
    public String calculateResult()
    {
        if(this.marks >= 40)
        {
            return "Passed!";
        }
        else 
        return "Failed";
    }
    
    public String calculateResult(int graceMarks)
    {
        if((this.marks + graceMarks) > 40)
        {
            return "Passed!";
        }
        else
        return "Failed!";
    }
}