class DoubleJeopardy
{
  public static void main ( String[] args )
  {
    double value = 1.7976931348623157E+308;
    System.out.println("A double: " +  value);
  }
}

/*
Question 1: Compile and run the program. Does its output (what it puts on the screen) differ from the output of the the previous exercise?

The programm outputs 32.0 instead of 32

Change the 32 to 32.0 and see if that makes a difference when you compile and run the program.

Question 2: Now try to "break" the program. Look back in this chapter at the chart of primitive data types and the range of values they can hold. Change the "32" to a value that is too big for double. You may wish to use scientific notation for this.

The biggest value a double can hold is 1.7976931348623157E+308 and the smallest value a double can hold is 2.2250738585072014E-308

Use the Internet if necessary - what is the allowed range of values for a double?
 */
