import java.util.*;
import java.io.*;
public class MatrixSum
{
private static int[][] m = {{ 1, 2, 3, 4, 5},
{ 6, 7, 8, 9, 0},
{ 6, 7, 1, 2, 5},
{ 6, 7, 8, 9, 0},
{ 5, 4, 3, 2, 1}};
public static int sum( )
{
int sum = 0;
for(int r = 0; r < m.length; r++)
{
  for(int c = 0; c < m[r].length; c++)
  {
    sum += m[r][c];
  }
}
return sum;
}
}