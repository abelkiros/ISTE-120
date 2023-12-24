import java.util.*;

public class DetermineMagicSquare {

  static ArrayList<Integer> numbers = new ArrayList<>();

  public void add(int i) {

    // this is just adding integers to the arraylist

    numbers.add(i);

  }

  public boolean isSquare() {

    // determines if the arraylist can form a square

    // by multiplying 1 to N size of arraylist by itself

    // if the number * number is equal to the size of arraylist

    // then it can form a square

    for (int i = 0; i < numbers.size(); i++) {

      if ((i * i) == numbers.size()) {

        return true;

      }

    }

    return false;

  }

  public boolean isUnique() {

    // just compare each and every number to other numbers in the arraylist

    for (int i = 0; i < numbers.size(); i++) {

      for (int j = i; j < numbers.size() - 1; j++) {

        if (numbers.get(i) == numbers.get(j + 1)) {

          return false;

        }

      }

    }

    return true;

  }

  public boolean isMagic() {

    int N = 0;

    // get the N for n*n matrix

    for (int i = 0; i < numbers.size(); i++) {

      if ((i * i) == numbers.size()) {

        N = i;

      }

    }

    // this is the 2-D array

    System.out.println(N);

    int[][] square = new int[N][N];

    int k = 0;

    // put all the numbers in the arraylist to the 2-D matrix

    for (int i = 0; i < N; i++) {

      for (int j = 0; j < N; j++) {

        square[i][j] = numbers.get(k);

        k++;

      }

    }

    // calculate the sum of

    // the prime diagonal

    int sum = 0, sum2 = 0;

    for (int i = 0; i < N; i++) {

      sum = sum + square[i][i];

    }

    // the secondary diagonal

    for (int i = 0; i < N; i++) {

      sum2 = sum2 + square[i][N - 1 - i];

    }

    if (sum != sum2) {

      return false;

    }

    // For sums of Rows

    for (int i = 0; i < N; i++) {

      int rowSum = 0;

      for (int j = 0; j < N; j++)

        rowSum += square[i][j];

      // check if every row sum is

      // equal to prime diagonal sum

      if (rowSum != sum) {

        return false;

      }

    }

    // For sums of Columns

    for (int i = 0; i < N; i++) {

      int colSum = 0;

      for (int j = 0; j < N; j++)

        colSum += square[j][i];

      // check if every column sum is

      // equal to prime diagonal sum

      if (sum != colSum) {

        return false;

      }

    }

    return true;

  }

  public static void main(String[] args) {

    Scanner r = new Scanner(System.in);

    DetermineMagicSquare det = new DetermineMagicSquare();

    do {

      System.out.print("Enter an integer(x to exit):");

      if (r.hasNextInt()) {

        det.add(r.nextInt());

      }

      else {

        if (r.next().equals("x")) {

          break;

        }

        else {

          System.out.println("Invalid data entry");

        }

      }

    } while (true);

    if (det.isSquare()) {

      System.out.println("Numbers make square. ");

      if (det.isUnique()) {

        System.out.println("Numbers are unique. ");

        if (det.isMagic()) {

          System.out.println("Yes. It is a magic square! ");

        }

        else {

          System.out.println("No. It is not a magic square ");

        }

      }

      else {

        System.out.println("Numbers are not unique. Stopped. ");

      }

    }

    else {

      System.out.println("Numbers does not make square. Stopped. ");

    }

  }

}