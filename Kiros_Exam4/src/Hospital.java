/**
 *    Hospital class- The main program
 *
 *    ISTE-120 Practical 4
 *    @since 05-03-2020
 *    @author Abel Mengesha
 */
import java.io.*;
import java.util.*;

public class Hospital {
    public static void main(String[] args){
        final String FILENAME = "Patients.txt";
        FileWriter fw = null;
        BufferedReader input = null;
        PrintWriter outFile = null;
        int surgicalCount = 0;
        int maternityCount = 0;
        ArrayList<Patient> patients = new ArrayList<Patient>();

        patients.add(new Surgical(00345, "Harry T. Everyman", 2, "Bowl Resection"));
        patients.add(new Maternity(20389, "Martha G. Biggens", 1, "Thomas"));
        patients.add(new Surgical(03253, "Hannah V. Watkins",1, "Knee Replacement"));
        patients.add(new Maternity(98234, "Jane C. Morrison", 2, "Robert"));
        patients.add(new Surgical(11923, "James X. Doherty", 1, "Hip Replacement"));

        //exception handling for file names
        try{
            File fileOut = new File(FILENAME);
            if(fileOut.exists()){
                System.out.println("Adding to the current file "+ FILENAME);
                fw = new FileWriter(fileOut, true);
            }
            else {
                System.out.println("Creating a new file "+FILENAME);
                fw = new FileWriter(fileOut, false);
            }
            //open using two statements
            outFile = new PrintWriter(new BufferedWriter(fw));
        }
        catch(IOException ioe){
            System.out.println("Error in opening output file " + FILENAME);
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
        System.out.println("Patient report:");
        for(Patient p : patients){               // loop to print out all patients
            System.out.println(p);               // Print to screen
            if(p instanceof Surgical){           // required item
                surgicalCount++;
            }
            else if(p instanceof Maternity){
                maternityCount++;
            }
            outFile.println(p);               // Write to output file
        }

        //print summary
        System.out.printf("%nSurgical patients: %d%nMaternity patients: %d", surgicalCount, maternityCount);
        outFile.flush();
        outFile.close();

    }//end of main
}//end of class