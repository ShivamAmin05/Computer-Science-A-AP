import java.util.Scanner;

  class intLimit {

    public intLimit()
    {
      double total2 = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter N:");
      int n = input.nextInt();
      for (int i = 1; i <= n; i++) {
        total2 += 1.0 / i;
      }
      System.out.println("The sum is " + total2);
    }
  
  }