class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    int hoursWorked;    
    double payRate;
    double taxRate;    
    
    hoursWorked = 40;
    payRate = 10.0;
    taxRate = 0.10;
    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}

/*
Modify it so that each variable is declared by itself and is not initialized. Next write three assignment statements to assign a value to each variable. Run the program; examine the output.

Now let's break something: Remove one of the declarations from the program. Can you compile/ run it?

The program does not run

Now remove one of the initializations from the correct program. (For example, delete the characters "= 40" from the first declaration. Try to compile/ run the program. When is a problem detected?

A problem is detected when there is no value in front of the equals sign
*/

