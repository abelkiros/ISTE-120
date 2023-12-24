/**
 * ISTE 120
 * @author Abel Mengesha
 * @version
 * Desc.: A parent class Student
 **/
class Student
{
    protected String name;
    protected String id;
    protected int numCredits;

    //Default constructor
    public Student()
    {
        name="";
        id="";
        numCredits=0;
    }

    //Parameterised Constructor
    public Student(String name, String id, int numCredits){
        this.name = name;
        this.id = id;
        this.numCredits = numCredits;
    }

    //mutator methods 
    public String getName() {return name;}

    public String getId() {return id;}

    public int getNumCredits() {return numCredits;}

    //accessor 
    public void setName(String name) {this.name = name;}

    public void setId(String id){this.id = id;}

    public void setNumCredits(int numCredits){this.numCredits = numCredits;}

    @Override
    public String toString(){
        return "\tName: " + this.getName() + "\n\tId: " + this.getId() + "\n\tCredits: " + this.getNumCredits();
    }

} // end of student class 