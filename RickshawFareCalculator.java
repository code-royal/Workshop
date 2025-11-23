import java.util.*;

/**
 * Program to calculate the rickshaw fare.
 *
 * @author Prajwal Rajbhandari
 * @version 1.0.0
 */
public class RickshawFareCalculator
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        
        //Inputs
        System.out.println("Total distance travelled: ");
        float distance = input.nextFloat();
        System.out.println("Total time consumed: ");
        float time = input.nextFloat(); 
        System.out.println("Are you local?(true/false)");
        boolean localCheck = input.nextBoolean();
        System.out.println("Night ride?(true/false)");
        boolean nightORday = input.nextBoolean();
        
        //Rate declaration
        float baseFare = 30;
        float distanceFare = distance * 6.5f;
        float timeFare = time * 2.2f;
        float totalFare = baseFare + distanceFare + timeFare;
        
        //Conditions
        totalFare = (localCheck) ? totalFare * 0.8f : totalFare;
        totalFare = (nightORday) ? totalFare * 1.25f : totalFare;
        
        //Final Fare Total
        System.out.println("Total Fare: NRs. "+ totalFare);
    }
}