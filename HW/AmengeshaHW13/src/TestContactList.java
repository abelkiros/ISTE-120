import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.InputMismatchException;
public class TestContactList {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //we create an object 
        ContactList cl = new ContactList("MyAddressBook.txt");
        String firstname = "";
        String lastname = "";
        String phone = "";
        try{
            do{
                System.out.println("1) Search the file for a last name ");
                System.out.println("2) Display all last & first names in file");
                System.out.println("3) Add a new record to the file ");
                System.out.println("4) End the program ");
                System.out.print("Please choose 1 - 4: ");
                int choice = reader.nextInt();
                reader.nextLine();
                switch(choice){
                    case 1:
                        System.out.print("Enter a last name to search: ");
                        lastname = reader.nextLine();
                        cl.search(lastname);
                        break;
                    case 2:
                        cl.displayAll();
                        break;
                    case 3:
                        System.out.print("Enter first name: ");
                        firstname = reader.nextLine();
                        do{
                            System.out.print("Enter lastname: ");
                            lastname = reader.nextLine();
                            if(!lastname.isEmpty()){
                                break;
                            }
                        }while(true);
                        System.out.print("Enter phone number: ");
                        phone = reader.nextLine();

                        String line = lastname + "," +firstname+ "," +phone;
                        cl.addNewRecord(line);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }

            }while(true);
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }

}