import java.util.Scanner;
class thePressureIsBuilding {
  Boolean goodPressure = true;

  public thePressureIsBuilding() {
    Scanner input = new Scanner(System.in);
    System.out.println("Input right front pressure:");
    int frontRight = input.nextInt();
    System.out.println(frontRight);
    if (frontRight < 35)
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input left front pressure:");
    int frontLeft = input.nextInt();
    if (frontLeft < 35 || frontLeft > 45)
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input right rear pressure:");
    int rearRight = input.nextInt();
    if (rearRight < 35 || rearRight > 45)
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }
    System.out.println("Input left rear pressure:");
    int rearLeft = input.nextInt();
    if (rearLeft < 35 || rearLeft > 45)
    {
      goodPressure = false;
      System.out.println("Warning: pressure is out of range");
    }

    if (Math.abs(frontRight - frontLeft) <= 3 && Math.abs(rearRight - rearLeft) <= 3 && goodPressure) {
      System.out.println("Inflation is ok");
    } else {
      System.out.println("Inflation is BAD");
    }
  }
}