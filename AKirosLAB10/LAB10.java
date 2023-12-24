import java.util.Scanner;
import java.util.Random;

class LAB10 {

    public static void main(String[] args) 
    {
    //declarations
    Scanner in = new Scanner(System.in);
    Random generator = new Random();

    int [][] grid;  //un-instantiated grid
    int size = 0;  //number of rows and columns

    //get size of grid - no validation & instantiate
    System.out.print("Enter size of grid: ");
    size = in.nextInt();
    grid = new int[size][size];
    System.out.printf("\nRandom values assigned to %d by %d grid", size, size);

    //fill grid with random number from 1..99
    System.out.println();

    for (int row=0; row<size; row++) 
    {
        for (int col=0; col<size; col++) 
        {
            grid[row][col] = generator.nextInt(100); //random numbers 0.99 - not 100
        }
    }

    //STEP 3(exercise 1): print grid with formatting to align
    for (int row=0; row<size; row++) 
    {
        for (int col=0; col<size; col++) 
        {
            System.out.print("  " + grid[row][col] + "  ");
        }
        System.out.print("\n");
    }

    int rows;
    int cols;
    int sumRow;
    int sumCol;   
    rows = grid.length;   
    cols = grid[0].length; 
    System.out.print("\n");

    //STEP 4A (exercise 2): print each row sum
    System.out.println("Row   Sum");
    System.out.println("---------");

    for(int i = 0; i < rows; i++)
    {   
        sumRow = 0;   

        for(int j = 0; j < cols; j++)
        {   
            sumRow = sumRow + grid[i][j];   
        }   
        System.out.println("  " + (i+0) + "   "+ sumRow);   
    }   
 
    //STEP 4B (exercise 2): print each column sum
    System.out.println("\nCol   Sum");
    System.out.println("---------");
    for(int i = 0; i < cols; i++)
    {   
        sumCol = 0;   

        for(int j = 0; j < rows; j++)
        {   
            sumCol = sumCol + grid[j][i];   

        }   
        System.out.println("  " + (i+0) + "   "+ sumCol);      
    }   

    //STEP 5 (exercise 3): print two diagonal sums
    int primarySum = 0, secondarySum = 0; 
    for (int i = 0; i <size; i++) 
    { 
        for (int j = 0; j < size; j++) 
        { 
            // finding sum of primary diagonal 
            if (i == j)
            {
                primarySum += grid[i][j];     
            } 
            
            // finding sum of secondary diagonal 
            if (i == size - j - 1)
            {
                secondarySum += grid[i][j];
            } 
        } //end of inner loop
    }//end of outter loop
    System.out.print("\n");
    System.out.println("Diagonal from upper left to lower right is " + primarySum);
    System.out.println("Diagonal from upper right to lower left is " + secondarySum);

    }// end of main method 
    
}// end of class