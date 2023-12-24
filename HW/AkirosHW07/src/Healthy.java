import java.lang.*;

public class Healthy
{
    //instance variables
    private String name;
    private char gender;
    private double weight;
    private double height;
    private int age;
    private int activityLevel;
    private double CONVERSION_FACTOR1 = 0.0;
    private double CONVERSION_FACTOR2 = 0.0;
    private double calcBMI = 0.0;

    /**
     * Default Constructor
     */
    public Healthy()
    {
        name = "Unknown";
        gender = 'S';
        weight = 0.00;
        height = 0.00;
        age = 0;
        activityLevel = 0;
    }

    /**
     * Parameterized Constructor
     * @param name  The name of the person
     * @param gender The gender of the person
     * @param weight The weight of the person
     * @param height The height of the person
     * @param age The age of the person
     * @param activityLevel The activity level of the person
     */
    public Healthy(String name, char gender, double weight, double height, int age, int activityLevel) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.activityLevel = activityLevel;
    }

    /**
     * Accessor for name
     * @return the attribute name
     */
    public String getName(){return name;}

    /**
     * Accessor for gender
     * @return the attribute
     */
    public char getGender(){return gender;}

    /**
     * Accessor for
     * @return the attribute
     */
    public double getWeight() {return weight;}

    /**
     * Accessor for
     * @return the attribute
     */
    public double getHeight() {return height;}

    /**
     * Accessor for
     * @return the attribute
     */
    public int getAge(){return age;}

    /**
     * Accessor for
     * @return the attribute
     */
    public int getActivityLevel() {return activityLevel;}

    /**
     * Static method to determine persons sex
     * @return True (M) or False (F)
     */
    public static boolean whichGender(char gender){

        if(gender == 'M'){
            return true;
        }
        else {
            return false;
        }
    }// end of method

    /**
     * Static method to determine persons body mass index
     * @return boolean values that will correlate to the main
     * program to print values of underweight to obese.
     */
    public static boolean calcBMI(double weight, double height){

        double bmi = ((weight)/(Math.pow(height, 2)));

        if (bmi < 18){
            return true;
        }
        else if (bmi >= 18.5 && bmi < 25){
            return true;
        }
        else if (bmi >= 25 && bmi <30){
            return true;
        }
        else return bmi >= 30;

    }// end of method

}// end of class
