import java.util.*;

public class TestCoinToss
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer ( >=2) coin tosses or 0 to exit: ");
        int totalToss = input.nextInt();

        /**
         Instead of setting the loop to true, we want to be able to exit the loop
         change the totalToss greater than or equal to 2
         */
        while(totalToss >= 2)
        {

            CoinToss coinToss = new CoinToss(totalToss);
            coinToss.computeLongestConsecutiveToss();

            System.out.printf("\nNumber of coin Tosses = %d\nFraction of heads = %.3f\nFraction of tails = %.3f\nLongest run is %d %s\n"
                    ,coinToss.getNumberOfToss(),coinToss.getFractionHead(), coinToss.getFractionTail(), coinToss.getLongestRun(),coinToss.getLongRunType());

            System.out.print("Enter integer ( >=2) coin tosses or 0 to exit: ");
            totalToss = input.nextInt();

        }
        System.out.println("\nEnd of Program");
    }
}