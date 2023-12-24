import java.util.*;
import java.io.*;

public class ContactList {
   private String filename;

   public ContactList(String inFileName) {
      filename = inFileName;
   }

   public void new_record() {
      Scanner sc = new Scanner(System.in);
      System.out.print("last Name: ");
      String lastName = sc.next();
      while (lastName.length() <= 0) {
         System.out.println("last Name can't be empty");
         System.out.println("Enter last name again: ");
         lastName = sc.next();
      }
      System.out.print("first Name: ");
      String firstName = sc.next();
      System.out.print("phone: ");
      String phNum = sc.next();
      String output = lastName + "," + firstName + "," + phNum;
      File file = null;
      FileWriter fr = null;
      try {
         file = new File(filename);
         fr = new FileWriter(file, true);
      } catch (IOException ioe) {
         System.out.println("new_record: Exception opening the file for writing");
      }
      try {
         fr.write(output);
         fr.write("\n");
      } catch (IOException ioe) {
         System.out.println("new_record: Exception writing to the file");
      }
      try {
         fr.close();
      } catch (IOException ioe) {
         System.out.println("new_record: Exception closing the file");
      }
   }

   public void display_names() {
      BufferedReader br = null;
      try {
         br = new BufferedReader(new FileReader(filename));
      } catch (IOException ioe) {
         System.out.println("display_names: Exception opening the file");
      }
      int counter = 0;
      try {
         String line = br.readLine();
         while (line != null) {
            ++counter;
            System.out.println(line);
            line = br.readLine();
         }
      } catch (IOException ioe) {
         System.out.println("display_names: Exception reading the file");
      }
      try {
         br.close();
      } catch (IOException ioe) {
         System.out.println("display_names: Exception closing the file");
      }
      System.out.println("Total Records Read: " + counter);
   }

   public void search(String LastName) {
      BufferedReader br = null;
      try {
         br = new BufferedReader(new FileReader(filename));
      } catch (IOException ioe) {
         System.out.println("search: Exception opening the file");
      }
      int counter = 0;
      try {
         String line = br.readLine();
         while (line != null) {
            String parts[] = line.split(",");
            if (parts[0].equals(LastName)) {
               System.out.println(line);
               ++counter;
            }
            line = br.readLine();
         }
      } catch (IOException ioe) {
         System.out.println("search: Exception reading the file");
      }
      try {
         br.close();
      } catch (IOException ioe) {
         System.out.println("search: Exception closing the file");
      }
      System.out.println("Total Matching Records Found: " + counter);
   }
}