package Week8.workshop;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[] Args)
    {
        Student s1 = new Student("Prajwal", 101, "Kathmandu", 9763225252l);
        s1.collegeName = "Islington";
        s1.displayInfo();
    }
}