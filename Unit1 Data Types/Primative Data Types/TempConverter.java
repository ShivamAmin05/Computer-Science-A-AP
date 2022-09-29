import java.util.Scanner;
class TempConverter{
  public void cToF()
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a temperature(only the number): ");
    double farenheight = userInput.nextDouble();
    double celcius = (farenheight - 32.0) * (5.0/9.0);

    System.out.println(farenheight + " degrees farenheight is equal to " + celcius + " degrees celcius");
  }
}