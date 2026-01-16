package Week11.workshop;


/**
 * Write a description of class Main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main2
{
    public static void main(String[] Args)
    {
        crop[] crop1 = new crop[3];
        
        crop1[0] = new rice("Rice", "Monsoon", 30);
        crop1[1] = new wheat("Wheat", "Winter", 20);
        crop1[2] = new maize("Maize", "Summer", 40);
        
        for(int i =0; i < crop1.length; i++)
        {
            crop1[i].displayCropInfo();
            System.out.println("Transport Cost: " + crop1[i].calculateTransportCost());
            System.out.println("Transport Method: " + crop1[i].getTransportMethod());
            System.out.println();
        }
    }
}