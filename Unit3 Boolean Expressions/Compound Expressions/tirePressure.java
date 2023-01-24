import java.util.Scanner;
class tirePressure {
  public tirePressure() {
    Scanner input = new Scanner(System.in);
    System.out.println("Input right front pressure:");
    int frontRight = input.nextInt();
    System.out.println("Input left front pressure:");
    int frontLeft= input.nextInt();
    System.out.println("Input right rear pressure:");
    int rearRight = input.nextInt();
    System.out.println("Input left rear pressure:");
    int rearLeft = input.nextInt();

    if( (frontRight == frontLeft) && (rearRight == rearLeft) )
    {
      System.out.println("Inflation is ok");
    }
    else
    {
      System.out.println("Inflation is not ok");  
    }
  }
}