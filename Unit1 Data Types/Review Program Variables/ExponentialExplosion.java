class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 1.7976931348623157E+308;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}
/*
Question 1: Does it compile and run correctly? Now change the 32 to larger and larger numbers until something goes wrong.

The program does compile and returns infinity when it gets above a certain value

Question 2: At what value does an error occur?

An error occurs at 1.7976931348623157E+309
*/