public class Main {
  public static void main(String[] args) {
    // Make NO CHANGES to the main method
    System.out.println("Welcome to the ACSL Post Office");
    // Try the following test cases
    postageClass(4, 4, 0.009);
    postageClass(5, 7, 0.013);
    postageClass(5, 7, 0.2);
    postageClass(10, 12, 0.4);
    postageClass(10, 12, 30);
    postageClass(0, 0, 0);
  }

public static void postageClass(double length, double height, double 
thickness) {
// Write your code here to determine the postage class
//  and print out the inputs and results to the console.
// Use the variables length, height, and thickness as described
// NOTE: you do NOT have to declare the variables as they are 

// start of your code
  String indent = "                         ";
  String inputs = (length + ", " + height + ", " + thickness + "   ");
  inputs += indent.substring(0, indent.length() - inputs.length());
  System.out.print(inputs);
  if(length >= 3.5 && length <= 4.25 && height >= 3.5 && height <= 6.5 && thickness >= 0.007 && thickness <= 0.016)
  {
    System.out.println("regular post card");
  }
  else if(length >= 4.25 && length <= 6.0 && height >= 6.0 && height <= 11.5 && thickness >= 0.007 && thickness <= 0.016)
  {
    System.out.println("large post card");
  }
  else if(length >= 3.5 && length <= 6.125 && height >= 5.0 && height <= 11.5 && thickness >= 0.016 && thickness <= 0.25)
  {
    System.out.println("envelope");
  }
  else if(length >= 6.125 && length <= 24.0 && height >= 11.0 && height <= 18.0 && thickness >= 0.25 && thickness <= 0.5)
  {
    System.out.println("large envelope");
  }
  else if((length * 2) + (thickness * 2) + height <= 84.0)
  {
    System.out.println("package");
  }
  else if((length * 2) + (thickness * 2) + height >= 84.0 && (length * 2) + (thickness * 2) + height <= 130.0)
  {
    System.out.println("large package");
  }
  else
  {
    System.out.println("unmailable");
  }
// end of your code
}
}