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

        //building code must be 3 char long
        while(buildingCode.length() != 3)
        {
            System.out.println("The code must be 3 characters long. ");
            System.out.print("Building code: ");
            buildingCode = input.nextLine();
        }

        //prompt Room number
        System.out.print("Room number: ");
        roomNumber = input.nextInt();

        //roomNumber must be between 1 and 99999
        while(roomNumber <= 1 || roomNumber >= 99999)
        {
            System.out.println("The room number must be in the range of 1...99999.");
            System.out.print("Room number: ");
            roomNumber = input.nextInt();
        }

        // prompt for the Jack number
        System.out.print("Jack number: ");
        jackNumber = input.nextInt();

        //must be between 1 and 24
        while(jackNumber <= 1 || jackNumber >= 24)
        {
            System.out.println("The jack number must be in the range of 1...24.");
            System.out.print("Jack number: ");
            jackNumber = input.nextInt();
        }
        input.nextLine(); 

        System.out.print("Jack type: ");
        jackType = input.nextLine();

        Boolean quit = true;
        while(!quit){
            if ("ENET".equals(jackType)) {
                System.out.print("Jack type: ");
                jackType = input.nextLine();
                quit = false;
                break;
            }
            else if("PH".equalsIgnoreCase(jackType))
            {
                System.out.print("Jack type: ");
                jackType = input.nextLine();
                quit = false;
                break;
            }
            else if("VID".equalsIgnoreCase(jackType)){
                System.out.print("Jack type: ");
                jackType = input.nextLine();
                quit = false;
                break;
            }

            else{
                System.out.println("The type must be \"ENET\", \"PH\", or \"VID\".");
                quit = true;
    
            }
        } 

        // Calls class object to set jack1
        Jack jack1 = new Jack(buildingCode,roomNumber,jackNumber);

        // set the mutator and set jackType in the parameter
        jack1.setJackType( jackType );

        //Print statement
        System.out.printf("%s:%s:%s is of type %s.\n", jack1.getBuildingCode(),jack1.getRoomNumber(), jack1.getJackNumber(),
                jack1.getJackType());

    }//end of main

}// end of class