package Week8.workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //attributes
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    static String collegeName;
    
    //constructors
    public Student(String name, int id, String address, long phoneNumber)
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    //setters and getters method
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setAddress()
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setPhoneNumber()
    {
        this.phoneNumber = phoneNumber;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public void displayInfo()
    {
        System.out.println("Name of student: " + this.name);
        System.out.println("Student ID: " + this.id);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}