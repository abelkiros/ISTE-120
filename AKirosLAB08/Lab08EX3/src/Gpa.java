import java.util.Scanner;

class GPA {

    private int sumCredits;
    private int sumWeightedpoints;


    public GPA() {
        sumCredits = 0;
        sumWeightedpoints = 0;
    }

    public void addToTotals(char letterGrade, int credits) {
        sumCredits += credits;
        sumWeightedpoints += credits * calcPoints(letterGrade);
    }

    public double calcGpa() {
        return (float) sumWeightedpoints / sumCredits;
    }

    public int getSumCredits() {
        return sumCredits;
    }

    public int getSumWeightedPoints() {
        return sumWeightedpoints;
    }

    public int calcPoints(char grade) {

        char gradeLetter = Character.toUpperCase(grade);

        switch (gradeLetter) {

            case 'A':

                return 4;

            case 'B':

                return 3;

            case 'C':

                return 2;

            case 'D':

                return 1;

            case 'F':

                return 0;

            default:

                return -1;

        }

    }//wend of method
}// end of class