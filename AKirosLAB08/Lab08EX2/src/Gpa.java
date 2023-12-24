public class Gpa {

    //attributes
    private int sumCredits;
    private int sumWeightedpoints;

    //constructor
    public Gpa()
    {
        sumCredits = 0;
        sumWeightedpoints = 0;
    }

    //method addToTotals
    public void addToTotals(char letterGrade, int credits) {
        sumCredits += credits;
        sumWeightedpoints += credits*calcPoints(letterGrade);

    }// end of the method

    //method calcGpa
    public double calcGpa() {
        return (float) sumWeightedpoints/sumCredits;
    }

    //Accessor methods
    public int getSumCredits() { return sumCredits; }

    public int getSumWeightedPoints() { return sumWeightedpoints;}


    public int calcPoints(char grade) {

        int point;

        switch(grade){

            case 'A':
                point = 4;
                break;
            case 'a':
                point = 4;
                break;
            case 'B':
                point = 3;
                break;
            case 'b':
                point = 3;
                break;
            case 'C':
                point = 2;
                break;
            case 'c':
                point = 2;
                break;
            case 'D':
                point = 1;
                break;
            case 'd':
                point = 1;
                break;
            case 'F':
                point = 0;
                break;
            case 'f':
                point = 0;
                break;
            default:
                point = -1;
                break;
        }
        return point;
    }//wend of method

}//end of class
