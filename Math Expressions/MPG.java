import java.util.Scanner;
class MPG {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of gas used in gallons: ");
    double gasUsed = input.nextDouble();
    System.out.println("Enter the odometer value at the start of the trip(miles travled): ");
    int odoStart = input.nextInt();
    System.out.println("Enter the odometer value at the end of the trip(miles travled): ");
    int odoEnd = input.nextInt();

    double milesPerGallon = (odoEnd - odoStart) / gasUsed;

    System.out.println("The miles per gallon is equal to " + milesPerGallon);
  }
}