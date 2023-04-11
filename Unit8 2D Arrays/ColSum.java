import java.io.*;

class ColSum {

  public static void main(String[] args) throws IOException {
    int[][] data = { { 3, 2, 5 },
        { 1, 4, 4, 8, 13 },
        { 9, 1, 0, 2 },
        { 0, 2, 6, 3, -1, -8 } };

    // declare the sum
    int maxCols = data[0].length;
    for(int i = 1; i < data.length; i++)
    {
      maxCols = Math.max(maxCols,data[i].length);
    }
    // initialize the sum
    int[] colSum = new int[maxCols];
    // compute the sums for each row
    for (int row = 0; row < data.length; row++) {
      // compute the sum for this col
      for (int col = 0; col < data[row].length; col++) {
        colSum[col] += data[row][col];
    }
  }
  // write the sum for this row
  for(int s: colSum)
    {
      System.out.println("The sum for this row is: " + s);
    }
}
}