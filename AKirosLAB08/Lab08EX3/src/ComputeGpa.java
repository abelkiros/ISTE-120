import java.util.*;

public class ComputeGpa
{
    public static void main(String[] args)
    {
        GPA gpa = new GPA();
        char grade = ' ';
        String input;
        int credits = 0 ;
        boolean flag;
        int courses;


        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter the number of courses: ");

        courses = scanner.nextInt();

        flag = false;

        while (flag == false) {

            if (courses > 0)
                flag = true;
            else {
                System.out.print("Invalid number of courses - must be greater than 0 ");
                System.out.print("\nEnter number of courses: ");
                courses = scanner.nextInt();
            }
        }
        for (int i = 0; i < courses; i++) {

            flag = false;

            scanner. nextLine(); // to clean the buffer

            System.out.print("Enter grade (one character): ");



            while (flag == false) {

                input = scanner. nextLine();

                if ( input.length() != 1) {

                    System.out.print("Invalid grade - must enter exactly one letter");

                } else {

                    grade = input.charAt(0);

                    if (gpa.calcPoints(grade) == -1) {

                        System.out.print("Invalid grade - must enter A,B,C, D, F (upper of lower case)");

                    } else {

                        flag = true;
                    }
                }
            }

            flag = false;

            System.out.print("Enter the number of credits: ");

            while ( flag == false) {

                credits = scanner.nextInt();

                if (credits > 0 && credits <10) {

                    flag = true;

                } else {

                    System.out.print("Enter the number of credits between 1-9: ");

                }
            }
            gpa.addToTotals(grade, credits);
        }

        System.out.printf("%.2f", gpa.calcGpa());

    }// end of main
}// end of class