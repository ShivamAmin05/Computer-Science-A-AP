import java.util.Scanner;
class triangleArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of the first side of the triangle: ");
    double firstLength = input.nextDouble();
    System.out.println("Enter the length of the second side of the triangle: ");
    double secondLength = input.nextDouble();
    System.out.println("Enter the length of the third side of the triangle: ");
    double thirdLength = input.nextDouble();

    double s = (firstLength + secondLength + thirdLength) / 2.0;

    double area = (double) Math.round(Math.sqrt(s * (s-firstLength) * (s-secondLength) * (s-thirdLength)) * 1000) / 1000;

    System.out.println("The area of the triangle is " + area + " units squared");
  }
}