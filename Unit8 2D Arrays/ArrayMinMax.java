import java.io.* ;

class ArrayMinMax
{

  public static void main ( String[] args ) throws IOException
  {
    int[][] data = { {3, 2, 5},
                   {1, 4, 4, 8, 13},
                   {9, 1, 0, 2},
                   {0, 2, 6, 3, -1, -8} };
    
    // declare the max and the min
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    // compute the sum
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        max = Math.max(max, data[row][col]);
        min = Math.min(min, data[row][col]);
      }
    }
      
    // write out the results
    System.out.println("The maximum value in the array is: " + max);
    System.out.println("The minimum value in the array is: " + min);

  }
}      