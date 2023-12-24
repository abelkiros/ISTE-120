class Gpa
{
	private int credits[];
	private String grades[];
	private int numCourses;
	private int maxCourses;
    
    public Gpa(int maxCourse)
	{
		this.maxCourses = maxCourse;
		credits = new int[this.maxCourses];
		grades = new String[this.maxCourses];
		numCourses =0;
	}
	
	public void addCourse(int credit, String grade)
	{
		credits[numCourses] = credit;
		grades[numCourses] = grade;
		numCourses++;
	}
	
	public double calcGPA()
	{
		int totalCredithours=0;
		int totalPoints=0;
		for(int i=0;i<numCourses;i++)
		{
			int numGrade =0;
			if(grades[i].equalsIgnoreCase("A"))
			{
				numGrade = 4;
			}
			else if(grades[i].equalsIgnoreCase("B"))
			{
				numGrade = 3;
			}
			else if(grades[i].equalsIgnoreCase("C"))
			{
				numGrade = 2;
			}
			else if(grades[i].equalsIgnoreCase("D"))
			{
				numGrade = 1;
			}
			else if(grades[i].equalsIgnoreCase("F"))
			{
				numGrade = 0;
			}
			else
			{
				return 0.0;
			}
			
			totalCredithours = totalCredithours + credits[i];
			totalPoints = totalPoints + credits[i]*numGrade;
		}
		return (double)totalPoints/totalCredithours;
	}
}