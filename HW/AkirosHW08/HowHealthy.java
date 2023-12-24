import java.util.*;
/**
 * ISTE 120 -
 * @author
 * @version
 * Desc.: A class to see how healthy someone is, based off their BMI, BMR, and TDEE
 **/
public class HowHealthy
{
    public static void main(String args[])
    {
        //create Scanner
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while(answer.equalsIgnoreCase("yes"))
        {
            //create object healthy
            Healthy healthy = new Healthy();

            /*
             * Set Name
             */
            System.out.print("Person's name: ");
            String name = input.nextLine(); //get user input
            healthy.setName(name);

            while (!healthy.setName(name)) {
                System.out.println("ERROR: Name must be at least 1 character");
                System.out.print("Person's name: ");
                name = input.nextLine();
                healthy.setName(name);
            }

            /*
             * Set Gender
             */
            System.out.print(healthy.getName() + ", are you male or female (M/F): ");
            String gender = input.next();
            healthy.setGender(gender);

            while (!healthy.setGender(gender)) {
                System.out.println("ERROR: Gender must be M or F(upper or lower Case)");
                System.out.print("Enter a gender: ");
                gender = input.next();
                healthy.setGender(gender);
            }
            /*
             * Set Weight
             */
            System.out.print(healthy.getName() + "'s weight (pounds): ");
            double weight = input.nextDouble();
            healthy.setWeight(weight);

            while (!healthy.setWeight(weight)) {
                System.out.println("ERROR: Weight must be at least 100 pounds");
                System.out.print(healthy.getName() + "'s weight: ");
                weight = input.nextDouble();
                healthy.setWeight(weight);
            }

            /*
             * Set Height
             */
            System.out.print(healthy.getName() + "'s height (inches): ");
            double height = input.nextDouble();
            healthy.setHeight(height);

            while (!healthy.setHeight(height)) {
                System.out.println("ERROR: Height must be 60..84, inclusively");
                System.out.print(healthy.getName() + "'s height: ");
                height = input.nextDouble();
                healthy.setHeight(height);
            }

            /*
             * Set Age
             */
            System.out.print(healthy.getName() + "'s age (years): ");
            int age = input.nextInt();
            healthy.setAge(age);
            
            System.out.println("");

            while (!healthy.setAge(age)) {
                System.out.println("ERROR: Age must be at least 18");
                System.out.print(healthy.getName() + "'s age: ");
                age = input.nextInt();
                healthy.setAge(age);
            }

            System.out.printf("\nActivity Level: Use these categories: " +
                    "\n\t\t1 - Sedentary (little or no exercise, desk job)" +
                    "\n\t\t2 - Lightly active (light exercise, desk job" +
                    "\n\t\t3 - Moderately active (moderate exercise/sports 1-3 days/wk)" +
                    "\n\t\t4 - Very active (hard exercise/sports 6-7 days/wk)" +
                    "\n\t\t5 - Extra active (hard daily exercise/sports & physical job or 2X day training, i.e " +
                    "marathon, contest etc.)");

            /*
             * Set Activity Level
             */
            System.out.print("How active are you?: ");
            int activityLevel = input.nextInt();
            healthy.setActivityLevel(activityLevel);

            while (!healthy.setActivityLevel(activityLevel)) {
                System.out.println("ERROR: Activity Level must be 1..5, inclusively");
                System.out.print("How active are you?: ");
                activityLevel = input.nextInt();
                healthy.setActivityLevel(activityLevel);
            }
            
            System.out.println("");

            /*
             * Prints stats
             */
            System.out.printf("%n%s's information \nWeight: %.1f pounds \nHeight: %.1f inches \nAge : \t%d years\n",
                    healthy.getName(), healthy.getWeight(), healthy.getHeight(), healthy.getAge());
            System.out.println(healthy.getGender());
            System.out.println("");
               
            /*
             * Prints BMR, BMI, TDEE, and weight class
             */
            System.out.println("BMR is: " + String.format("%5.2f", healthy.calculateBMR()));
            System.out.println("BMI is: " + String.format("%5.2f", healthy.calculateBMI()));
            System.out.println("TDEE is: " + String.format("%5.2f", healthy.calculateTDEE()));
            System.out.println(healthy.classification());

            System.out.println("");

            System.out.print("Do you wish to do another calculation (Yes/No): ");
            answer = input.next();
            input.nextLine();

        }// end of while loop

    }// end of main method
}//end of main class

