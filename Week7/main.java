package Week7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] Args)
    {
        //Calling student class
        Student s1 = new Student();
        s1.collegeID = "np014sp10";
        s1.name = "Prajwal";
        s1.age = 19;
        s1.study();
        
        System.out.println(s1.collegeID);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2 = new Student();
        s2.collegeID = "np015sp11";
        s2.name = "John";
        s2.age = 20;
        s2.laugh();
        
        System.out.println(s2.collegeID);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        //Calling Car class
        Car c1 = new Car();
        c1.brand = "Lamborghini";
        c1.model = "Aventador";
        c1.colour = "Black";
        c1.price = 10000000000d;
        c1.drive();
        c1.crash();
        
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.colour);
        System.out.println(c1.price);
    }
}