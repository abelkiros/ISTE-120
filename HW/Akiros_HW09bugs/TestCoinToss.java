import java.text.DecimalFormat;
import java.util.*;

public class TestCoinToss {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter integer ( >=2) coin tosses or 0 to exit: ");
			int totalToss = input.nextInt();
            
            if(totalToss<2)
			{
				break;
            }

			System.out.println();
			CoinToss ct = new CoinToss(totalToss);
			ct.computeLongestConsecutiveToss();
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println("Number of coin Tosses = "+ct.getNumberOfToss());
			System.out.println("Fraction of heads = "+df.format(ct.getFractionHead()));
			System.out.println("Fraction of tails = "+df.format(ct.getFractionTail()));
			System.out.println("Longest run is "+ct.getLongestRun()+" "+ct.getLongestRunSide());
			
		}
		System.out.println("\nEnd of Program");
	}
}