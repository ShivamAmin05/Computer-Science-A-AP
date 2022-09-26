import java.util.Scanner;
class DistanceXY {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first x coordinate: ");
    double xCordOne = input.nextDouble();
    System.out.println("Enter your first y coordinate: ");
    double yCordOne = input.nextDouble();
    System.out.println("Enter your second x coordinate: ");
    double xCordTwo = input.nextDouble();
    System.out.println("Enter your second y coordinate: ");
    double yCordTwo = input.nextDouble();

    double distance = Math.sqrt(Math.pow(xCordTwo-xCordOne, 2) + Math.pow(yCordTwo-yCordOne, 2));
    System.out.println("The distance between the two points is " + distance);
  }
}