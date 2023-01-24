import java.util.Scanner;
class moreTirePressure {
  Boolean goodPressure = true;

  public moreTirePressure() {
    Scanner input = new Scanner(System.in);
    System.out.println("Input right front pressure:");
    int frontRight = input.nextInt();
    if (frontRight < 35 || frontRight > 45)
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input left front pressure:");
    int frontLeft = input.nextInt();
    if (frontLeft < 35 || frontLeft > 45)
      ;
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input right rear pressure:");
    int rearRight = input.nextInt();
    if (rearRight < 35 || rearRight > 45)
      ;
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input left rear pressure:");
    int rearLeft = input.nextInt();
    if (rearLeft < 35 || rearLeft > 45)
      ;
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }

    if ((frontRight == frontLeft) && (rearRight == rearLeft) && goodPressure) {
      System.out.println("Inflation is ok");
    } else {
      System.out.println("Inflation is BAD");
    }
  }
}