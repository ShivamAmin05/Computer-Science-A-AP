import java.util.Scanner;
class sphereRadius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius: ");
    double radius = input.nextDouble();
    double volume = (double) Math.round( (4.0/3.0) * Math.PI * Math.pow(radius, 3) * 10000) / 10000;
    double surfaceArea = (double) Math.round(4.0 * Math.PI * Math.pow(radius, 2) * 10000) / 10000;
    System.out.println("The volume of the sphere is " + volume);
    System.out.println("The surface area of the sphere is " + surfaceArea);
  }
}