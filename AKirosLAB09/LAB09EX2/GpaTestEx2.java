import java.util.*;

public class GpaTestEx2
{

	public static void main (String[] args)
	{
		//declarations
		Scanner in = new Scanner(System.in); //input object
		int numCourses;	//number of courses - can be changed
		int credits;		//number of credits for a course
		String grade;		//grade for course
		
		
		//read in number of courses
		System.out.print("Enter number of courses: ");
		numCourses = in.nextInt();
		
		//create Gpa object to hold specified number of courses
		Gpa myGPA = new Gpa(numCourses);
				
		//read in all courses and add course information to Gpa object
		for (int k=0; k<numCourses; k++)
		{
			System.out.print("Enter credits for course " + (k+1) + ": ");
			credits = in.nextInt();
			System.out.print("Enter grade for course " + (k+1) + ": ");
			grade = in.next();
			
			myGPA.addCourse(credits, grade);
		}
		
		//print results
		System.out.println();
		System.out.printf("GPA is %4.2f%n", myGPA.calcGPA()); 

	} //end main

	public static int letterToNumeric(char letterGrade)
	{
		if(letterGrade == 'A' || letterGrade == 'a')
			return 4;
		if(letterGrade == 'B' || letterGrade == 'b')
			return 3;
		if(letterGrade == 'C' || letterGrade == 'c')
			return 2;
		if(letterGrade == 'D' || letterGrade == 'd')
			return 1;
		else 
			return 0;
	}
		
}