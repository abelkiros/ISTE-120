import java.util.*;

public class HowHealthy
{
    public static void main(String args[])
    {
        //create Scanner
        Scanner input = new Scanner(System.in);
        String name;
        char gender;
        double weight;
        double height;
        int age;
        int activityLevel;


        //get user input
        System.out.print("Person's name: ");
        name = input.nextLine();

        System.out.printf("%s, are you male or female (M/F): ", name);
        gender = input.next().charAt(0);

        System.out.printf("%s's weight (pounds): ", name);
        weight = input.nextDouble();

        System.out.printf("%s's height (inches): ", name);
        height = input.nextDouble();

        System.out.printf("%s's age (years): ", name);
        age = input.nextInt();

        System.out.printf("Activity Level: Use these categories: " +
                        "\n\t1 - Sedentary (little or no exercise, desk job)" +
                        "\n\t2 - Lightly active (light exercise, desk job" +
                        "\n\t3 - Moderately active (moderate exercise/sports 1-3 days/wk)"+
                        "\n\t4 - Very active (hard exercise/sports 6-7 days/wk)"+
                        "\n\t5 - Extra active (hard daily exercise/sports & physical job or 2X day training, i.e " +
                        "marathon, contest etc.)");

        System.out.print("\nHow active are you? ");
        activityLevel = input.nextInt();

        //create healthy object and print out info using accessors
        Healthy healthy = new Healthy(name, gender, weight, height, age, activityLevel);

        System.out.printf("%n%s's information \nWeight: %.1f pounds \nHeight: %.1f inches \nAge : \t%d years" ,
                healthy.getName(), healthy.getWeight(), healthy.getHeight(), healthy.getAge());

        //returns persons gender
        if(Healthy.whichGender(gender)){
            System.out.println("\nThese are for a male.");
        }
        else{
            System.out.println("\nThese are for a female.");
        }

        //returns personal bmi
        if(Healthy.calcBMI(weight, height)){
            System.out.println("\nYour BMI classifies you as underweight.");
        }
        else if (Healthy.calcBMI(weight, height)){
            System.out.println("\nYour BMI classifies you as normal weight.");
        }
        else if (Healthy.calcBMI(weight, height)){
            System.out.println("\nYour BMI classifies you as overweight.");
        }
        else{
            System.out.println("\nYour BMI classifies you as overweight.");
        }
    }
}