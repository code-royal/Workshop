import java.util.*;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}