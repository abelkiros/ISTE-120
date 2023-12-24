import java.lang.*;
/**
 * ISTE 120 - 
 * @author 
 * @version 
 * Desc.: A class to see how healthy someone is, based off their BMI, BMR, and TDEE
 **/
public class Healthy
{
    //instance variables
    private String name;
    private String gender;
    private String out;
    private String out1;
    private double weight;
    private double height;
    private int age;
    private int activityLevel;
    private double bmr;
    private double tdee;
    private double convertedWeight;
    private double convertedHeight;
    private double CONVERSION_FACTOR1 = 2.205;
    private double CONVERSION_FACTOR2 = 2.54;
 

    /**
     * Default Constructor
       Initilizing variables to null and 0 values 
     */
    public Healthy()
    {
        name = null;
        gender = null;
        weight = 0;
        height = 0;
        age = 0;
        activityLevel = 0;
    }//end of constructor
    
    //this mutator sets the name 
    public boolean setName(String _name){
      if(_name.length() >= 1 || _name.length() > 0 ){
         name = _name;
         return true;
      }
      else {
         return false;
      }
    }// end of method set name 
    
    // setter for gender
    public boolean setGender(String _gender){
      
      if(_gender.equalsIgnoreCase("M") || _gender.equalsIgnoreCase("F")){
         gender = _gender;
         return true;
      } 
      else {
         return false;
      }
    
    }// end setGender()
    
    public boolean setWeight(double _weight){
      
      if(_weight >= 100){
         weight = _weight;
         return true;
      }
      else {
         return false;
      }
    
    }// end setWeight()
    
    
    public boolean setHeight(double _height){
      
      if(_height > 59 && _height < 85){
         height = _height;
         return true;
      }
      else {
         return false;
      }
    
    }// end setHeight()
    
    
    public boolean setAge(int _age){
      
      if(_age >= 18){
         age = _age;
         return true;
      }
      else {
         return false;
      }
    
    }// end setAge()
    
    
    //activity 
    public boolean setActivityLevel(int _activityLevel){
      
      if(_activityLevel >= 1 && _activityLevel <= 5){
         activityLevel = _activityLevel;
         return true;
      }
      else {
         return false;
      }
    
    }// end setActivityLevel()
    
     
    
    /**
     * Accessor for name
     * @return the attribute name
     */
    public String getName(){return name;}

    /**
     * Accessor for gender
     * @return the attribute
     */
     
    //accessor allows us to see what gender equals 
    public String getGender(){
      if(gender.equalsIgnoreCase("F")){
         out1 = "These stats are for a female.";
      }
      else if(gender.equalsIgnoreCase("M")){
         out1 = "These stats are for a male.";
      }
      return out1;
    }//end getGender()
    

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
    
    //method that converts weight from lbs to kilos 
    private double convertWeight(){
      convertedWeight = weight / CONVERSION_FACTOR1;
      return convertedWeight;
    }//end of convertWeight()
    
    
    //method that converts height from inches to cm 
    private double convertHeight(){
      convertedHeight = height * CONVERSION_FACTOR2;
      return convertedHeight;
    }//end of convertHeight()

    //this method will calculate BMR, after intaking their converted weight, height, gender, age
    public double calculateBMR(){
      if(gender.equalsIgnoreCase("F")){
         bmr = 655 + (9.6 * convertWeight()) + (1.8 * convertHeight()) - (4.7* age);
      }
      else if(gender.equalsIgnoreCase("M")){
         bmr = 66 + (13.7 * convertWeight()) + (5 * convertHeight()) - (6.8 * age);
      }
      return bmr;
    
    }//end of bmr 
    
    //calculate bmi of the user input 
    public double calculateBMI(){
      double bmi = ((weight) / Math.pow(height, 2)) * 703;
      return bmi;
    }// end of calculateBMI()
    
    // this method will calculate a person's TDEE, after intaking a person's activity level 
    public double calculateTDEE(){
      switch(activityLevel){
         case 1:
            tdee = bmr * 1.2;
            break;
         case 2:
            tdee = bmr * 1.375;
            break;
         case 3:
            tdee = bmr * 1.55;
            break;
         case 4:
            tdee = bmr * 1.725;
            break;
         case 5:
            tdee = bmr * 1.9;
            break;
      }
      return tdee;
    }//end calculateTDEE()
    
    //method to output weight classification 
    public String classification(){
    
      if (calculateBMI() < 18.5){
         out = "Your BMI classifies you as Underweight.";
      }
      else if (calculateBMI() >= 18.5 && calculateBMI() < 25){
         out = "Your BMI classifies you as Normal Weight.";
      }
      else if(calculateBMI() >= 25 && calculateBMI() < 30){
         out = "Your BMI classifies you as Overweight";
      }
      else if (calculateBMI() >= 30){
         out = "Your BMI classifies you as Obese";
      }
      return out; 
   
    }// end of classification
    
}// end of class

