package Week7.workshop;


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
        //book
        Book b1 = new Book();
        b1.title = "Courage to be happy";
        b1.author = "Prajwal Rajbhandari";
        b1.price = 999;
        
        Book b2 = new Book();
        b2.title = "Smokey";
        b2.author = "Aabash Basnet";
        b2.price = 299;
        
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println();
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        
        System.out.println();
        //area
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        r1.area();
        
        System.out.println();
        
        Rectangle r2 = new Rectangle();
        r2.length = 25;
        r2.breadth = 10;
        r2.area();
        
        //employee
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Prajwal Rajbhandari";
        e1.salary = 200000;
        e1.details();
        
        System.out.println();
        
        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Bardan Sapkota";
        e2.salary = 250000;
        e2.details();
        
        System.out.println();
        
        Employee e3 = new Employee();
        e3.id = 3;
        e3.name = "Ashimesh Magar";
        e3.salary = 200000;
        e3.details();
        
        System.out.println();
        
        if(e1.salary > e2.salary && e1.salary > e3.salary)
        {
            System.out.println("Details of employee having highest salary:");
            e1.details();
        }
        else if(e2.salary > e1.salary && e2.salary > e3.salary)
        {
            System.out.println("Details of employee having highest salary:");
            e2.details();
        }
        else if(e3.salary > e1.salary && e3.salary > e2.salary)
        {
            System.out.println("Details of employee having highest salary:");
            e3.details();
        }
        
        System.out.println();
        
        //laptop
        Laptop l1 = new Laptop("Lenovo",16,120000);
        Laptop l2 = new Laptop("ASUS",24,129000);
        Laptop l3 = new Laptop("Acer",8,89000);
        
        l1.RAMcheck();
        l2.RAMcheck();
        l3.RAMcheck();
        
        System.out.println();
        
        //mobile
        Mobile m1 = new Mobile("Redmi 12", 12000);
        Mobile m2 = new Mobile("Samsung A15", 31000);
        Mobile m3 = new Mobile("OnePlus Nord 3", 48000);
        
        m1.ifAffordable();
        m2.ifAffordable();
        m3.ifAffordable();
        
        System.out.println();
        
        //result
        Result R1 = new Result(98,89,91);
        Result R2 = new Result(88,92,95);
        
        R1.totalMarks();
        R1.totalPercentage();
        
        System.out.println();
        
        R2.totalMarks();
        R2.totalPercentage();
        
        System.out.println();
        
        System.out.println();
        
        
        //Bank Account Scenario
        
        BankAccount B1 = new BankAccount(1,"Prajwal Rajbhandari",3900000);
        BankAccount B2 = new BankAccount(2,"Fucchey",2032049);
        
        System.out.println("For account 1");
        B1.depositMoney();
        B1.withdrawMoney();
        B1.currentBalance();
        
        System.out.println("For account 2");
        B2.depositMoney();
        B2.withdrawMoney();
        B2.currentBalance();
        
    }
}