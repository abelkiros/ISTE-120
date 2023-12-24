import java.util.*;

public class ComputeGpa
{
    public static void main(String[] args)
    {
        Gpa gpa = new Gpa();
        char grade;
        String input;

        while(true) {

            System.out.print("Enter grade (one character): ");
            Scanner in = new Scanner(System.in);

        input = in.nextLine();
        grade = input.charAt(0);
        System.out.println("Points: " + gpa.calcPoints(grade));

        }
    } //end of main method
}// end of class
