/**
 * ISTE 120
 * @author Abel Mengesha
 * @version HW 11
 * Desc.: A sub class undergrad inherits data from the super class
 **/
public class Undergrad extends Student
{
    private int yearLevel;
    private final double COST_PER_CREDIT_HOUR=517;

    //constructor
    public Undergrad(){
        super();
    }

    //paramaterzied constructor
    public Undergrad(String name, String id, int numCredits, int yearLevel)
    {
        super(name, id, numCredits);
        this.yearLevel = yearLevel;
    }

    //getter and setters
    public int getYearLevel() {return yearLevel;}

    public void setYearLevel(int yearLevel) {this.yearLevel = yearLevel;}

    public double calcTuition() {
        return this.getNumCredits()*COST_PER_CREDIT_HOUR;
    }

    @Override
    public String toString(){
        return "\nUndergrad Student:\n" + super.toString()+"\n\tYear Level: "+this.getYearLevel()+
                "\n\tTuition: $"+String.format("%.2f", this.calcTuition());

    }
}