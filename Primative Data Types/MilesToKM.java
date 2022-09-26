import java.util.Scanner;
class MilesToKM{
  public void mToKM()
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a distance in miles(only the number): ");
    float miles = userInput.nextFloat();
    float kilometers = miles * 1.60935f;

    System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
  }
}