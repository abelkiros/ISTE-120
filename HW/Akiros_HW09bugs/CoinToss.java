import java.util.Random;

public class CoinToss {

	private int numberOfToss;
	private char[] tossedCoin;
	private int headCount;
	private int tailCount;
	private char longestRunSide;
    private int longestRun;
    

	public CoinToss(int numberOfToss) {
		this.numberOfToss = numberOfToss;
        tossedCoin = new char[this.numberOfToss];
        Random r = new Random();
        
		for(int i=0;i<numberOfToss;i++)
		{
			double val = r.nextDouble();
			if(val <0.5)
			{
				tossedCoin[i] = 't';
				tailCount++;
			}
			else
			{
				tossedCoin[i] ='h';
				headCount++;
			}
		}
    }
    
	public int getNumberOfToss() {
		return numberOfToss;
    }
    
	public int getHeadCount() {
		return headCount;
    }
    
	public int getTailCount() {
		return tailCount;
	}
	
	
	public void computeLongestConsecutiveToss()
	{
		//int longestConsecutiveCount=0;
		//char longestToss=0;
		for(int i=0;i<numberOfToss;i++)
		{
			int cur_count = 1;
			//longestToss = tossedCoin[i];
			for (int j = i + 1; j < numberOfToss; j++) {
				if (tossedCoin[i] != tossedCoin[j])
					break;
				cur_count++;
			}


			// Update result if required
			if (cur_count > longestRun) {
				longestRun = cur_count;
				longestRunSide = tossedCoin[i];
			}
		}
	}
	public String getLongestRunSide() {
		if(longestRunSide == 'h')
		{
			return "heads";
		}
		else
		{
			return "tails";
		}
	}
	public int getLongestRun() {
		return longestRun;
	}
	
	public double getFractionTail()
	{
		return (double)((double)headCount/numberOfToss);
	}
	
	public double getFractionHead()
	{
		return (double)((double)tailCount/numberOfToss);
	}
}