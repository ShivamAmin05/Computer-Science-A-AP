import java.util.Scanner;

class checkCharge {
  public checkCharge() {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the balance in your checking account?");
    double checkBal = input.nextDouble();
    System.out.println("What is the balance in your savings account?");
    double saveBal = input.nextDouble();
    if (checkBal >= 1000 || saveBal >= 1500) {
      System.out.println("There is no service charge");
    } else {
      System.out.println("There is a $0.15 service charge per check");
    }
  }
}