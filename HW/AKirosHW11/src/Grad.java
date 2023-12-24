/**
 * ISTE 120
 * @author Abel Mengesha
 * @version
 * Desc.: A sub class undergrad inherits data from the super class
 **/
public class Grad extends Student
{
    //attributes
    private String researchArea;
    private final double COST_PER_CREDIT_HOUR = 713;


    //mutator and accessor
    public String getResearchArea(){return researchArea;}
    public void setResearchArea(String researchArea) {this.researchArea = researchArea;}

    public double calcTuition(){return this.getNumCredits()*COST_PER_CREDIT_HOUR;}

    @Override
    public String toString()
    {
        return "\nGrad Student:\n"+ super.toString()+"\n\tResearch Area: "+this.getResearchArea()
                +"\n\tTuition: $"+String.format("%.2f", this.calcTuition());
    }
}