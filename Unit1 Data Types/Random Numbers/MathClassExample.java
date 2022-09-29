import java.util.Scanner;

class MathClassExample {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Examples of using Math class methods:\n");

    System.out.println("Example of absolute value:");
    System.out.print("Enter a negative whole number and a negative num with decimal: ");
    int num1 = Math.abs(input.nextInt());
    System.out.println("Absolute value is: " + num1);
    double num2 = Math.abs(input.nextDouble());
    System.out.println("Absolute value is: " + num2);

    System.out.println("\n\nExample of using pow and sqrt math class methods: \n");

    System.out.println("Enter a number and the power you want to raise it: ");
    int base = input.nextInt();
    int exponent = input.nextInt();
    System.out.println(base + " raise to the " + exponent + " is " + (int)Math.pow(base, exponent));
    
    

    
  }
}