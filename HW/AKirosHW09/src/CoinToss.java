import java.lang.*;

public class CoinToss {

    private int numberOfToss;
    private char[] resultToss;
    private int headCount;
    private int tailCount;
    private int longestRun;
    private String longRunType;

    /**
     * Use the Constructor to initialize values;
     * initialize all ints to 0
     */
    public CoinToss(int numberOfToss) {

        this.numberOfToss = numberOfToss;
        resultToss = new char[this.numberOfToss];
        headCount = 0;
        tailCount = 0;
        longestRun = 0;
    }

    /**
     * This is a good start
     */
    public void computeLongestConsecutiveToss() {
        //create a currentRun int, set = to 0
        int currentRun = 0;
        char currentResult = 'x';
      /*
         Do the first flip before entering the loop
         Use an if else statement
            if Math.random is <.5, toss[0] will be T
            else, toss[0] will be H
      */
        double val = Math.random();
        if (val < 0.5) {
            resultToss[0] = 't';
        } else {
            resultToss[0] = 'h';
        }

        for (int i = 1; i < numberOfToss - 1; i++) {

            val = Math.random();
         /*
            Use an if else statement to flip the coin
               if Math.random is <.5, toss[i] will be T, increment tails counter by 1
                  if toss[i-1] equals 'T', tempLongRun++, set longRunType String to "Tails"
               else, toss[i] will be H, increment heads counter by 1
                  if toss[i-1] equals 'H', tempLongRun++, set longRunType String to "Heads"
         */
            if (val < 0.5) {
                resultToss[i] = 't';
                tailCount += 1;

                if ( resultToss[i-1] == 't' ){

                    longRunType = "Tails";
                    longestRun++;
                }



            } else {

                resultToss[i] = 'h';
                headCount += 1;

                if ( resultToss[i-1] == 'h' ){

                    longRunType = "Heads";
                    longestRun++;
                }

            }

        }
    }
    /**
     * accessor methods
     */
    public int getLongestRun() {
        return longestRun;
    }

    public String getLongRunType() {
        return longRunType ;
    }

    public double getFractionHead() {
        return (double) ((double) headCount / (double)numberOfToss);
    }

    public double getFractionTail() {
        return (double) ((double) tailCount / (double)numberOfToss);
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
}//end of class