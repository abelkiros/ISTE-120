import java.util.*;

public class Gpa
{
	public static int letterToNumeric(char letterGrade) // transforms grade in letter to numeric upper or lower case  
	{

        if(letterGrade == 'A' || letterGrade == 'a')
        {
            return 4;
        }

        if(letterGrade == 'B' || letterGrade == 'b')
        {
            return 3;
        }

        if(letterGrade == 'C' || letterGrade == 'c')
        {
            return 2;
        }

		if(letterGrade == 'D' || letterGrade == 'd')
        {
            return 1;
        }
			
		if(letterGrade == 'F' || letterGrade == 'f')
        {
            return 0;
        }
                 
    return 0;

	}
    public static void main(String ar[]) // Main
	{
		Scanner sc = new Scanner(System.in); //initialization keyboard input 

		double[] credits = new double[4]; 

		String[] grades = new String[4];

		double credit_sum = 0;

		double grade_sum = 0;


		for(int i = 0;i<credits.length;i++)//for for to go through the array credits and grades
		{
			int temp = i+1; 

			System.out.print("Enter credits for course " + temp + ": "); //asking credits and grades to the user placing on arrays credits[] and grades

			credits[i] = sc.nextDouble();//input a double

			System.out.print("Enter grades for course " + temp + ": ");

			grades[i] = sc.next();//input grades in letters as string

		}

		for(int i=0;i<credits.length;i++)// for to go through the array credits
		{
			credit_sum += credits[i];//sum of all the credits (2)

			int grade_num = letterToNumeric(grades[i].charAt(0)); //letters to num require a char transform grades[i].charAt(0)

			double temp = credits[i] * grade_num; //multiplies credits in num by grades to calculate average I guess

			grade_sum += temp; //sum(3)

		}

		double gpa = grade_sum / credit_sum; //average (3) (2)

		gpa = Math.round(gpa * 100) / 100.0;//base 100

        System.out.println("\nTotal number of credits: "+(int)credit_sum ); //print credits sum

        System.out.println("Total number of points: "+(int)grade_sum ); //print points 

         
        if(gpa > 0 && gpa <= 4)     //gpa must be between 0 and 4 
        { 
            System.out.printf("GPA is : %.2f", gpa);//gpa to 2 decimals
            System.out.print("\n");
        }
        else{

            gpa=0;//else has to be 0

            System.out.printf("GPA is : %.2f", gpa);
            System.out.print("\n");
        }

	}
}