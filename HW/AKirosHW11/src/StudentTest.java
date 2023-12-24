/**
 * ISTE 120
 * @author Abel Mengesha
 * @version
 * Desc.: Class that tests the student class
 **/
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> enrollment= new ArrayList<>();

        int choice = 1;

        while(choice!=3)
        {
            System.out.println("\nWhat type of student do you wish to enter?");
            System.out.println("\t1.Undergrad");
            System.out.println("\t2.Graduate");
            System.out.println("\t3.Done");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1)
            {
                System.out.print("Student name: ");
                String name=input.nextLine();

                System.out.print("Student id: ");
                String id=input.nextLine();

                System.out.print("Number of credits: ");
                int count=input.nextInt();

                System.out.print("Level: ");
                int level=input.nextInt();
                input.nextLine();

                //object
                Undergrad student = new Undergrad(name, id, count, level);
                enrollment.add(student);
            }
            else if(choice == 2)
            {
                System.out.print("Student name: ");
                String name = input.nextLine();

                System.out.print("Student id: ");
                String id=input.nextLine();

                System.out.print("Number of credits: ");
                int count = input.nextInt();
                input.nextLine();

                System.out.print("Research Area: ");
                String research=input.nextLine();

                //object
                Grad student1 = new Grad();
                student1.setId(id);
                student1.setName(name);
                student1.setNumCredits(count);
                student1.setResearchArea(research);
                enrollment.add(student1);
            }
        }
        //for each loop
        for(Student s:enrollment)
        {
            System.out.println(s);
        }
    }
}//end of class