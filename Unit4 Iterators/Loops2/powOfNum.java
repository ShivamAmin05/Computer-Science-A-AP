import java.util.Scanner;
class powOfNum {
  public powOfNum()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter X: ");
    double x = input.nextDouble();
    System.out.println("Enter N: ");
    int n = input.nextInt();
    while(n < 0)
      {
        System.out.println("N must be a positive integer");
        System.out.println("Enter N: ");
        n = input.nextInt();
      }
    Double powOfNum = Math.pow(x,n);
    System.out.println(x + " raised to the " +  n + "power is " + powOfNum);
  }
}