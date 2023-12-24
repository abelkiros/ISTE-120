
import java.util.*;

public class TestJack
{
    public static void main(String[] args)
    {
        //Scanner obj
        Scanner input = new Scanner(System.in);
        String buildingCode;
        int roomNumber;
        int jackNumber;
        String jackType;

        //prompt Building code
        System.out.print("Building code: ");
        buildingCode = input.nextLine();

        //prompt Room number
        System.out.print("Room number: ");
        roomNumber = input.nextInt();

        // prompt for the Jack number
        System.out.print("Jack number: ");
        jackNumber = input.nextInt();

        // Calls class object to set jack1
        Jack jack1 = new Jack(buildingCode, roomNumber, jackNumber);

        // prompts the Jack type
        System.out.print("Jack type: ");
        jackType = input.nextLine();

        // set the mutator and set jackType in the parameter
        jack1.setJackType(jackType);

        //Print statement
       System.out.printf("%s:%s:%s is of type %s.\n", jack1.getBuildingCode(),jack1.getRoomNumber(), jack1.getJackNumber(),
       jack1.getJackType());

    }//end of main

}// end of class
