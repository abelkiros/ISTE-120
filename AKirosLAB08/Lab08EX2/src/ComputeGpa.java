import java.util.*;

public class ComputeGpa
{
    public static void main(String[] args)
    {
        Gpa gpa = new Gpa();
        char grade;
        String input;
        int credits;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter grade (one character): ");
            Scanner in = new Scanner(System.in);

        input = in.nextLine();
        grade = input.charAt(0);
        //System.out.println("Points: " + gpa.calcPoints(grade));

        System.out.print("Enter credits: ");
        credits = in.nextInt();
        gpa.addToTotals(grade, credits);
        System.out.printf("Sum Points: %d  Sum Credits: %d\n", gpa.getSumWeightedPoints(), gpa.getSumCredits());
        }

        System.out.printf("\nGPA: %.2f", gpa.calcGpa());

    } //end of main method
}// end of class


