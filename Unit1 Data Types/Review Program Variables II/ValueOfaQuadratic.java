
class ValueOfaQuadratic {
  public static void quadratic(double xVal)
  {
    double x = xVal;
    double result;
    result = (3*Math.pow(x, 2))-(8*x)+4;
    System.out.println("At X = " + x + " The value is " + result);
  }

  public static void main(String[] args)
  {
    quadratic(0.0);
    quadratic(2.0);
    quadratic(4.0);
    
  }
}
/*
Run the program with several values for X (edit the program for each value of X) and examine the result. Use values with decimal points, large values, small values, negative values, and zero. Solve the equation with paper and pencil (use the quadradic formula.) The quadradic should evaluate to zero at X = 2.0 and at X = 2/3. Try these values for X. Are the results exactly correct?

The results are exactly correct for 2.0 but not 2/3. when x = 2/3 result = 4 but when x = 0.666666666666666 result = 0. The program works with negative and large numbers.
*/